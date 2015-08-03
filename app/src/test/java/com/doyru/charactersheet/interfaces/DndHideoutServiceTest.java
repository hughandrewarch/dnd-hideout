package com.doyru.charactersheet.interfaces;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.interfaces.DndHideoutService;
import com.doryu.charactersheet.models.Spell;
import com.doyru.charactersheet.mocks.MockClient;
import com.doyru.charactersheet.mocks.MockExecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.assertions.api.Assertions.fail;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class DndHideoutServiceTest {

    @Test
    public void serviceShouldReturnSpells() throws IOException {
        MockExecutor executor = new MockExecutor();
        final CountDownLatch latch = new CountDownLatch(1);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://localhost")
                .setClient(new MockClient())
                .setExecutors(executor, executor)
                .build();

        Callback callback = new Callback<List<Spell>>() {
            @Override
            public void success(List<Spell> spells, Response response) {
                assertThat(spells).hasSize(1);
                latch.countDown();
            }

            @Override
            public void failure(RetrofitError error) {
                fail("MockClient should not fail");
            }
        };

        DndHideoutService service = restAdapter.create(DndHideoutService.class);
        service.getSpells(callback);

        assertThat(latch.getCount()).isEqualTo(0);
    }
}
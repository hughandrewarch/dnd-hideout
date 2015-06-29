package com.doyru.charactersheet;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasources.CharacterDataSource;
import com.doryu.charactersheet.models.Character;
import com.doyru.charactersheet.util.FakeDataUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class CharacterDataSourceTest {

    @Test
    public void shouldRetrieveCorrectValues() {
        CharacterDataSource dataSource = getCharacterDataSource();
        Character characterToInsert = FakeDataUtil.getCharacter();
        List<Character> characterList;
        Character expectedCharacter;

        dataSource.open();
        dataSource.createCharacter(characterToInsert);

        characterList = dataSource.getAllCharacters();
        dataSource.close();

        assertThat(characterList).isNotEmpty();

        expectedCharacter = characterList.get(0);

        // TODO fill in the rest of these in FakeDataUtil and test them
        assertThat(expectedCharacter.getId()).isEqualTo(1);
        assertThat(expectedCharacter.getName()).isNotNull().isEqualTo("Bhurgharr");
    }

    private CharacterDataSource getCharacterDataSource() {
        CharacterDataSource characterDataSource = new CharacterDataSource(CharacterSheetApplication.getAppContext());
        return characterDataSource;
    }

}

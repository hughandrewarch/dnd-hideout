package com.doyru.charactersheet.mocks;

import android.net.Uri;

import java.io.IOException;
import java.util.Collections;

import retrofit.client.Client;
import retrofit.client.Request;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

public class MockClient implements Client {
        private static final String MOCK_SPELL_RESPONSE = "[{\"id\":1,\"name\":\"Das Spell\",\"level\":9,\"range\":\"60 feet\",\"casting_time\":\"1 action\",\"duration\":\"Instantaneous\",\"school\":\"Conjuration\",\"concentration\":false,\"ritual\":true,\"components\":\"VSM\",\"materials\":\"some stuff\",\"description\":\"the description\"}]";
        private static final String MOCK_PALADIN_SPELL_RESPONSE = "[{\"id\":2,\"name\":\"Das Paladin Spell\",\"level\":9,\"range\":\"60 feet\",\"casting_time\":\"1 action\",\"duration\":\"Instantaneous\",\"school\":\"Necromancy\",\"concentration\":false,\"ritual\":true,\"components\":\"VSM\",\"materials\":\"some stuff\",\"description\":\"the description for paladins only\"}]";

        @Override
        public Response execute(Request request) throws IOException {
            Uri uri = Uri.parse(request.getUrl());

            String responseString = "";

            if(uri.getPath().equals("/api/dnd5/v1/spells")) {
                responseString = MOCK_SPELL_RESPONSE;
            } else if (uri.getPath().equals("/api/dnd5/v1/spells/paladin")) {
                responseString = MOCK_PALADIN_SPELL_RESPONSE;
            }

            return new Response(request.getUrl(), 200, "nothing", Collections.EMPTY_LIST, new TypedByteArray("application/json", responseString.getBytes()));
        }
    }
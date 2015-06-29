package com.doyru.charactersheet.util;

import com.doryu.charactersheet.models.Character;

public class FakeDataUtil {

    public static Character getCharacter() {
        Character fakeCharacter = new Character();
        fakeCharacter.setName("Bhurgharr");

        return fakeCharacter;
    }
}

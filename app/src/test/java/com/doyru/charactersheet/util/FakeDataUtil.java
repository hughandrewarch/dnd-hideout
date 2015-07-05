package com.doyru.charactersheet.util;

import com.doryu.charactersheet.models.Character;

public class FakeDataUtil {

    public static Character getCharacter() {
        Character fakeCharacter = new Character();
        fakeCharacter.setName("Bhurgharr");
        fakeCharacter.setCharacterClass(Character.CharacterClass.PALADIN);
        fakeCharacter.setRace(Character.Race.DRAGONBORN);
        fakeCharacter.setGender(Character.Gender.MALE);
        fakeCharacter.setSize(Character.Size.MEDIUM);
        fakeCharacter.setWeightInPounds(260);
        fakeCharacter.setSpeed(30);
        fakeCharacter.setVision(Character.Vision.NORMAL);
        fakeCharacter.setStrength(17);
        fakeCharacter.setDexterity(8);
        fakeCharacter.setConstitution(14);
        fakeCharacter.setIntelligence(10);
        fakeCharacter.setWisdom(12);
        fakeCharacter.setCharisma(17);
        fakeCharacter.setArmorClassNoArmor(10);
        fakeCharacter.setExperience(320);
        fakeCharacter.setTotalHitPoints(15);
        fakeCharacter.setRemainingHitPoints(14);
        fakeCharacter.setExtraHitPoints(0);

        return fakeCharacter;
    }
}

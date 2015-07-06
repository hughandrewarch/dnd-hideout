package com.doyru.charactersheet.util;

import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.Paladin;

public class FakeDataUtil {

    public static CharacterModel getCharacter() {
        CharacterModel fakeCharacter = new CharacterModel();
        fakeCharacter.setName("Bhurgharr");
//
//        Paladin paladinClass = new Paladin(fakeCharacter);
//        paladinClass.setLevel(2);
//        fakeCharacter.addCharacterClass(paladinClass);

        fakeCharacter.setRace(CharacterModel.Race.DRAGONBORN);
        fakeCharacter.setGender(CharacterModel.Gender.MALE);
        fakeCharacter.setSize(CharacterModel.Size.MEDIUM);
        fakeCharacter.setWeightInPounds(260);
        fakeCharacter.setSpeed(30);
        fakeCharacter.setVision(CharacterModel.Vision.NORMAL);
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

    public static CharacterModel getCharacterWithZeroAttributes() {
        CharacterModel fakeCharacter = new CharacterModel();
        fakeCharacter.setName("Bhurgharr");

//        Paladin paladinClass = new Paladin(fakeCharacter);
//        paladinClass.setLevel(2);
//        fakeCharacter.addCharacterClass(paladinClass);

        fakeCharacter.setRace(CharacterModel.Race.DRAGONBORN);
        fakeCharacter.setGender(CharacterModel.Gender.MALE);
        fakeCharacter.setSize(CharacterModel.Size.MEDIUM);
        fakeCharacter.setWeightInPounds(0);
        fakeCharacter.setSpeed(0);
        fakeCharacter.setVision(CharacterModel.Vision.NORMAL);
        fakeCharacter.setStrength(0);
        fakeCharacter.setDexterity(0);
        fakeCharacter.setConstitution(0);
        fakeCharacter.setIntelligence(0);
        fakeCharacter.setWisdom(0);
        fakeCharacter.setCharisma(0);
        fakeCharacter.setArmorClassNoArmor(0);
        fakeCharacter.setExperience(0);
        fakeCharacter.setTotalHitPoints(0);
        fakeCharacter.setRemainingHitPoints(0);
        fakeCharacter.setExtraHitPoints(0);

        return fakeCharacter;
    }
}

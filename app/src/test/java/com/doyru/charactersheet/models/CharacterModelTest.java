package com.doyru.charactersheet.models;

import android.util.SparseArray;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Cleric;
import com.doryu.charactersheet.models.classes.Paladin;
import com.doyru.charactersheet.util.FakeDataUtil;

import java.util.ArrayList;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class CharacterModelTest {

    @Test
    public void shouldLevelUpAtCorrectExperience() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setExperience(CharacterModel.LevelExperience.ONE);
        assertThat(character.getLevel()).isEqualTo(1);

        character.setExperience(CharacterModel.LevelExperience.TWO);
        assertThat(character.getLevel()).isEqualTo(2);

        character.setExperience(CharacterModel.LevelExperience.THREE);
        assertThat(character.getLevel()).isEqualTo(3);

        character.setExperience(CharacterModel.LevelExperience.FOUR);
        assertThat(character.getLevel()).isEqualTo(4);

        character.setExperience(CharacterModel.LevelExperience.FIVE);
        assertThat(character.getLevel()).isEqualTo(5);

        character.setExperience(CharacterModel.LevelExperience.SIX);
        assertThat(character.getLevel()).isEqualTo(6);

        character.setExperience(CharacterModel.LevelExperience.SEVEN);
        assertThat(character.getLevel()).isEqualTo(7);

        character.setExperience(CharacterModel.LevelExperience.EIGHT);
        assertThat(character.getLevel()).isEqualTo(8);

        character.setExperience(CharacterModel.LevelExperience.NINE);
        assertThat(character.getLevel()).isEqualTo(9);

        character.setExperience(CharacterModel.LevelExperience.TEN);
        assertThat(character.getLevel()).isEqualTo(10);

        character.setExperience(CharacterModel.LevelExperience.ELEVEN);
        assertThat(character.getLevel()).isEqualTo(11);

        character.setExperience(CharacterModel.LevelExperience.TWELVE);
        assertThat(character.getLevel()).isEqualTo(12);

        character.setExperience(CharacterModel.LevelExperience.THIRTEEN);
        assertThat(character.getLevel()).isEqualTo(13);

        character.setExperience(CharacterModel.LevelExperience.FOURTEEN);
        assertThat(character.getLevel()).isEqualTo(14);

        character.setExperience(CharacterModel.LevelExperience.FIFTEEN);
        assertThat(character.getLevel()).isEqualTo(15);

        character.setExperience(CharacterModel.LevelExperience.SIXTEEN);
        assertThat(character.getLevel()).isEqualTo(16);

        character.setExperience(CharacterModel.LevelExperience.SEVENTEEN);
        assertThat(character.getLevel()).isEqualTo(17);

        character.setExperience(CharacterModel.LevelExperience.EIGHTEEN);
        assertThat(character.getLevel()).isEqualTo(18);

        character.setExperience(CharacterModel.LevelExperience.NINETEEN);
        assertThat(character.getLevel()).isEqualTo(19);

        character.setExperience(CharacterModel.LevelExperience.TWENTY);
        assertThat(character.getLevel()).isEqualTo(20);
    }

    @Test
    public void checkStrengthModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setStrength(1);
        assertThat(character.getStrengthModifier()).isEqualTo(-5);

        character.setStrength(2);
        assertThat(character.getStrengthModifier()).isEqualTo(-4);

        character.setStrength(3);
        assertThat(character.getStrengthModifier()).isEqualTo(-4);

        character.setStrength(4);
        assertThat(character.getStrengthModifier()).isEqualTo(-3);

        character.setStrength(5);
        assertThat(character.getStrengthModifier()).isEqualTo(-3);

        character.setStrength(6);
        assertThat(character.getStrengthModifier()).isEqualTo(-2);

        character.setStrength(7);
        assertThat(character.getStrengthModifier()).isEqualTo(-2);

        character.setStrength(8);
        assertThat(character.getStrengthModifier()).isEqualTo(-1);

        character.setStrength(9);
        assertThat(character.getStrengthModifier()).isEqualTo(-1);

        character.setStrength(10);
        assertThat(character.getStrengthModifier()).isEqualTo(0);

        character.setStrength(11);
        assertThat(character.getStrengthModifier()).isEqualTo(0);

        character.setStrength(12);
        assertThat(character.getStrengthModifier()).isEqualTo(1);

        character.setStrength(13);
        assertThat(character.getStrengthModifier()).isEqualTo(1);

        character.setStrength(14);
        assertThat(character.getStrengthModifier()).isEqualTo(2);

        character.setStrength(15);
        assertThat(character.getStrengthModifier()).isEqualTo(2);

        character.setStrength(16);
        assertThat(character.getStrengthModifier()).isEqualTo(3);

        character.setStrength(17);
        assertThat(character.getStrengthModifier()).isEqualTo(3);

        character.setStrength(18);
        assertThat(character.getStrengthModifier()).isEqualTo(4);

        character.setStrength(19);
        assertThat(character.getStrengthModifier()).isEqualTo(4);

        character.setStrength(20);
        assertThat(character.getStrengthModifier()).isEqualTo(5);

        character.setStrength(21);
        assertThat(character.getStrengthModifier()).isEqualTo(5);

        character.setStrength(22);
        assertThat(character.getStrengthModifier()).isEqualTo(6);

        character.setStrength(23);
        assertThat(character.getStrengthModifier()).isEqualTo(6);

        character.setStrength(24);
        assertThat(character.getStrengthModifier()).isEqualTo(7);

        character.setStrength(25);
        assertThat(character.getStrengthModifier()).isEqualTo(7);

        character.setStrength(26);
        assertThat(character.getStrengthModifier()).isEqualTo(8);

        character.setStrength(27);
        assertThat(character.getStrengthModifier()).isEqualTo(8);

        character.setStrength(28);
        assertThat(character.getStrengthModifier()).isEqualTo(9);

        character.setStrength(29);
        assertThat(character.getStrengthModifier()).isEqualTo(9);

        character.setStrength(30);
        assertThat(character.getStrengthModifier()).isEqualTo(10);
    }

    @Test
    public void checkDexterityModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setDexterity(1);
        assertThat(character.getDexterityModifier()).isEqualTo(-5);

        character.setDexterity(2);
        assertThat(character.getDexterityModifier()).isEqualTo(-4);

        character.setDexterity(3);
        assertThat(character.getDexterityModifier()).isEqualTo(-4);

        character.setDexterity(4);
        assertThat(character.getDexterityModifier()).isEqualTo(-3);

        character.setDexterity(5);
        assertThat(character.getDexterityModifier()).isEqualTo(-3);

        character.setDexterity(6);
        assertThat(character.getDexterityModifier()).isEqualTo(-2);

        character.setDexterity(7);
        assertThat(character.getDexterityModifier()).isEqualTo(-2);

        character.setDexterity(8);
        assertThat(character.getDexterityModifier()).isEqualTo(-1);

        character.setDexterity(9);
        assertThat(character.getDexterityModifier()).isEqualTo(-1);

        character.setDexterity(10);
        assertThat(character.getDexterityModifier()).isEqualTo(0);

        character.setDexterity(11);
        assertThat(character.getDexterityModifier()).isEqualTo(0);

        character.setDexterity(12);
        assertThat(character.getDexterityModifier()).isEqualTo(1);

        character.setDexterity(13);
        assertThat(character.getDexterityModifier()).isEqualTo(1);

        character.setDexterity(14);
        assertThat(character.getDexterityModifier()).isEqualTo(2);

        character.setDexterity(15);
        assertThat(character.getDexterityModifier()).isEqualTo(2);

        character.setDexterity(16);
        assertThat(character.getDexterityModifier()).isEqualTo(3);

        character.setDexterity(17);
        assertThat(character.getDexterityModifier()).isEqualTo(3);

        character.setDexterity(18);
        assertThat(character.getDexterityModifier()).isEqualTo(4);

        character.setDexterity(19);
        assertThat(character.getDexterityModifier()).isEqualTo(4);

        character.setDexterity(20);
        assertThat(character.getDexterityModifier()).isEqualTo(5);

        character.setDexterity(21);
        assertThat(character.getDexterityModifier()).isEqualTo(5);

        character.setDexterity(22);
        assertThat(character.getDexterityModifier()).isEqualTo(6);

        character.setDexterity(23);
        assertThat(character.getDexterityModifier()).isEqualTo(6);

        character.setDexterity(24);
        assertThat(character.getDexterityModifier()).isEqualTo(7);

        character.setDexterity(25);
        assertThat(character.getDexterityModifier()).isEqualTo(7);

        character.setDexterity(26);
        assertThat(character.getDexterityModifier()).isEqualTo(8);

        character.setDexterity(27);
        assertThat(character.getDexterityModifier()).isEqualTo(8);

        character.setDexterity(28);
        assertThat(character.getDexterityModifier()).isEqualTo(9);

        character.setDexterity(29);
        assertThat(character.getDexterityModifier()).isEqualTo(9);

        character.setDexterity(30);
        assertThat(character.getDexterityModifier()).isEqualTo(10);
    }

    @Test
    public void checkConstitutionModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setConstitution(1);
        assertThat(character.getConstitutionModifier()).isEqualTo(-5);

        character.setConstitution(2);
        assertThat(character.getConstitutionModifier()).isEqualTo(-4);

        character.setConstitution(3);
        assertThat(character.getConstitutionModifier()).isEqualTo(-4);

        character.setConstitution(4);
        assertThat(character.getConstitutionModifier()).isEqualTo(-3);

        character.setConstitution(5);
        assertThat(character.getConstitutionModifier()).isEqualTo(-3);

        character.setConstitution(6);
        assertThat(character.getConstitutionModifier()).isEqualTo(-2);

        character.setConstitution(7);
        assertThat(character.getConstitutionModifier()).isEqualTo(-2);

        character.setConstitution(8);
        assertThat(character.getConstitutionModifier()).isEqualTo(-1);

        character.setConstitution(9);
        assertThat(character.getConstitutionModifier()).isEqualTo(-1);

        character.setConstitution(10);
        assertThat(character.getConstitutionModifier()).isEqualTo(0);

        character.setConstitution(11);
        assertThat(character.getConstitutionModifier()).isEqualTo(0);

        character.setConstitution(12);
        assertThat(character.getConstitutionModifier()).isEqualTo(1);

        character.setConstitution(13);
        assertThat(character.getConstitutionModifier()).isEqualTo(1);

        character.setConstitution(14);
        assertThat(character.getConstitutionModifier()).isEqualTo(2);

        character.setConstitution(15);
        assertThat(character.getConstitutionModifier()).isEqualTo(2);

        character.setConstitution(16);
        assertThat(character.getConstitutionModifier()).isEqualTo(3);

        character.setConstitution(17);
        assertThat(character.getConstitutionModifier()).isEqualTo(3);

        character.setConstitution(18);
        assertThat(character.getConstitutionModifier()).isEqualTo(4);

        character.setConstitution(19);
        assertThat(character.getConstitutionModifier()).isEqualTo(4);

        character.setConstitution(20);
        assertThat(character.getConstitutionModifier()).isEqualTo(5);

        character.setConstitution(21);
        assertThat(character.getConstitutionModifier()).isEqualTo(5);

        character.setConstitution(22);
        assertThat(character.getConstitutionModifier()).isEqualTo(6);

        character.setConstitution(23);
        assertThat(character.getConstitutionModifier()).isEqualTo(6);

        character.setConstitution(24);
        assertThat(character.getConstitutionModifier()).isEqualTo(7);

        character.setConstitution(25);
        assertThat(character.getConstitutionModifier()).isEqualTo(7);

        character.setConstitution(26);
        assertThat(character.getConstitutionModifier()).isEqualTo(8);

        character.setConstitution(27);
        assertThat(character.getConstitutionModifier()).isEqualTo(8);

        character.setConstitution(28);
        assertThat(character.getConstitutionModifier()).isEqualTo(9);

        character.setConstitution(29);
        assertThat(character.getConstitutionModifier()).isEqualTo(9);

        character.setConstitution(30);
        assertThat(character.getConstitutionModifier()).isEqualTo(10);
    }

    @Test
    public void checkIntelligenceModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setIntelligence(1);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-5);

        character.setIntelligence(2);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-4);

        character.setIntelligence(3);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-4);

        character.setIntelligence(4);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-3);

        character.setIntelligence(5);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-3);

        character.setIntelligence(6);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-2);

        character.setIntelligence(7);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-2);

        character.setIntelligence(8);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-1);

        character.setIntelligence(9);
        assertThat(character.getIntelligenceModifier()).isEqualTo(-1);

        character.setIntelligence(10);
        assertThat(character.getIntelligenceModifier()).isEqualTo(0);

        character.setIntelligence(11);
        assertThat(character.getIntelligenceModifier()).isEqualTo(0);

        character.setIntelligence(12);
        assertThat(character.getIntelligenceModifier()).isEqualTo(1);

        character.setIntelligence(13);
        assertThat(character.getIntelligenceModifier()).isEqualTo(1);

        character.setIntelligence(14);
        assertThat(character.getIntelligenceModifier()).isEqualTo(2);

        character.setIntelligence(15);
        assertThat(character.getIntelligenceModifier()).isEqualTo(2);

        character.setIntelligence(16);
        assertThat(character.getIntelligenceModifier()).isEqualTo(3);

        character.setIntelligence(17);
        assertThat(character.getIntelligenceModifier()).isEqualTo(3);

        character.setIntelligence(18);
        assertThat(character.getIntelligenceModifier()).isEqualTo(4);

        character.setIntelligence(19);
        assertThat(character.getIntelligenceModifier()).isEqualTo(4);

        character.setIntelligence(20);
        assertThat(character.getIntelligenceModifier()).isEqualTo(5);

        character.setIntelligence(21);
        assertThat(character.getIntelligenceModifier()).isEqualTo(5);

        character.setIntelligence(22);
        assertThat(character.getIntelligenceModifier()).isEqualTo(6);

        character.setIntelligence(23);
        assertThat(character.getIntelligenceModifier()).isEqualTo(6);

        character.setIntelligence(24);
        assertThat(character.getIntelligenceModifier()).isEqualTo(7);

        character.setIntelligence(25);
        assertThat(character.getIntelligenceModifier()).isEqualTo(7);

        character.setIntelligence(26);
        assertThat(character.getIntelligenceModifier()).isEqualTo(8);

        character.setIntelligence(27);
        assertThat(character.getIntelligenceModifier()).isEqualTo(8);

        character.setIntelligence(28);
        assertThat(character.getIntelligenceModifier()).isEqualTo(9);

        character.setIntelligence(29);
        assertThat(character.getIntelligenceModifier()).isEqualTo(9);

        character.setIntelligence(30);
        assertThat(character.getIntelligenceModifier()).isEqualTo(10);
    }

    @Test
    public void checkWisdomModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setWisdom(1);
        assertThat(character.getWisdomModifier()).isEqualTo(-5);

        character.setWisdom(2);
        assertThat(character.getWisdomModifier()).isEqualTo(-4);

        character.setWisdom(3);
        assertThat(character.getWisdomModifier()).isEqualTo(-4);

        character.setWisdom(4);
        assertThat(character.getWisdomModifier()).isEqualTo(-3);

        character.setWisdom(5);
        assertThat(character.getWisdomModifier()).isEqualTo(-3);

        character.setWisdom(6);
        assertThat(character.getWisdomModifier()).isEqualTo(-2);

        character.setWisdom(7);
        assertThat(character.getWisdomModifier()).isEqualTo(-2);

        character.setWisdom(8);
        assertThat(character.getWisdomModifier()).isEqualTo(-1);

        character.setWisdom(9);
        assertThat(character.getWisdomModifier()).isEqualTo(-1);

        character.setWisdom(10);
        assertThat(character.getWisdomModifier()).isEqualTo(0);

        character.setWisdom(11);
        assertThat(character.getWisdomModifier()).isEqualTo(0);

        character.setWisdom(12);
        assertThat(character.getWisdomModifier()).isEqualTo(1);

        character.setWisdom(13);
        assertThat(character.getWisdomModifier()).isEqualTo(1);

        character.setWisdom(14);
        assertThat(character.getWisdomModifier()).isEqualTo(2);

        character.setWisdom(15);
        assertThat(character.getWisdomModifier()).isEqualTo(2);

        character.setWisdom(16);
        assertThat(character.getWisdomModifier()).isEqualTo(3);

        character.setWisdom(17);
        assertThat(character.getWisdomModifier()).isEqualTo(3);

        character.setWisdom(18);
        assertThat(character.getWisdomModifier()).isEqualTo(4);

        character.setWisdom(19);
        assertThat(character.getWisdomModifier()).isEqualTo(4);

        character.setWisdom(20);
        assertThat(character.getWisdomModifier()).isEqualTo(5);

        character.setWisdom(21);
        assertThat(character.getWisdomModifier()).isEqualTo(5);

        character.setWisdom(22);
        assertThat(character.getWisdomModifier()).isEqualTo(6);

        character.setWisdom(23);
        assertThat(character.getWisdomModifier()).isEqualTo(6);

        character.setWisdom(24);
        assertThat(character.getWisdomModifier()).isEqualTo(7);

        character.setWisdom(25);
        assertThat(character.getWisdomModifier()).isEqualTo(7);

        character.setWisdom(26);
        assertThat(character.getWisdomModifier()).isEqualTo(8);

        character.setWisdom(27);
        assertThat(character.getWisdomModifier()).isEqualTo(8);

        character.setWisdom(28);
        assertThat(character.getWisdomModifier()).isEqualTo(9);

        character.setWisdom(29);
        assertThat(character.getWisdomModifier()).isEqualTo(9);

        character.setWisdom(30);
        assertThat(character.getWisdomModifier()).isEqualTo(10);
    }

    @Test
    public void checkCharismaModifier() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        character.setCharisma(1);
        assertThat(character.getCharismaModifier()).isEqualTo(-5);

        character.setCharisma(2);
        assertThat(character.getCharismaModifier()).isEqualTo(-4);

        character.setCharisma(3);
        assertThat(character.getCharismaModifier()).isEqualTo(-4);

        character.setCharisma(4);
        assertThat(character.getCharismaModifier()).isEqualTo(-3);

        character.setCharisma(5);
        assertThat(character.getCharismaModifier()).isEqualTo(-3);

        character.setCharisma(6);
        assertThat(character.getCharismaModifier()).isEqualTo(-2);

        character.setCharisma(7);
        assertThat(character.getCharismaModifier()).isEqualTo(-2);

        character.setCharisma(8);
        assertThat(character.getCharismaModifier()).isEqualTo(-1);

        character.setCharisma(9);
        assertThat(character.getCharismaModifier()).isEqualTo(-1);

        character.setCharisma(10);
        assertThat(character.getCharismaModifier()).isEqualTo(0);

        character.setCharisma(11);
        assertThat(character.getCharismaModifier()).isEqualTo(0);

        character.setCharisma(12);
        assertThat(character.getCharismaModifier()).isEqualTo(1);

        character.setCharisma(13);
        assertThat(character.getCharismaModifier()).isEqualTo(1);

        character.setCharisma(14);
        assertThat(character.getCharismaModifier()).isEqualTo(2);

        character.setCharisma(15);
        assertThat(character.getCharismaModifier()).isEqualTo(2);

        character.setCharisma(16);
        assertThat(character.getCharismaModifier()).isEqualTo(3);

        character.setCharisma(17);
        assertThat(character.getCharismaModifier()).isEqualTo(3);

        character.setCharisma(18);
        assertThat(character.getCharismaModifier()).isEqualTo(4);

        character.setCharisma(19);
        assertThat(character.getCharismaModifier()).isEqualTo(4);

        character.setCharisma(20);
        assertThat(character.getCharismaModifier()).isEqualTo(5);

        character.setCharisma(21);
        assertThat(character.getCharismaModifier()).isEqualTo(5);

        character.setCharisma(22);
        assertThat(character.getCharismaModifier()).isEqualTo(6);

        character.setCharisma(23);
        assertThat(character.getCharismaModifier()).isEqualTo(6);

        character.setCharisma(24);
        assertThat(character.getCharismaModifier()).isEqualTo(7);

        character.setCharisma(25);
        assertThat(character.getCharismaModifier()).isEqualTo(7);

        character.setCharisma(26);
        assertThat(character.getCharismaModifier()).isEqualTo(8);

        character.setCharisma(27);
        assertThat(character.getCharismaModifier()).isEqualTo(8);

        character.setCharisma(28);
        assertThat(character.getCharismaModifier()).isEqualTo(9);

        character.setCharisma(29);
        assertThat(character.getCharismaModifier()).isEqualTo(9);

        character.setCharisma(30);
        assertThat(character.getCharismaModifier()).isEqualTo(10);
    }

    @Test
    public void checkProficiencyBonus() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();

        Paladin paladin = new Paladin();
        paladin.setLevel(1);
        character.addCharacterClass(paladin);
        assertThat(character.getProficiencyBonus()).isEqualTo(2);

        paladin.setLevel(6);
        assertThat(character.getProficiencyBonus()).isEqualTo(3);

        Cleric cleric = new Cleric();
        cleric.setLevel(2);
        character.addCharacterClass(cleric);

        paladin.setLevel(12);
        assertThat(character.getProficiencyBonus()).isEqualTo(6);
    }

    @Test
    public void checkCharacterClassList() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();
        Paladin paladin = new Paladin();
        paladin.setLevel(1);
        Cleric cleric = new Cleric();
        cleric.setLevel(2);

        character.addCharacterClass(paladin);
        character.addCharacterClass(cleric);

        int actualCharacterClassListSize = character.getCharacterClassList().size();
        int expectedCharacterClassListSize = 2;
        assertThat(actualCharacterClassListSize).isEqualTo(expectedCharacterClassListSize);

        CharacterClass firstClass = character.getCharacterClassList().get(0);
        int actualFirstClassCharacterId = firstClass.getCharacter().getId();
        int expectedFirstClassCharacterId = character.getId();
        assertThat(actualFirstClassCharacterId).isEqualTo(expectedFirstClassCharacterId);

        CharacterClass secondClass = character.getCharacterClassList().get(1);
        int actualSecondClassCharacterId = secondClass.getCharacter().getId();
        int expectedSecondClassCharacterId = character.getId();
        assertThat(actualSecondClassCharacterId).isEqualTo(expectedSecondClassCharacterId);
    }

    @Test
    public void checkBuildAddCharacterClassList() {
        CharacterModel character = FakeDataUtil.getCharacterWithZeroAttributes();
        Paladin paladin = new Paladin();
        paladin.setLevel(1);
        Cleric cleric = new Cleric();
        cleric.setLevel(2);

        SparseArray<CharacterClass> classes = new SparseArray<>();
        classes.put(paladin.getClassType(), paladin);
        classes.put(cleric.getClassType(), cleric);

        character.setCharacterClasses(classes);

        int actualCharacterClassListSize = character.getCharacterClassList().size();
        int expectedCharacterClassListSize = 2;
        assertThat(actualCharacterClassListSize).isEqualTo(expectedCharacterClassListSize);

        CharacterClass firstClass = character.getCharacterClassList().get(0);
        int actualFirstClassCharacterId = firstClass.getCharacter().getId();
        int expectedFirstClassCharacterId = character.getId();
        assertThat(actualFirstClassCharacterId).isEqualTo(expectedFirstClassCharacterId);

        CharacterClass secondClass = character.getCharacterClassList().get(1);
        int actualSecondClassCharacterId = secondClass.getCharacter().getId();
        int expectedSecondClassCharacterId = character.getId();
        assertThat(actualSecondClassCharacterId).isEqualTo(expectedSecondClassCharacterId);
    }

    @Test
    public void addingClassesShouldSetCharacterId() {
        CharacterModel character = FakeDataUtil.getCharacter();
        character.setId(8);

        Paladin paladin = new Paladin();
        character.addCharacterClass(paladin);

        assertThat(paladin.getCharacterId()).isEqualTo(character.getId());
    }

    @Test
    public void checkAddingArrayListOfCharacterClasses() {
        ArrayList<CharacterClass> characterClasses = new ArrayList<>();
        characterClasses.add(new Paladin());
        characterClasses.add(new Cleric());

        CharacterModel character = FakeDataUtil.getCharacter();
        character.setCharacterClasses(characterClasses);

        ArrayList<CharacterClass> resultingCharacterClasses = character.getCharacterClassList();
        assertThat(resultingCharacterClasses).hasSize(2);
    }
}
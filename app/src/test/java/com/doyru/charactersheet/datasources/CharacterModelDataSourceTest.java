package com.doyru.charactersheet.datasources;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasources.CharacterDataSource;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Cleric;
import com.doryu.charactersheet.models.classes.Paladin;
import com.doyru.charactersheet.util.FakeDataUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class CharacterModelDataSourceTest {

    // TODO test classes
    @Test
    public void shouldRetrieveCorrectValues() {
        CharacterDataSource dataSource = getCharacterDataSource();
        CharacterModel characterToInsert = FakeDataUtil.getCharacter();
        List<CharacterModel> characterList;
        CharacterModel expectedCharacter;

        dataSource.open();
        dataSource.createCharacter(characterToInsert);

        characterList = dataSource.getAllCharacters();
        dataSource.close();

        assertThat(characterList).isNotEmpty();

        expectedCharacter = characterList.get(0);

        assertThat(expectedCharacter.getId()).isNotNegative();
        assertThat(expectedCharacter.getName()).isNotNull().isEqualTo("Bhurgharr");
        assertThat(expectedCharacter.getRace()).isNotNull().isEqualTo(CharacterModel.Race.DRAGONBORN.ordinal());
        assertThat(expectedCharacter.getGender()).isNotNull().isEqualTo(CharacterModel.Gender.MALE.ordinal());
        assertThat(expectedCharacter.getSize()).isNotNull().isEqualTo(CharacterModel.Size.MEDIUM.ordinal());
        assertThat(expectedCharacter.getWeightInPounds()).isNotNull().isEqualTo(260);
        assertThat(expectedCharacter.getSpeed()).isNotNull().isEqualTo(30);
        assertThat(expectedCharacter.getVision()).isNotNull().isEqualTo(CharacterModel.Vision.NORMAL.ordinal());
        assertThat(expectedCharacter.getStrength()).isNotNull().isEqualTo(17);
        assertThat(expectedCharacter.getDexterity()).isNotNull().isEqualTo(8);
        assertThat(expectedCharacter.getConstitution()).isNotNull().isEqualTo(14);
        assertThat(expectedCharacter.getIntelligence()).isNotNull().isEqualTo(10);
        assertThat(expectedCharacter.getWisdom()).isNotNull().isEqualTo(12);
        assertThat(expectedCharacter.getCharisma()).isNotNull().isEqualTo(17);
        assertThat(expectedCharacter.getArmorClassNoArmor()).isNotNull().isEqualTo(10);
        assertThat(expectedCharacter.getExperience()).isNotNull().isEqualTo(320);
        assertThat(expectedCharacter.getTotalHitPoints()).isNotNull().isEqualTo(15);
        assertThat(expectedCharacter.getRemainingHitPoints()).isNotNull().isEqualTo(14);
        assertThat(expectedCharacter.getExtraHitPoints()).isNotNull().isEqualTo(0);
    }

    private CharacterDataSource getCharacterDataSource() {
        CharacterDataSource characterDataSource = new CharacterDataSource(CharacterSheetApplication.getAppContext());
        return characterDataSource;
    }

    @Test
    public void savingCharacterShouldSaveClasses() {
        CharacterModel characterToInsert = FakeDataUtil.getCharacter();
        characterToInsert.setId(0);

        Paladin paladin = new Paladin();
        paladin.setLevel(4);
        Cleric cleric = new Cleric();
        cleric.setLevel(1);

        characterToInsert.addCharacterClass(paladin);
        characterToInsert.addCharacterClass(cleric);

        CharacterDataSource dataSource = getCharacterDataSource();
        dataSource.open();
        dataSource.createCharacter(characterToInsert);

        CharacterModel resultingCharacter = dataSource.getAllCharacters().get(0);
        ArrayList<CharacterClass> characterClassList = resultingCharacter.getCharacterClassList();
        assertThat(characterClassList).isNotEmpty();

        CharacterClass resultingCleric = characterClassList.get(0);
        assertThat(resultingCleric).isInstanceOf(Cleric.class);
        assertThat(resultingCleric.getLevel()).isEqualTo(1);

        CharacterClass resultingPaladin = characterClassList.get(1);
        assertThat(resultingPaladin).isInstanceOf(Paladin.class);
        assertThat(paladin.getLevel()).isEqualTo(4);

        dataSource.close();
    }

    @Test
    public void shouldBeAbleToUpdateCharacter() {
        CharacterModel characterModel = FakeDataUtil.getCharacterWithZeroAttributes();
        CharacterDataSource dataSource = getCharacterDataSource();

        dataSource.open();
        dataSource.createCharacter(characterModel);

        characterModel.setExperience(300);
        dataSource.createCharacter(characterModel);

        ArrayList<CharacterModel> characterModels = dataSource.getAllCharacters();
        dataSource.close();

        assertThat(characterModels).hasSize(1);

        int expectedExp = 300;
        int actualExp = characterModels.get(0).getExperience();
        assertThat(actualExp).isEqualTo(expectedExp);
    }
}

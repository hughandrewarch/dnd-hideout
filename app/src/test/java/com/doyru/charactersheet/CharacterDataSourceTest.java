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

        assertThat(expectedCharacter.getName()).isNotNull().isEqualTo("Bhurgharr");
        assertThat(expectedCharacter.getRace()).isNotNull().isEqualTo(Character.Race.DRAGONBORN.ordinal());
        assertThat(expectedCharacter.getGender()).isNotNull().isEqualTo(Character.Gender.MALE.ordinal());
        assertThat(expectedCharacter.getSize()).isNotNull().isEqualTo(Character.Size.MEDIUM.ordinal());
        assertThat(expectedCharacter.getWeightInPounds()).isNotNull().isEqualTo(260);
        assertThat(expectedCharacter.getSpeed()).isNotNull().isEqualTo(30);
        assertThat(expectedCharacter.getVision()).isNotNull().isEqualTo(Character.Vision.NORMAL.ordinal());
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
}

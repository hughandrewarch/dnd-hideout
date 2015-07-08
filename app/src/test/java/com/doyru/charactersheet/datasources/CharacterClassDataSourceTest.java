package com.doyru.charactersheet.datasources;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasources.CharacterClassDataSource;
import com.doryu.charactersheet.datasources.CharacterDataSource;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.Barbarian;
import com.doryu.charactersheet.models.classes.Bard;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Cleric;
import com.doryu.charactersheet.models.classes.Druid;
import com.doryu.charactersheet.models.classes.Fighter;
import com.doryu.charactersheet.models.classes.Monk;
import com.doryu.charactersheet.models.classes.Paladin;
import com.doryu.charactersheet.models.classes.Ranger;
import com.doryu.charactersheet.models.classes.Rogue;
import com.doryu.charactersheet.models.classes.Sorcerer;
import com.doryu.charactersheet.models.classes.Warlock;
import com.doryu.charactersheet.models.classes.Wizard;
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
public class CharacterClassDataSourceTest {

    @Test
    public void shouldRetrieveCorrectValues() {
        CharacterClassDataSource dataSource = getCharacterClassDataSource();
        Paladin characterToInsert = FakeDataUtil.getPaladin();
        characterToInsert.setLevel(1);
        characterToInsert.setCharacterId(1);

        List<CharacterClass> characterClassList;
        CharacterClass expectedCharacterClass;

        dataSource.open();
        dataSource.createCharacterClass(characterToInsert);

        characterClassList = dataSource.getAllCharacterClasses();
        dataSource.close();

        assertThat(characterClassList).isNotEmpty();

        expectedCharacterClass = characterClassList.get(0);

        assertThat(expectedCharacterClass.getId()).isNotNegative();
        assertThat(expectedCharacterClass.getClassType()).isEqualTo(CharacterClass.PALADIN);
        assertThat(expectedCharacterClass).isInstanceOf(Paladin.class);
        assertThat(expectedCharacterClass.getLevel()).isEqualTo(1);
        assertThat(expectedCharacterClass.getCharacterId()).isEqualTo(1);
    }

    @Test
    public void checkResultingClasses() {
        insertAndCheckAndDelete(new Barbarian(), Barbarian.class);
        insertAndCheckAndDelete(new Bard(), Bard.class);
        insertAndCheckAndDelete(new Cleric(), Cleric.class);
        insertAndCheckAndDelete(new Druid(), Druid.class);
        insertAndCheckAndDelete(new Fighter(), Fighter.class);
        insertAndCheckAndDelete(new Monk(), Monk.class);
        insertAndCheckAndDelete(new Paladin(), Paladin.class);
        insertAndCheckAndDelete(new Ranger(), Ranger.class);
        insertAndCheckAndDelete(new Rogue(), Rogue.class);
        insertAndCheckAndDelete(new Sorcerer(), Sorcerer.class);
        insertAndCheckAndDelete(new Warlock(), Warlock.class);
        insertAndCheckAndDelete(new Wizard(), Wizard.class);
    }

    private void insertAndCheckAndDelete(CharacterClass characterClassToInsert, Class expectedClass) {
        CharacterClassDataSource dataSource = getCharacterClassDataSource();
        dataSource.open();
        dataSource.createCharacterClass(characterClassToInsert);
        CharacterClass resultingCharacterClass = dataSource.getAllCharacterClasses().get(0);

        Class actualClassType = resultingCharacterClass.getClass();
        Class expectedClassType = expectedClass;
        assertThat(actualClassType).isEqualTo(expectedClassType);

        dataSource.deleteAllCharacterClasses();
        dataSource.close();
    }

    private CharacterClassDataSource getCharacterClassDataSource() {
        CharacterClassDataSource characterClassDataSource = new CharacterClassDataSource(CharacterSheetApplication.getAppContext());
        return characterClassDataSource;
    }

    @Test
    public void checkGetClassesForCharacter() {
        int characterId = 0;
        int wrongCharacterId = 8;
        CharacterModel characterToInsert = FakeDataUtil.getCharacter();

        insertCharacter(characterToInsert);
        insertCharacterClass(characterId);
        insertCharacterClass(wrongCharacterId);

        CharacterClassDataSource dataSource = getCharacterClassDataSource();
        dataSource.open();
        ArrayList<CharacterClass> characterClasses = dataSource.getCharacterClasses(characterToInsert);
        dataSource.close();

        assertThat(characterClasses).isNotEmpty().hasSize(1);
    }

    private void insertCharacter(CharacterModel characterToInsert) {
        CharacterDataSource dataSource = getCharacterDataSource();

        dataSource.open();
        dataSource.createCharacter(characterToInsert);
        dataSource.close();
    }

    private void insertCharacterClass(int characterId) {
        CharacterClassDataSource dataSource = getCharacterClassDataSource();
        Paladin characterToInsert = FakeDataUtil.getPaladin();
        characterToInsert.setLevel(1);
        characterToInsert.setCharacterId(characterId);

        dataSource.open();
        dataSource.createCharacterClass(characterToInsert);
        dataSource.close();
    }

    private CharacterDataSource getCharacterDataSource() {
        CharacterDataSource characterDataSource = new CharacterDataSource(CharacterSheetApplication.getAppContext());
        return characterDataSource;
    }

    @Test
    public void shouldBeAbleToUpdateCharacterClass() {
        Paladin paladin = new Paladin();
        CharacterClassDataSource dataSource = getCharacterClassDataSource();

        dataSource.open();
        dataSource.createCharacterClass(paladin);

        paladin.setLevel(18);
        dataSource.createCharacterClass(paladin);

        ArrayList<CharacterClass> characterModels = dataSource.getAllCharacterClasses();
        dataSource.close();

        assertThat(characterModels).hasSize(1);

        int expectedLevel = 18;
        int actualLevel = characterModels.get(0).getLevel();
        assertThat(actualLevel).isEqualTo(expectedLevel);
    }
}

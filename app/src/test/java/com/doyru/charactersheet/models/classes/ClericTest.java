package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.Bard;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Cleric;
import com.doyru.charactersheet.assertions.DiceAssert;
import com.doyru.charactersheet.util.FakeDataUtil;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class ClericTest {

    private Cleric mCleric;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mCleric = new Cleric();
        fakeCharacter.addCharacterClass(mCleric);
    }

    @Test
    public void clericsShouldBeClerics() {
        int actualClass = mCleric.getClassType();
        int expectedClass = CharacterClass.CLERIC;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mCleric.setLevel(2);

        Dice actualHitDice = mCleric.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mCleric.setLevel(5);

        actualHitDice = mCleric.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        CharacterModel character = mCleric.getCharacter();

        mCleric.setLevel(6);
        character.setWisdom(18);

        int actualNumberSpellsKnown = mCleric.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mCleric.setLevel(10);
        character.setWisdom(8);

        actualNumberSpellsKnown = mCleric.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mCleric.setLevel(1);
        character.setWisdom(16);

        actualNumberSpellsKnown = mCleric.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mCleric.setLevel(2);
        character.setWisdom(4);

        actualNumberSpellsKnown = mCleric.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 1;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mCleric.setLevel(1);
        int actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(2);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(3);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(4);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(5);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(6);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(7);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(8);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(9);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(10);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(11);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(12);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(13);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(14);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(15);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(16);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(17);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(18);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(19);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mCleric.setLevel(20);
        actualNumberCantripsKnown = mCleric.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
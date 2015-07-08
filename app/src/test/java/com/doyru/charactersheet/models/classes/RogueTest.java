package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Rogue;
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
public class RogueTest {

    private Rogue mRogue;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mRogue = new Rogue();
    }
    @Test
    public void roguesShouldBeRogues() {
        int actualClass = mRogue.getClassType();
        int expectedClass = CharacterClass.ROGUE;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mRogue.setLevel(2);

        Dice actualHitDice = mRogue.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mRogue.setLevel(5);

        actualHitDice = mRogue.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        mRogue.setLevel(3);
        int actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 3;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(4);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(5);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(6);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(7);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(8);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(9);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(10);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(11);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(12);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(13);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(14);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(15);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(16);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(17);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(18);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(19);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRogue.setLevel(20);
        actualNumberSpellsKnown = mRogue.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 13;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mRogue.setLevel(3);
        int actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(4);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(5);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(6);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(7);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(8);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(9);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(10);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(11);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(12);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(13);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(14);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(15);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(16);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(17);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(18);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(19);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mRogue.setLevel(20);
        actualNumberCantripsKnown = mRogue.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Sorcerer;
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
public class SorcererTest {

    private Sorcerer mSorcerer;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mSorcerer = new Sorcerer(fakeCharacter);
    }

    @Test
    public void sorcerersShouldBeSorcerers() {
        int actualClass = mSorcerer.getClassType();
        int expectedClass = CharacterClass.SORCERER;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mSorcerer.setLevel(2);

        Dice actualHitDice = mSorcerer.getHitDice();
        Dice expectedHitDice = new Dice(2, 6);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mSorcerer.setLevel(5);

        actualHitDice = mSorcerer.getHitDice();
        expectedHitDice = new Dice(5, 6);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        mSorcerer.setLevel(1);
        int actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 2;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(2);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 3;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(3);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(4);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(5);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(6);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(7);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(8);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(9);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(10);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(11);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(12);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(13);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 13;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(14);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 13;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(15);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 14;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(16);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 14;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(17);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(18);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(19);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mSorcerer.setLevel(20);
        actualNumberSpellsKnown = mSorcerer.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mSorcerer.setLevel(1);
        int actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(2);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(3);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(4);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(5);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(6);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(7);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(8);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(9);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(10);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(11);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(12);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(13);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(14);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(15);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(16);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(17);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(18);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(19);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mSorcerer.setLevel(20);
        actualNumberCantripsKnown = mSorcerer.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 6;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
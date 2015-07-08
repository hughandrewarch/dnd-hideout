package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.Bard;
import com.doryu.charactersheet.models.classes.CharacterClass;
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
public class BardTest {

    private Bard mBard;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mBard = new Bard();
        fakeCharacter.addCharacterClass(mBard);
    }

    @Test
    public void bardsShouldBeBards() {
        int actualClass = mBard.getClassType();
        int expectedClass = CharacterClass.BARD;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mBard.setLevel(2);

        Dice actualHitDice = mBard.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mBard.setLevel(5);

        actualHitDice = mBard.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        mBard.setLevel(1);
        int actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(2);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(3);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(4);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(5);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(6);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(7);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(8);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(9);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(10);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 14;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(11);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(12);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(13);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 16;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(14);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 18;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(15);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 19;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(16);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 19;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(17);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 20;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(18);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 22;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(19);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 22;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mBard.setLevel(20);
        actualNumberSpellsKnown = mBard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 22;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mBard.setLevel(1);
        int actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(2);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(3);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(4);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(5);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(6);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(7);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(8);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(9);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(10);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(11);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(12);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(13);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(14);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(15);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(16);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(17);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(18);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(19);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mBard.setLevel(20);
        actualNumberCantripsKnown = mBard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
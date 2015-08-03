package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Warlock;
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
public class WarlockTest {

    private Warlock mWarlock;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mWarlock = new Warlock();
    }

    @Test
    public void sorcerersShouldBeSorcerers() {
        int actualClass = mWarlock.getClassType();
        int expectedClass = CharacterClass.WARLOCK;
        assertThat(actualClass).isEqualTo(expectedClass);

        String actualClassName = mWarlock.getClassName();
        String expectedClassName = "Warlock";
        assertThat(actualClassName).isEqualTo(expectedClassName);
    }

    @Test
    public void checkHitDice() {
        mWarlock.setLevel(2);

        Dice actualHitDice = mWarlock.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mWarlock.setLevel(5);

        actualHitDice = mWarlock.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        mWarlock.setLevel(1);
        int actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 2;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(2);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 3;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(3);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(4);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(5);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(6);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(7);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(8);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(9);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(10);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(11);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(12);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(13);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(14);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 12;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(15);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 13;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(16);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 13;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(17);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 14;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(18);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 14;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(19);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWarlock.setLevel(20);
        actualNumberSpellsKnown = mWarlock.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 15;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mWarlock.setLevel(1);
        int actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(2);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(3);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(4);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(5);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(6);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(7);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(8);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(9);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(10);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(11);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(12);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(13);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(14);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(15);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(16);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(17);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(18);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(19);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWarlock.setLevel(20);
        actualNumberCantripsKnown = mWarlock.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
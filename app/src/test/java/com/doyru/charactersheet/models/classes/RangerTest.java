package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Ranger;
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
public class RangerTest {

    private Ranger mRanger;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mRanger = new Ranger();
    }

    @Test
    public void rangersShouldBeRangers() {
        int actualClass = mRanger.getClassType();
        int expectedClass = CharacterClass.RANGER;
        assertThat(actualClass).isEqualTo(expectedClass);

        String actualClassName = mRanger.getClassName();
        String expectedClassName = "Ranger";
        assertThat(actualClassName).isEqualTo(expectedClassName);
    }

    @Test
    public void checkHitDice() {
        mRanger.setLevel(2);

        Dice actualHitDice = mRanger.getHitDice();
        Dice expectedHitDice = new Dice(2, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mRanger.setLevel(5);

        actualHitDice = mRanger.getHitDice();
        expectedHitDice = new Dice(5, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        mRanger.setLevel(1);
        int actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(2);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 2;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(3);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 3;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(4);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 3;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(5);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(6);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 4;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(7);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(8);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 5;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(9);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(10);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 6;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(11);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(12);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 7;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(13);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(14);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 8;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(15);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(16);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(17);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(18);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(19);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mRanger.setLevel(20);
        actualNumberSpellsKnown = mRanger.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 11;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkCantripsKnown() {
        int actualNumberCantripsKnown = mRanger.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 0;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
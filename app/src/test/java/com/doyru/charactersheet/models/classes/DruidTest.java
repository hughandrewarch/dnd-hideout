package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Druid;
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
public class DruidTest {

    private Druid mDruid;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mDruid = new Druid();
        fakeCharacter.addCharacterClass(mDruid);
    }

    @Test
    public void druidsShouldBeDruids() {
        int actualClass = mDruid.getClassType();
        int expectedClass = CharacterClass.DRUID;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mDruid.setLevel(2);

        Dice actualHitDice = mDruid.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mDruid.setLevel(5);

        actualHitDice = mDruid.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        CharacterModel character = mDruid.getCharacter();

        mDruid.setLevel(6);
        character.setWisdom(18);

        int actualNumberSpellsKnown = mDruid.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mDruid.setLevel(10);
        character.setWisdom(8);

        actualNumberSpellsKnown = mDruid.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mDruid.setLevel(1);
        int actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(2);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(3);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 2;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(4);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(5);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(6);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(7);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(8);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(9);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(10);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(11);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(12);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(13);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(14);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(15);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(16);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(17);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(18);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(19);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mDruid.setLevel(20);
        actualNumberCantripsKnown = mDruid.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}

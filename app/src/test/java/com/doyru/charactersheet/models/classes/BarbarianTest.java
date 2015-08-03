package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.Barbarian;
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
public class BarbarianTest {

    private Barbarian mBarbarian;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mBarbarian = new Barbarian();
        fakeCharacter.addCharacterClass(mBarbarian);
    }

    @Test
    public void barbariansShouldBeBarbarians() {
        int actualClass = mBarbarian.getClassType();
        int expectedClass = CharacterClass.BARBARIAN;
        assertThat(actualClass).isEqualTo(expectedClass);

        String actualClassName = mBarbarian.getClassName();
        String expectedClassName = "Barbarian";
        assertThat(actualClassName).isEqualTo(expectedClassName);
    }

    @Test
    public void checkHitDice() {
        mBarbarian.setLevel(2);

        Dice actualHitDice = mBarbarian.getHitDice();
        Dice expectedHitDice = new Dice(2, 12);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mBarbarian.setLevel(5);

        actualHitDice = mBarbarian.getHitDice();
        expectedHitDice = new Dice(5, 12);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkSpellsKnown() {
        int actualNumberSpellsKnown = mBarbarian.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkCantripsKnown() {
        int actualNumberCantripsKnown = mBarbarian.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 0;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
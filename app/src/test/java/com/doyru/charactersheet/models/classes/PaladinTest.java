package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.Bard;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Paladin;
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
public class PaladinTest {

    private Paladin mPaladin;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mPaladin = new Paladin(fakeCharacter);
    }

    @Test
    public void paladinsShouldBePaladins() {
        int actualClass = mPaladin.getClassType();
        int expectedClass = CharacterClass.PALADIN;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mPaladin.setLevel(2);

        Dice actualHitDice = mPaladin.getHitDice();
        Dice expectedHitDice = new Dice(2, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mPaladin.setLevel(5);

        actualHitDice = mPaladin.getHitDice();
        expectedHitDice = new Dice(5, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        CharacterModel character = mPaladin.getCharacter();

        mPaladin.setLevel(6);
        character.setWisdom(18);

        int actualNumberSpellsKnown = mPaladin.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mPaladin.setLevel(10);
        character.setWisdom(8);

        actualNumberSpellsKnown = mPaladin.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mPaladin.setLevel(1);
        character.setWisdom(16);

        actualNumberSpellsKnown = mPaladin.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mPaladin.setLevel(2);
        character.setWisdom(4);

        actualNumberSpellsKnown = mPaladin.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 1;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkCantripsKnown() {
        int actualNumberCantripsKnown = mPaladin.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 0;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
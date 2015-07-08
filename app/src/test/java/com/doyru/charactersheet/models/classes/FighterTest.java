package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Fighter;
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
public class FighterTest {

    private Fighter mFighter;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mFighter = new Fighter();
    }

    @Test
    public void fightersShouldBeFighters() {
        int actualClass = mFighter.getClassType();
        int expectedClass = CharacterClass.FIGHTER;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mFighter.setLevel(2);

        Dice actualHitDice = mFighter.getHitDice();
        Dice expectedHitDice = new Dice(2, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mFighter.setLevel(5);

        actualHitDice = mFighter.getHitDice();
        expectedHitDice = new Dice(5, 10);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkSpellsKnown() {
        int actualNumberSpellsKnown = mFighter.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkCantripsKnown() {
        int actualNumberCantripsKnown = mFighter.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 0;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
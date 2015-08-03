package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Monk;
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
public class MonkTest {

    private Monk mMonk;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mMonk = new Monk();
    }

    @Test
    public void monksShouldBeMonks() {
        int actualClass = mMonk.getClassType();
        int expectedClass = CharacterClass.MONK;
        assertThat(actualClass).isEqualTo(expectedClass);

        String actualClassName = mMonk.getClassName();
        String expectedClassName = "Monk";
        assertThat(actualClassName).isEqualTo(expectedClassName);
    }

    @Test
    public void checkHitDice() {
        mMonk.setLevel(2);

        Dice actualHitDice = mMonk.getHitDice();
        Dice expectedHitDice = new Dice(2, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mMonk.setLevel(5);

        actualHitDice = mMonk.getHitDice();
        expectedHitDice = new Dice(5, 8);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkSpellsKnown() {
        int actualNumberSpellsKnown = mMonk.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkCantripsKnown() {
        int actualNumberCantripsKnown = mMonk.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 0;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
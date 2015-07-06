package com.doyru.charactersheet.models;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.Dice;
import com.doyru.charactersheet.assertions.DiceAssert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class DiceTest {

    @Test
    public void checkDiceString() {
        Dice fourDSix = new Dice(4, 6);
        String actualOutput = fourDSix.toString();
        String expectedOutput = "4d6";
        assertThat(actualOutput).isEqualTo(expectedOutput);

        Dice twoDEight = new Dice(2, 8);
        actualOutput = twoDEight.toString();
        expectedOutput = "2d8";
        assertThat(actualOutput).isEqualTo(expectedOutput);

        Dice oneDTwenty = new Dice(1, 20);
        actualOutput = oneDTwenty.toString();
        expectedOutput = "1d20";
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    public void checkQuantity() {
        Dice fourDSix = new Dice(4, 6);

        int actualQuantity = fourDSix.getQuantity();
        int expectedQuantity = 4;
        assertThat(actualQuantity).isEqualTo(expectedQuantity);
    }

    @Test
    public void checkBase() {
        Dice fourDSix = new Dice(4, 6);

        int actualBase = fourDSix.getBase();
        int expectedBase = 6;
        assertThat(actualBase).isEqualTo(expectedBase);
    }

    @Test
    public void checkDiceEqual() {
        Dice actualDice = new Dice(4, 6);
        Dice expectedDice = new Dice(4, 6);

        DiceAssert.assertThat(actualDice).isEqualTo(expectedDice);
    }
}
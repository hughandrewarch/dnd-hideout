package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Wizard;
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
public class WizardTest {

    private Wizard mWizard;

    @Before
    public void setup() {
        CharacterModel fakeCharacter = FakeDataUtil.getCharacter();
        mWizard = new Wizard(fakeCharacter);
    }

    @Test
    public void sorcerersShouldBeSorcerers() {
        int actualClass = mWizard.getClassType();
        int expectedClass = CharacterClass.WIZARD;
        assertThat(actualClass).isEqualTo(expectedClass);
    }

    @Test
    public void checkHitDice() {
        mWizard.setLevel(2);

        Dice actualHitDice = mWizard.getHitDice();
        Dice expectedHitDice = new Dice(2, 6);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);

        mWizard.setLevel(5);

        actualHitDice = mWizard.getHitDice();
        expectedHitDice = new Dice(5, 6);
        DiceAssert.assertThat(actualHitDice).isEqualTo(expectedHitDice);
    }

    @Test
    public void checkNumberSpellsKnown() {
        CharacterModel character = mWizard.getCharacter();

        mWizard.setLevel(6);
        character.setIntelligence(18);

        int actualNumberSpellsKnown = mWizard.getNumberSpellsKnown();
        int expectedNumberSpellsKnown = 10;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWizard.setLevel(10);
        character.setIntelligence(8);

        actualNumberSpellsKnown = mWizard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 9;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWizard.setLevel(1);
        character.setIntelligence(16);

        actualNumberSpellsKnown = mWizard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 0;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);

        mWizard.setLevel(2);
        character.setIntelligence(4);

        actualNumberSpellsKnown = mWizard.getNumberSpellsKnown();
        expectedNumberSpellsKnown = 1;
        assertThat(actualNumberSpellsKnown).isEqualTo(expectedNumberSpellsKnown);
    }

    @Test
    public void checkNumberCantripsKnown() {
        mWizard.setLevel(1);
        int actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        int expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(2);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(3);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 3;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(4);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(5);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(6);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(7);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(8);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(9);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 4;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(10);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(11);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(12);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(13);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(14);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(15);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(16);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(17);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(18);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(19);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);

        mWizard.setLevel(20);
        actualNumberCantripsKnown = mWizard.getNumberCantripsKnown();
        expectedNumberCantripsKnown = 5;
        assertThat(actualNumberCantripsKnown).isEqualTo(expectedNumberCantripsKnown);
    }
}
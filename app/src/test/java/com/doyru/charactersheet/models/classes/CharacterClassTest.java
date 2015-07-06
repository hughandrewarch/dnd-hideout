package com.doyru.charactersheet.models.classes;

import com.doryu.charactersheet.BuildConfig;
import com.doryu.charactersheet.models.*;
import com.doryu.charactersheet.models.classes.CharacterClass;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class CharacterClassTest {

    @Test
    public void checkProficiencyBonus() {
        GenericClass genericClass = new GenericClass();

        genericClass.setLevel(1);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(2);

        genericClass.setLevel(2);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(2);

        genericClass.setLevel(3);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(2);

        genericClass.setLevel(4);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(2);

        genericClass.setLevel(5);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(3);

        genericClass.setLevel(6);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(3);

        genericClass.setLevel(7);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(3);

        genericClass.setLevel(8);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(3);

        genericClass.setLevel(9);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(4);

        genericClass.setLevel(10);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(4);

        genericClass.setLevel(11);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(4);

        genericClass.setLevel(12);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(4);

        genericClass.setLevel(13);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(5);

        genericClass.setLevel(14);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(5);

        genericClass.setLevel(15);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(5);

        genericClass.setLevel(16);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(5);

        genericClass.setLevel(17);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(6);

        genericClass.setLevel(18);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(6);

        genericClass.setLevel(19);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(6);

        genericClass.setLevel(20);
        assertThat(genericClass.getProficiencyBonus()).isEqualTo(6);
    }

    private static class GenericClass extends CharacterClass {

        public GenericClass() {
            super(null);
        }

        @Override
        public int getClassType() {
            return 0;
        }

        @Override
        public int getNumberSpellsKnown() {
            return 0;
        }

        @Override
        public int getNumberCantripsKnown() {
            return 0;
        }

        @Override
        public Dice getHitDice() {
            return null;
        }
    }
}
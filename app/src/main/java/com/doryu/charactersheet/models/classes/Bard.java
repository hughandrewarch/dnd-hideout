package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.Dice;

public class Bard extends CharacterClass {

    @Override
    public int getClassType() {
        return BARD;
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown;

        if (mLevel < 10) {
            spellsKnown = mLevel + 3;
        } else if (mLevel == 10) {
            spellsKnown = 14;
        } else if (mLevel == 11 || mLevel == 12) {
            spellsKnown = 15;
        } else if (mLevel == 13) {
            spellsKnown = 16;
        } else if (mLevel == 14) {
            spellsKnown = 18;
        } else if (mLevel == 15 || mLevel == 16) {
            spellsKnown = 19;
        } else if (mLevel == 17) {
            spellsKnown = 20;
        } else {
            spellsKnown = 22;
        }

        return spellsKnown;
    }

    @Override
    public int getNumberCantripsKnown() {
        int cantripsKnown;

        if (mLevel < 4) {
            cantripsKnown = 2;
        } else if (mLevel < 10) {
            cantripsKnown = 3;
        } else {
            cantripsKnown = 4;
        }

        return cantripsKnown;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 8);
    }
}

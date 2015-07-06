package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Warlock extends CharacterClass {

    public Warlock(CharacterModel character) {
        super(character);
    }

    @Override
    public int getClassType() {
        return WARLOCK;
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown;

        if (mLevel < 10) {
            spellsKnown = mLevel + 1;
        } else if (mLevel == 10) {
            spellsKnown = 10;
        } else if (mLevel == 11 || mLevel == 12) {
            spellsKnown = 11;
        } else if (mLevel == 13 || mLevel == 14) {
            spellsKnown = 12;
        } else if (mLevel == 15 || mLevel == 16) {
            spellsKnown = 13;
        } else if (mLevel == 17 || mLevel == 18) {
            spellsKnown = 14;
        } else {
            spellsKnown = 15;
        }

        return spellsKnown;
    }

    @Override
    public int getNumberCantripsKnown() {
        int cantripsKnown = 0;

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

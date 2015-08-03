package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.R;
import com.doryu.charactersheet.models.Dice;

public class Rogue extends CharacterClass {

    @Override
    public int getClassType() {
        return ROGUE;
    }

    @Override
    public String getClassName() {
        return CharacterSheetApplication.getAppContext().getString(R.string.class_rogue);
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown = 0;

        if (mLevel > 2) {
            if (mLevel == 3) {
                spellsKnown = 3;
            } else if (mLevel == 4 || mLevel == 5 || mLevel == 6) {
                spellsKnown = 4;
            } else if (mLevel == 7) {
                spellsKnown = 5;
            } else if (mLevel == 8 || mLevel == 9) {
                spellsKnown = 6;
            } else if (mLevel == 10) {
                spellsKnown = 7;
            } else if (mLevel == 11 || mLevel == 12) {
                spellsKnown = 8;
            } else if (mLevel == 13) {
                spellsKnown = 9;
            } else if (mLevel == 14 || mLevel == 15) {
                spellsKnown = 10;
            } else if (mLevel == 16 || mLevel == 17 || mLevel == 18) {
                spellsKnown = 11;
            } else if (mLevel == 19) {
                spellsKnown = 12;
            } else if (mLevel == 20) {
                spellsKnown = 13;
            }
        }

        return spellsKnown;
    }

    @Override
    public int getNumberCantripsKnown() {
        int cantripsKnown = 0;

        if (mLevel > 9) {
            cantripsKnown = 4;
        } else if (mLevel > 2) {
            cantripsKnown = 3;
        }

        return cantripsKnown;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 8);
    }
}

package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Sorcerer extends CharacterClass {

    public Sorcerer(CharacterModel character) {
        super(character);
    }

    @Override
    public int getClassType() {
        return SORCERER;
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown = 2;

        if (mLevel < 12) {
            spellsKnown = mLevel + 1;
        } else if (mLevel == 12) {
            spellsKnown = 12;
        } else if (mLevel == 13 || mLevel == 14) {
            spellsKnown = 13;
        } else if (mLevel == 15 || mLevel == 16) {
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
            cantripsKnown = 4;
        } else if (mLevel < 10) {
            cantripsKnown = 5;
        } else {
            cantripsKnown = 6;
        }

        return cantripsKnown;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 6);
    }
}

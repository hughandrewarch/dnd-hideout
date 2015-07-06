package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Ranger extends CharacterClass {

    public Ranger(CharacterModel character) {
        super(character);
    }

    @Override
    public int getClassType() {
        return RANGER;
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown = 0;

        if (mLevel > 2) {
            spellsKnown = ((mLevel + 1) / 2) + 1;
        } else if (mLevel == 2) {
            spellsKnown = (mLevel / 2) + 1;
        }

        return spellsKnown;
    }

    @Override
    public int getNumberCantripsKnown() {
        return 0;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 10);
    }
}

package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Monk extends CharacterClass {

    @Override
    public int getClassType() {
        return MONK;
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
        return new Dice(mLevel, 8);
    }
}

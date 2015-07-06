package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.*;
import com.doryu.charactersheet.models.CharacterModel;

public class Barbarian extends CharacterClass {

    public Barbarian(CharacterModel character) {
        super(character);
    }

    @Override
    public int getClassType() {
        return BARBARIAN;
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
        return new Dice(mLevel, 12);
    }
}

package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.R;
import com.doryu.charactersheet.models.Dice;

public class Fighter extends CharacterClass {

    @Override
    public int getClassType() {
        return FIGHTER;
    }

    @Override
    public String getClassName() {
        return CharacterSheetApplication.getAppContext().getString(R.string.class_fighter);
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
        return new Dice(mLevel, 10);
    }
}


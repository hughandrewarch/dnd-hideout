package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.R;
import com.doryu.charactersheet.models.Dice;

public class Monk extends CharacterClass {

    @Override
    public int getClassType() {
        return MONK;
    }

    @Override
    public String getClassName() {
        return CharacterSheetApplication.getAppContext().getString(R.string.class_monk);
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

package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.R;
import com.doryu.charactersheet.models.Dice;

public class Wizard extends CharacterClass {

    @Override
    public int getClassType() {
        return WIZARD;
    }

    @Override
    public String getClassName() {
        return CharacterSheetApplication.getAppContext().getString(R.string.class_wizard);
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown = 0;

        if (mLevel > 1) {
            int intelligenceModifier = mCharacterWeakReference.get().getIntelligenceModifier();
            spellsKnown = intelligenceModifier + mLevel;

            if (spellsKnown < 1) {
                spellsKnown = 1;
            }
        }

        return spellsKnown;
    }

    @Override
    public int getNumberCantripsKnown() {
        int cantripsKnown = 0;

        if (mLevel < 4) {
            cantripsKnown = 3;
        } else if (mLevel < 10) {
            cantripsKnown = 4;
        } else {
            cantripsKnown = 5;
        }

        return cantripsKnown;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 6);
    }
}

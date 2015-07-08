package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Druid extends CharacterClass {

    @Override
    public int getClassType() {
        return DRUID;
    }

    @Override
    public int getNumberSpellsKnown() {
        int wisdomModifier = mCharacterWeakReference.get().getWisdomModifier();
        return wisdomModifier + mLevel;
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

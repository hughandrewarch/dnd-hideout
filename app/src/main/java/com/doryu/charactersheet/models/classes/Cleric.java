package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Cleric extends CharacterClass {

    @Override
    public int getClassType() {
        return CLERIC;
    }

    @Override
    public int getNumberSpellsKnown() {
        int spellsKnown = 0;

        if (mLevel > 1) {
            int wisdomModifier = mCharacterWeakReference.get().getWisdomModifier();
            spellsKnown = wisdomModifier + mLevel;

            if (spellsKnown < 1) {
                spellsKnown = 1;
            }
        }

        return spellsKnown;
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

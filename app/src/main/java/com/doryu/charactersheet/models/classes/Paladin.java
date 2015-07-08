package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.Dice;
import com.doryu.charactersheet.models.CharacterModel;

public class Paladin extends CharacterClass {

    @Override
    public int getClassType() {
        return PALADIN;
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
        return 0;
    }

    @Override
    public Dice getHitDice() {
        return new Dice(mLevel, 10);
    }
}

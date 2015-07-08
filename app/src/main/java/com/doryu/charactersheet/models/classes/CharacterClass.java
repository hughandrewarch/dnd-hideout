package com.doryu.charactersheet.models.classes;

import com.doryu.charactersheet.models.*;

import java.lang.ref.WeakReference;
import com.doryu.charactersheet.models.CharacterModel;

public abstract class CharacterClass {

    public static final int BARBARIAN = 1;
    public static final int BARD = 2;
    public static final int CLERIC = 3;
    public static final int DRUID = 4;
    public static final int FIGHTER = 5;
    public static final int MONK = 6;
    public static final int PALADIN = 7;
    public static final int RANGER = 8;
    public static final int ROGUE = 9;
    public static final int SORCERER = 10;
    public static final int WARLOCK = 11;
    public static final int WIZARD = 12;

    private int mId;
    private int mCharacterId;
    protected int mLevel;
    protected WeakReference<CharacterModel> mCharacterWeakReference;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public int getProficiencyBonus() {
        int bonus;

        if (getLevel() < 5) {
            bonus = 2;
        } else if (getLevel() < 9) {
            bonus = 3;
        } else if (getLevel() < 13) {
            bonus = 4;
        } else if (getLevel() < 17) {
            bonus = 5;
        } else {
            bonus = 6;
        }

        return bonus;
    }

    public CharacterModel getCharacter() {
        return mCharacterWeakReference.get();
    }

    public void setCharacter(CharacterModel character) {
        mCharacterWeakReference = new WeakReference<>(character);
        mCharacterId = character.getId();
    }

    public abstract int getClassType();
    public abstract int getNumberSpellsKnown();
    public abstract int getNumberCantripsKnown();
    public abstract Dice getHitDice();

    public int getCharacterId() {
        return mCharacterId;
    }

    public void setCharacterId(int characterId) {
        mCharacterId = characterId;
    }
}

package com.doryu.charactersheet.models;

import android.util.SparseArray;

import com.doryu.charactersheet.models.classes.CharacterClass;

import java.util.ArrayList;

public class CharacterModel {

    public enum Race {
        DWARF,
        ELF,
        HALFLING,
        HUMAN,
        DRAGONBORN,
        GNOME,
        HALF_ELF,
        HALF_ORC,
        TIEFLING;
    }

    public enum Gender {
        MALE,
        FEMALE,
        HERMES;
    }

    public enum Size {
        EXTRA_SMALL,
        SMALL,
        MEDIUM,
        LARGE,
        EXTRA_LARGE;
    }

    public enum Vision {
        NORMAL,
        DARKVISION,
        SUPERIOR_DARKVISION;
    }
    
    public  interface LevelExperience {
        int ONE = 0;
        int TWO = 300;
        int THREE = 900;
        int FOUR = 2700;
        int FIVE = 6500;
        int SIX = 14000;
        int SEVEN = 23000;
        int EIGHT = 34000;
        int NINE = 48000;
        int TEN = 64000;
        int ELEVEN = 85000;
        int TWELVE = 100000;
        int THIRTEEN = 120000;
        int FOURTEEN = 140000;
        int FIFTEEN = 165000;
        int SIXTEEN = 195000;
        int SEVENTEEN = 225000;
        int EIGHTEEN = 265000;
        int NINETEEN = 305000;
        int TWENTY = 355000;
    }

    private int mId;

    private String mName;
    private int mCharacterClass;
    private SparseArray<CharacterClass> mCharacterClasses;
    private int mRace;
    private int mGender;
    private int mSize;
    private int mWeightInPounds;
    private int mSpeed;
    private int mVision;

    private int mStrength;
    private int mDexterity;
    private int mConstitution;
    private int mIntelligence;
    private int mWisdom;
    private int mCharisma;

    private int mArmorClassNoArmor;

    private int mExperience;
    private int mTotalHitPoints;
    private int mRemainingHitPoints;

    private int mExtraHitPoints;

    public CharacterModel() {
        mCharacterClasses = new SparseArray<>();
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getCharacterClass() {
        return mCharacterClass;
    }

    public void setCharacterClass(int characterClass) {
        mCharacterClass = characterClass;
    }

    public void setCharacterClasses(SparseArray<CharacterClass> characterClasses) {
        mCharacterClasses = characterClasses;
    }

    public ArrayList<CharacterClass> getCharacterClassList() {
        ArrayList<CharacterClass> characterClassList = new ArrayList<>();

        for (int i = 0; i < mCharacterClasses.size(); i++) {
            int key = mCharacterClasses.keyAt(i);
            CharacterClass characterClass = mCharacterClasses.get(key);

            characterClassList.add(characterClass);
        }

        return characterClassList;
    }

    public void addCharacterClass(CharacterClass characterClass) {
        mCharacterClasses.put(characterClass.getClassType(), characterClass);
    }

    public int getRace() {
        return mRace;
    }

    public void setRace(int race) {
        mRace = race;
    }

    public void setRace(Race race) {
        mRace = race.ordinal();
    }

    public int getGender() {
        return mGender;
    }

    public void setGender(int gender) {
        mGender = gender;
    }

    public void setGender(Gender gender) {
        mGender = gender.ordinal();
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public void setSize(Size size) {
        mSize = size.ordinal();
    }

    public int getWeightInPounds() {
        return mWeightInPounds;
    }

    public void setWeightInPounds(int weightInPounds) {
        mWeightInPounds = weightInPounds;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }

    public int getVision() {
        return mVision;
    }

    public void setVision(int vision) {
        mVision = vision;
    }

    public void setVision(Vision vision) {
        mVision = vision.ordinal();
    }

    public int getStrength() {
        return mStrength;
    }

    public void setStrength(int strength) {
        mStrength = strength;
    }

    public int getStrengthModifier() {
        if (mStrength < 12) {
            return (mStrength - 11) / 2;
        } else {
            return (mStrength - 10) / 2;
        }
    }

    public int getDexterity() {
        return mDexterity;
    }

    public void setDexterity(int dexterity) {
        mDexterity = dexterity;
    }

    public int getDexterityModifier() {
        if (mDexterity < 12) {
            return (mDexterity - 11) / 2;
        } else {
            return (mDexterity - 10) / 2;
        }
    }

    public int getConstitution() {
        return mConstitution;
    }

    public void setConstitution(int constitution) {
        mConstitution = constitution;
    }

    public int getConstitutionModifier() {
        if (mConstitution < 12) {
            return (mConstitution - 11) / 2;
        } else {
            return (mConstitution - 10) / 2;
        }
    }

    public int getIntelligence() {
        return mIntelligence;
    }

    public void setIntelligence(int intelligence) {
        mIntelligence = intelligence;
    }

    public int getIntelligenceModifier() {
        if (mIntelligence < 12) {
            return (mIntelligence - 11) / 2;
        } else {
            return (mIntelligence - 10) / 2;
        }
    }

    public int getWisdom() {
        return mWisdom;
    }

    public void setWisdom(int wisdom) {
        mWisdom = wisdom;
    }

    public int getWisdomModifier() {
        if (mWisdom < 12) {
            return (mWisdom - 11) / 2;
        } else {
            return (mWisdom - 10) / 2;
        }
    }

    public int getCharisma() {
        return mCharisma;
    }

    public void setCharisma(int charisma) {
        mCharisma = charisma;
    }

    public int getCharismaModifier() {
        if (mCharisma < 12) {
            return (mCharisma - 11) / 2;
        } else {
            return (mCharisma - 10) / 2;
        }
    }

    public int getArmorClassNoArmor() {
        return mArmorClassNoArmor;
    }

    public void setArmorClassNoArmor(int armorClassNoArmor) {
        mArmorClassNoArmor = armorClassNoArmor;
    }

    public int getExperience() {
        return mExperience;
    }

    public void setExperience(int experience) {
        mExperience = experience;
    }

    public int getLevel() {
        int level;

        if (mExperience < LevelExperience.TWO) {
            level = 1;
        } else if (mExperience < LevelExperience.THREE) {
            level = 2;
        } else if (mExperience < LevelExperience.FOUR) {
            level = 3;
        } else if (mExperience < LevelExperience.FIVE) {
            level = 4;
        } else if (mExperience < LevelExperience.SIX) {
            level = 5;
        } else if (mExperience < LevelExperience.SEVEN) {
            level = 6;
        } else if (mExperience < LevelExperience.EIGHT) {
            level = 7;
        } else if (mExperience < LevelExperience.NINE) {
            level = 8;
        } else if (mExperience < LevelExperience.TEN) {
            level = 9;
        } else if (mExperience < LevelExperience.ELEVEN) {
            level = 10;
        } else if (mExperience < LevelExperience.TWELVE) {
            level = 11;
        } else if (mExperience < LevelExperience.THIRTEEN) {
            level = 12;
        } else if (mExperience < LevelExperience.FOURTEEN) {
            level = 13;
        } else if (mExperience < LevelExperience.FIFTEEN) {
            level = 14;
        } else if (mExperience < LevelExperience.SIXTEEN) {
            level = 15;
        } else if (mExperience < LevelExperience.SEVENTEEN) {
            level = 16;
        } else if (mExperience < LevelExperience.EIGHTEEN) {
            level = 17;
        } else if (mExperience < LevelExperience.NINETEEN) {
            level = 18;
        } else if (mExperience < LevelExperience.TWENTY) {
            level = 19;
        } else {
            level = 20;
        }

            return level;
    }

    // TODO reimplement based on array of character classes
//    public int getProficiencyBonus() {
//        int bonus;
//
//        if (getLevel() < 5) {
//            bonus = 2;
//        } else if (getLevel() < 9) {
//            bonus = 3;
//        } else if (getLevel() < 13) {
//            bonus = 4;
//        } else if (getLevel() < 17) {
//            bonus = 5;
//        } else {
//            bonus = 6;
//        }
//
//        return bonus;
//    }

    // TODO migrate logic
    public int getProficiencyBonus() {
        int bonus = 0;

        for (int i = 0; i < mCharacterClasses.size(); i++) {
            int key = mCharacterClasses.keyAt(i);
            CharacterClass characterClass = mCharacterClasses.get(key);

            bonus += characterClass.getProficiencyBonus();
        }

        return bonus;
    }

    public int getTotalHitPoints() {
        return mTotalHitPoints;
    }

    public void setTotalHitPoints(int totalHitPoints) {
        mTotalHitPoints = totalHitPoints;
    }

    public int getRemainingHitPoints() {
        return mRemainingHitPoints;
    }

    public void setRemainingHitPoints(int remainingHitPoints) {
        mRemainingHitPoints = remainingHitPoints;
    }

    public int getExtraHitPoints() {
        return mExtraHitPoints;
    }

    public void setExtraHitPoints(int extraHitPoints) {
        mExtraHitPoints = extraHitPoints;
    }
}

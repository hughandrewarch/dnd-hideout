package com.doryu.charactersheet.models;

public class Character {


    
    public enum CharacterClass {
        BARBARIAN,
        BARD,
        CLERIC,
        DRUID,
        FIGHTER,
        MONK,
        PALADIN,
        RANGER,
        ROGUE,
        SORCERER,
        WARLOCK,
        WIZARD;
    }

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

    private int mId;

    private String mName;
    private int mCharacterClass;
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

    public void setCharacterClass(CharacterClass characterClass) {
        mCharacterClass = characterClass.ordinal();
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

    public int getDexterity() {
        return mDexterity;
    }

    public void setDexterity(int dexterity) {
        mDexterity = dexterity;
    }

    public int getConstitution() {
        return mConstitution;
    }

    public void setConstitution(int constitution) {
        mConstitution = constitution;
    }

    public int getIntelligence() {
        return mIntelligence;
    }

    public void setIntelligence(int intelligence) {
        mIntelligence = intelligence;
    }

    public int getWisdom() {
        return mWisdom;
    }

    public void setWisdom(int wisdom) {
        mWisdom = wisdom;
    }

    public int getCharisma() {
        return mCharisma;
    }

    public void setCharisma(int charisma) {
        mCharisma = charisma;
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

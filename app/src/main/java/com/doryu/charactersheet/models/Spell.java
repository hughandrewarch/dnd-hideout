package com.doryu.charactersheet.models;

import com.google.gson.annotations.SerializedName;

public class Spell {
    @SerializedName("id")
    int mId;
    @SerializedName("name")
    String mName;
    @SerializedName("level")
    int mLevel;
    @SerializedName("range")
    String mRange;
    @SerializedName("casting_time")
    String mCastingTime;
    @SerializedName("duration")
    String mDuration;
    @SerializedName("school")
    String mSchool;
    @SerializedName("concentration")
    boolean mConcentration;
    @SerializedName("ritual")
    boolean mRitual;
    @SerializedName("components")
    String mComponents;
    @SerializedName("materials")
    String mMaterials;
    @SerializedName("description")
    String mDescription;

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public int getLevel() {
        return mLevel;
    }

    public String getRange() {
        return mRange;
    }

    public String getCastingTime() {
        return mCastingTime;
    }

    public String getDuration() {
        return mDuration;
    }

    public String getSchool() {
        return mSchool;
    }

    public boolean isConcentration() {
        return mConcentration;
    }

    public boolean isRitual() {
        return mRitual;
    }

    public String getComponents() {
        return mComponents;
    }

    public String getMaterials() {
        return mMaterials;
    }

    public String getDescription() {
        return mDescription;
    }
}

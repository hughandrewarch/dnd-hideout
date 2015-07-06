package com.doryu.charactersheet.models;

public class Dice {

    private int mBase;
    private int mQuantity;

    public Dice(int quantity, int base) {
        mBase = base;
        mQuantity = quantity;
    }

    @Override
    public String toString() {
        return mQuantity + "d" + mBase;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public int getBase() {
        return mBase;
    }
}

package com.doryu.charactersheet.datasets;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.doryu.charactersheet.models.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterTable {
    public static final String TABLE_NAME = "character_table";

    public enum Columns {
        _ID,
        NAME,
        CHARACTER_CLASS,
        RACE,
        GENDER,
        SIZE,
        WEIGHT_IN_POUNDS,
        SPEED,
        VISION,
        STRENGTH,
        DEXTERITY,
        CONSTITUTION,
        INTELLIGENCE,
        WISDOM,
        CHARISMA,
        ARMOR_CLASS_NO_ARMOR,
        EXPERIENCE,
        TOTAL_HIT_POINTS,
        REMAINING_HIT_POINTS,
        EXTRA_HIT_POINTS
    }

    private static final String DATABASE_CREATE = "create table "
            + TABLE_NAME
            + "("
            + Columns._ID + " integer primary key autoincrement, "
            + Columns.NAME + " text,"
            + Columns.CHARACTER_CLASS + " integer,"
            + Columns.RACE + " integer,"
            + Columns.GENDER + " integer,"
            + Columns.SIZE + " integer,"
            + Columns.WEIGHT_IN_POUNDS + " integer,"
            + Columns.SPEED + " integer,"
            + Columns.VISION + " integer,"
            + Columns.STRENGTH + " integer,"
            + Columns.DEXTERITY + " integer,"
            + Columns.CONSTITUTION + " integer,"
            + Columns.INTELLIGENCE + " integer,"
            + Columns.WISDOM + " integer,"
            + Columns.CHARISMA + " integer,"
            + Columns.ARMOR_CLASS_NO_ARMOR + " integer,"
            + Columns.EXPERIENCE + " integer,"
            + Columns.TOTAL_HIT_POINTS + " integer,"
            + Columns.REMAINING_HIT_POINTS + " integer,"
            + Columns.EXTRA_HIT_POINTS + " integer"
            + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
        Log.w("TEST", "***************************DB CREATED????");
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
                                 int newVersion) {
        Log.w(CharacterTable.class.getName(), "Upgrading database from version\n\n\n\n\n\n\n "
                + oldVersion + " to " + newVersion
                + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

    public static ContentValues[] getContentValues(List<Character> characters) {
        final ArrayList<ContentValues> values = new ArrayList<>();

        for (Character character : characters) {
            values.add(getContentValue(character));
        }

        return values.toArray(new ContentValues[values.size()]);
    }

    public static ContentValues getContentValue(Character character) {
        ContentValues values = new ContentValues();

        values.put(Columns.NAME.toString(), character.getName());
        values.put(Columns.CHARACTER_CLASS.toString(), character.getCharacterClass());
        values.put(Columns.RACE.toString(), character.getRace());
        values.put(Columns.GENDER.toString(), character.getGender());
        values.put(Columns.SIZE.toString(), character.getSize());
        values.put(Columns.WEIGHT_IN_POUNDS.toString(), character.getWeightInPounds());
        values.put(Columns.SPEED.toString(), character.getSpeed());
        values.put(Columns.VISION.toString(), character.getVision());
        values.put(Columns.STRENGTH.toString(), character.getStrength());
        values.put(Columns.DEXTERITY.toString(), character.getDexterity());
        values.put(Columns.CONSTITUTION.toString(), character.getConstitution());
        values.put(Columns.INTELLIGENCE.toString(), character.getIntelligence());
        values.put(Columns.WISDOM.toString(), character.getWisdom());
        values.put(Columns.CHARISMA.toString(), character.getCharisma());
        values.put(Columns.ARMOR_CLASS_NO_ARMOR.toString(), character.getArmorClassNoArmor());
        values.put(Columns.EXPERIENCE.toString(), character.getExperience());
        values.put(Columns.TOTAL_HIT_POINTS.toString(), character.getTotalHitPoints());
        values.put(Columns.REMAINING_HIT_POINTS.toString(), character.getRemainingHitPoints());
        values.put(Columns.EXTRA_HIT_POINTS.toString(), character.getExtraHitPoints());

        return values;
    }
}

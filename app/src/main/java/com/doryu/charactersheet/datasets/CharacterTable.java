package com.doryu.charactersheet.datasets;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.doryu.charactersheet.models.Character;

import java.util.ArrayList;
import java.util.List;

public class CharacterTable {
    public static final String TABLE_NAME = "character_table";

    public static class Columns {
        public static final String _ID = "_id";
        public static final String NAME = "name";
        public static final String CHARACTER_CLASS = "character_class";
        public static final String RACE = "race";
        public static final String GENDER = "gender";
        public static final String SIZE = "size";
        public static final String WEIGHT_IN_POUNDS = "weight_in_pounds";
        public static final String SPEED = "speed";
        public static final String VISION = "vision";
        public static final String STRENGTH = "strength";
        public static final String DEXTERITY = "dexterity";
        public static final String CONSTITUTION = "constitution";
        public static final String INTELLIGENCE = "intelligence";
        public static final String WISDOM = "wisdom";
        public static final String CHARISMA = "charisma";
        public static final String ARMOR_CLASS_NO_ARMOR = "armor_class_no_armor";
        public static final String EXPERIENCE = "experience";
        public static final String TOTAL_HIT_POINTS = "total_hit_points";
        public static final String REMAINING_HIT_POINTS = "remaining_hit_points";
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
            + Columns.REMAINING_HIT_POINTS + " integer"
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


        //TODO do the rest of these
//        values.put(Columns._ID, character.getId());
        values.put(Columns.NAME, character.getName());
//        values.put(Columns.CHARACTER_CLASS, character.getStationName());
//        values.put(CharacterTable.Columns.RACE, character.getAvailableBikes());
//        values.put(Columns.GENDER, character.getAvailableDocks());
//        values.put(Columns.SIZE, character.getTotalDocks());
//        values.put(Columns.WEIGHT_IN_POUNDS, character.getLatitude());
//        values.put(Columns.SPEED, character.getLongitude());
//        values.put(Columns.VISION, character.isInService());
//        values.put(Columns.STRENGTH, );
//        values.put(Columns.DEXTERITY, );
//        values.put(Columns.CONSTITUTION, );
//        values.put(Columns.INTELLIGENCE, );
//        values.put(Columns.WISDOM, );
//        values.put(Columns.CHARISMA, );
//        values.put(Columns.ARMOR_CLASS_NO_ARMOR, );
//        values.put(Columns.EXPERIENCE, );
//        values.put(Columns.TOTAL_HIT_POINTS, );
//        values.put(Columns.REMAINING_HIT_POINTS, );

        return values;
    }
}

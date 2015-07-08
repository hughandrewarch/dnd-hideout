package com.doryu.charactersheet.datasets;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.CharacterClass;

import java.util.ArrayList;
import java.util.List;

public class CharacterClassTable {
    public static final String TABLE_NAME = "character_class_table";

    public enum Columns {
        CLASS_TYPE,
        LEVEL,
        CHARACTER_ID
    }

    private static final String DATABASE_CREATE = "create table "
            + TABLE_NAME
            + "("
            + Columns.CLASS_TYPE + " integer,"
            + Columns.LEVEL + " integer,"
            + Columns.CHARACTER_ID + " integer,"
            + "PRIMARY KEY (" + Columns.CLASS_TYPE + ", " + Columns.CHARACTER_ID + ")"
            + ");";

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,
                                 int newVersion) {
        Log.w(CharacterClassTable.class.getName(), "Upgrading database from version\n\n\n\n\n\n\n "
                + oldVersion + " to " + newVersion
                + ", which will destroy all old data");
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

    public static ContentValues[] getContentValues(List<CharacterClass> characterClasses) {
        final ArrayList<ContentValues> values = new ArrayList<>();

        for (CharacterClass characterClass : characterClasses) {
            values.add(getContentValue(characterClass));
        }

        return values.toArray(new ContentValues[values.size()]);
    }

    public static ContentValues getContentValue(CharacterClass characterClass) {
        ContentValues values = new ContentValues();

        values.put(Columns.CLASS_TYPE.toString(), characterClass.getClassType());
        values.put(Columns.LEVEL.toString(), characterClass.getLevel());
        values.put(Columns.CHARACTER_ID.toString(), characterClass.getCharacterId());

        return values;
    }
}

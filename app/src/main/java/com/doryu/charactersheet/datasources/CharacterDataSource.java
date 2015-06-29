package com.doryu.charactersheet.datasources;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasets.CharacterTable;
import com.doryu.charactersheet.helpers.CharacterDatabaseHelper;
import com.doryu.charactersheet.models.Character;

public class CharacterDataSource {

    // Database fields
    private SQLiteDatabase database;
    private CharacterDatabaseHelper dbHelper;
        private String[] allColumns = {CharacterTable.Columns._ID,
                CharacterTable.Columns.NAME,
                CharacterTable.Columns.CHARACTER_CLASS,
                CharacterTable.Columns.RACE,
                CharacterTable.Columns.GENDER,
                CharacterTable.Columns.SIZE,
                CharacterTable.Columns.WEIGHT_IN_POUNDS,
                CharacterTable.Columns.SPEED,
                CharacterTable.Columns.VISION,
                CharacterTable.Columns.STRENGTH,
                CharacterTable.Columns.DEXTERITY,
                CharacterTable.Columns.CONSTITUTION,
                CharacterTable.Columns.INTELLIGENCE,
                CharacterTable.Columns.WISDOM,
                CharacterTable.Columns.CHARISMA,
                CharacterTable.Columns.ARMOR_CLASS_NO_ARMOR,
                CharacterTable.Columns.EXPERIENCE,
                CharacterTable.Columns.TOTAL_HIT_POINTS,
                CharacterTable.Columns.REMAINING_HIT_POINTS};

    public CharacterDataSource(Context context) {
        dbHelper = new CharacterDatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void createCharacter(Character character) {
        ContentValues values = CharacterTable.getContentValue(character);

        database.insertWithOnConflict(CharacterTable.TABLE_NAME, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void createCharacters(List<Character> stations) {
        ContentValues[] values = CharacterTable.getContentValues(stations);


        for (ContentValues value : values) {
            database.insertWithOnConflict(CharacterTable.TABLE_NAME, null, value, SQLiteDatabase.CONFLICT_REPLACE);
        }

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void deleteCharacter(Character station) {
        long id = station.getId();

        database.delete(CharacterTable.TABLE_NAME, CharacterTable.Columns._ID + " = " + id, null);
    }

    public ArrayList<Character> getAllCharacters() {
        ArrayList<Character> stations = new ArrayList<Character>();

        Cursor cursor = database.query(CharacterTable.TABLE_NAME, allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Character station = cursorToComment(cursor);
            stations.add(station);
            cursor.moveToNext();
        }

        cursor.close();
        return stations;
    }

    private Character cursorToComment(Cursor cursor) {
        Character station = new Character();

        // TODO fill in the rest of these, but use static values instead of hardcoded numbers
        station.setId(cursor.getInt(0));
        station.setName(cursor.getString(1));

        return station;
    }
} 
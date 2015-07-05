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

    private String[] allColumns = {CharacterTable.Columns._ID.toString(),
            CharacterTable.Columns.NAME.toString(),
            CharacterTable.Columns.CHARACTER_CLASS.toString(),
            CharacterTable.Columns.RACE.toString(),
            CharacterTable.Columns.GENDER.toString(),
            CharacterTable.Columns.SIZE.toString(),
            CharacterTable.Columns.WEIGHT_IN_POUNDS.toString(),
            CharacterTable.Columns.SPEED.toString(),
            CharacterTable.Columns.VISION.toString(),
            CharacterTable.Columns.STRENGTH.toString(),
            CharacterTable.Columns.DEXTERITY.toString(),
            CharacterTable.Columns.CONSTITUTION.toString(),
            CharacterTable.Columns.INTELLIGENCE.toString(),
            CharacterTable.Columns.WISDOM.toString(),
            CharacterTable.Columns.CHARISMA.toString(),
            CharacterTable.Columns.ARMOR_CLASS_NO_ARMOR.toString(),
            CharacterTable.Columns.EXPERIENCE.toString(),
            CharacterTable.Columns.TOTAL_HIT_POINTS.toString(),
            CharacterTable.Columns.REMAINING_HIT_POINTS.toString(),
            CharacterTable.Columns.EXTRA_HIT_POINTS.toString()};

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
        ArrayList<Character> characters = new ArrayList<Character>();

        Cursor cursor = database.query(CharacterTable.TABLE_NAME, allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Character station = cursorToComment(cursor);
            characters.add(station);
            cursor.moveToNext();
        }

        cursor.close();
        return characters;
    }

    private Character cursorToComment(Cursor cursor) {
        Character station = new Character();

        // TODO fill in the rest of these, but use static values instead of hardcoded numbers
        station.setId(cursor.getInt(CharacterTable.Columns._ID.ordinal()));
        station.setName(cursor.getString(CharacterTable.Columns.NAME.ordinal()));
        station.setCharacterClass(cursor.getInt(CharacterTable.Columns.CHARACTER_CLASS.ordinal()));
        station.setRace(cursor.getInt(CharacterTable.Columns.RACE.ordinal()));
        station.setGender(cursor.getInt(CharacterTable.Columns.GENDER.ordinal()));
        station.setSize(cursor.getInt(CharacterTable.Columns.SIZE.ordinal()));
        station.setWeightInPounds(cursor.getInt(CharacterTable.Columns.WEIGHT_IN_POUNDS.ordinal()));
        station.setSpeed(cursor.getInt(CharacterTable.Columns.SPEED.ordinal()));
        station.setVision(cursor.getInt(CharacterTable.Columns.VISION.ordinal()));
        station.setStrength(cursor.getInt(CharacterTable.Columns.STRENGTH.ordinal()));
        station.setDexterity(cursor.getInt(CharacterTable.Columns.DEXTERITY.ordinal()));
        station.setConstitution(cursor.getInt(CharacterTable.Columns.CONSTITUTION.ordinal()));
        station.setIntelligence(cursor.getInt(CharacterTable.Columns.INTELLIGENCE.ordinal()));
        station.setWisdom(cursor.getInt(CharacterTable.Columns.WISDOM.ordinal()));
        station.setCharisma(cursor.getInt(CharacterTable.Columns.CHARISMA.ordinal()));
        station.setArmorClassNoArmor(cursor.getInt(CharacterTable.Columns.ARMOR_CLASS_NO_ARMOR.ordinal()));
        station.setExperience(cursor.getInt(CharacterTable.Columns.EXPERIENCE.ordinal()));
        station.setTotalHitPoints(cursor.getInt(CharacterTable.Columns.TOTAL_HIT_POINTS.ordinal()));
        station.setRemainingHitPoints(cursor.getInt(CharacterTable.Columns.REMAINING_HIT_POINTS.ordinal()));
        station.setExtraHitPoints(cursor.getInt(CharacterTable.Columns.EXTRA_HIT_POINTS.ordinal()));

        return station;
    }
} 
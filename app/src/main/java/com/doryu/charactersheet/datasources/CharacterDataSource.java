package com.doryu.charactersheet.datasources;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasets.CharacterClassTable;
import com.doryu.charactersheet.datasets.CharacterTable;
import com.doryu.charactersheet.helpers.CharacterDatabaseHelper;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.CharacterClass;

public class CharacterDataSource {

    // Database fields
    private SQLiteDatabase database;
    private CharacterDatabaseHelper dbHelper;
    private Context mContext;

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
        mContext = context;
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void createCharacter(CharacterModel character) {
        ContentValues values = CharacterTable.getContentValue(character);

        database.insertWithOnConflict(CharacterTable.TABLE_NAME, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        CharacterClassDataSource characterClassDataSource = new CharacterClassDataSource(mContext);
        characterClassDataSource.open();
        characterClassDataSource.createCharacterClasses(character.getCharacterClassList());
        characterClassDataSource.close();

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void createCharacters(List<CharacterModel> stations) {
        ContentValues[] values = CharacterTable.getContentValues(stations);

        for (ContentValues value : values) {
            database.insertWithOnConflict(CharacterTable.TABLE_NAME, null, value, SQLiteDatabase.CONFLICT_REPLACE);
        }

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void deleteCharacter(CharacterModel station) {
        long id = station.getId();

        database.delete(CharacterTable.TABLE_NAME, CharacterTable.Columns._ID + " = " + id, null);
    }

    public ArrayList<CharacterModel> getAllCharacters() {
        ArrayList<CharacterModel> characters = new ArrayList<CharacterModel>();

        Cursor cursor = database.query(CharacterTable.TABLE_NAME, allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            CharacterModel constructedCharacter = cursorToComment(cursor);

            ArrayList<CharacterClass> characterClasses = getCharacterClasses(constructedCharacter);

            constructedCharacter.setCharacterClasses(characterClasses);

            characters.add(constructedCharacter);

            cursor.moveToNext();
        }

        cursor.close();
        return characters;
    }

    private ArrayList<CharacterClass> getCharacterClasses(CharacterModel character) {
        CharacterClassDataSource characterClassDataSource = new CharacterClassDataSource(mContext);
        characterClassDataSource.open();
        ArrayList<CharacterClass> characterClasses = characterClassDataSource.getCharacterClasses(character);
        characterClassDataSource.close();

        return characterClasses;
    }

    private CharacterModel cursorToComment(Cursor cursor) {
        CharacterModel characterModel = new CharacterModel();

        characterModel.setId(cursor.getInt(CharacterTable.Columns._ID.ordinal()));
        characterModel.setName(cursor.getString(CharacterTable.Columns.NAME.ordinal()));
        characterModel.setCharacterClass(cursor.getInt(CharacterTable.Columns.CHARACTER_CLASS.ordinal()));
        characterModel.setRace(cursor.getInt(CharacterTable.Columns.RACE.ordinal()));
        characterModel.setGender(cursor.getInt(CharacterTable.Columns.GENDER.ordinal()));
        characterModel.setSize(cursor.getInt(CharacterTable.Columns.SIZE.ordinal()));
        characterModel.setWeightInPounds(cursor.getInt(CharacterTable.Columns.WEIGHT_IN_POUNDS.ordinal()));
        characterModel.setSpeed(cursor.getInt(CharacterTable.Columns.SPEED.ordinal()));
        characterModel.setVision(cursor.getInt(CharacterTable.Columns.VISION.ordinal()));
        characterModel.setStrength(cursor.getInt(CharacterTable.Columns.STRENGTH.ordinal()));
        characterModel.setDexterity(cursor.getInt(CharacterTable.Columns.DEXTERITY.ordinal()));
        characterModel.setConstitution(cursor.getInt(CharacterTable.Columns.CONSTITUTION.ordinal()));
        characterModel.setIntelligence(cursor.getInt(CharacterTable.Columns.INTELLIGENCE.ordinal()));
        characterModel.setWisdom(cursor.getInt(CharacterTable.Columns.WISDOM.ordinal()));
        characterModel.setCharisma(cursor.getInt(CharacterTable.Columns.CHARISMA.ordinal()));
        characterModel.setArmorClassNoArmor(cursor.getInt(CharacterTable.Columns.ARMOR_CLASS_NO_ARMOR.ordinal()));
        characterModel.setExperience(cursor.getInt(CharacterTable.Columns.EXPERIENCE.ordinal()));
        characterModel.setTotalHitPoints(cursor.getInt(CharacterTable.Columns.TOTAL_HIT_POINTS.ordinal()));
        characterModel.setRemainingHitPoints(cursor.getInt(CharacterTable.Columns.REMAINING_HIT_POINTS.ordinal()));
        characterModel.setExtraHitPoints(cursor.getInt(CharacterTable.Columns.EXTRA_HIT_POINTS.ordinal()));

        return characterModel;
    }
} 
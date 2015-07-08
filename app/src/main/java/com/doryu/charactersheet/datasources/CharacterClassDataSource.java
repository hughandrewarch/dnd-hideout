package com.doryu.charactersheet.datasources;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.doryu.charactersheet.CharacterSheetApplication;
import com.doryu.charactersheet.datasets.CharacterClassTable;
import com.doryu.charactersheet.helpers.CharacterDatabaseHelper;
import com.doryu.charactersheet.models.CharacterModel;
import com.doryu.charactersheet.models.classes.Barbarian;
import com.doryu.charactersheet.models.classes.Bard;
import com.doryu.charactersheet.models.classes.CharacterClass;
import com.doryu.charactersheet.models.classes.Cleric;
import com.doryu.charactersheet.models.classes.Druid;
import com.doryu.charactersheet.models.classes.Fighter;
import com.doryu.charactersheet.models.classes.Monk;
import com.doryu.charactersheet.models.classes.Paladin;
import com.doryu.charactersheet.models.classes.Ranger;
import com.doryu.charactersheet.models.classes.Rogue;
import com.doryu.charactersheet.models.classes.Sorcerer;
import com.doryu.charactersheet.models.classes.Warlock;
import com.doryu.charactersheet.models.classes.Wizard;

import java.util.ArrayList;
import java.util.List;

public class CharacterClassDataSource {

    private SQLiteDatabase database;
    private CharacterDatabaseHelper dbHelper;

    private String[] allColumns = {
            CharacterClassTable.Columns.CLASS_TYPE.toString(),
            CharacterClassTable.Columns.LEVEL.toString(),
            CharacterClassTable.Columns.CHARACTER_ID.toString()
    };

    public CharacterClassDataSource(Context context) {
        dbHelper = new CharacterDatabaseHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void createCharacterClass(CharacterClass characterClass) {
        ContentValues values = CharacterClassTable.getContentValue(characterClass);

        database.insertWithOnConflict(CharacterClassTable.TABLE_NAME, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void createCharacterClasses(List<CharacterClass> characterClasses) {
        ContentValues[] values = CharacterClassTable.getContentValues(characterClasses);

        for (ContentValues value : values) {
            database.insertWithOnConflict(CharacterClassTable.TABLE_NAME, null, value, SQLiteDatabase.CONFLICT_REPLACE);
        }

        CharacterSheetApplication.getAppContext().getContentResolver().notifyChange(CharacterDatabaseHelper.CONTENT_URI, null);
    }

    public void deleteCharacterClass(CharacterClass characterClass) {
        String classType = String.valueOf(characterClass.getClassType());
        String characterId = String.valueOf(characterClass.getCharacterId());

        database.delete(CharacterClassTable.TABLE_NAME, CharacterClassTable.Columns.CLASS_TYPE + " = ? AND " + CharacterClassTable.Columns.CHARACTER_ID + " = ?", new String[]{classType, characterId});
    }

    public void deleteAllCharacterClasses() {
        database.delete(CharacterClassTable.TABLE_NAME, null, null);
    }

    public ArrayList<CharacterClass> getAllCharacterClasses() {
        ArrayList<CharacterClass> characterClasses = new ArrayList<>();

        Cursor cursor = database.query(CharacterClassTable.TABLE_NAME, allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {

            CharacterClass characterClass = getClassType(cursor);
            characterClasses.add(characterClass);
            cursor.moveToNext();
        }

        cursor.close();
        return characterClasses;
    }

    public ArrayList<CharacterClass> getCharacterClasses(CharacterModel character) {
        Cursor cursor = database.query(CharacterClassTable.TABLE_NAME, allColumns,
                CharacterClassTable.Columns.CHARACTER_ID + " = ?", new String[]{String.valueOf(character.getId())}, null, null, null);

        ArrayList<CharacterClass> characterClasses = new ArrayList<>();

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            CharacterClass characterClass = getClassType(cursor);
            characterClasses.add(characterClass);
            cursor.moveToNext();
        }

        return characterClasses;
    }

    private CharacterClass getClassType(Cursor cursor) {
        int cursorClassType = cursor.getInt(CharacterClassTable.Columns.CLASS_TYPE.ordinal());
        CharacterClass characterClass;

        switch (cursorClassType) {
            case CharacterClass.BARBARIAN:
                characterClass = new Barbarian();
                break;
            case CharacterClass.BARD:
                characterClass = new Bard();
                break;
            case CharacterClass.CLERIC:
                characterClass = new Cleric();
                break;
            case CharacterClass.DRUID:
                characterClass = new Druid();
                break;
            case CharacterClass.FIGHTER:
                characterClass = new Fighter();
                break;
            case CharacterClass.MONK:
                characterClass = new Monk();
                break;
            case CharacterClass.PALADIN:
                characterClass = new Paladin();
                break;
            case CharacterClass.RANGER:
                characterClass = new Ranger();
                break;
            case CharacterClass.ROGUE:
                characterClass = new Rogue();
                break;
            case CharacterClass.SORCERER:
                characterClass = new Sorcerer();
                break;
            case CharacterClass.WARLOCK:
                characterClass = new Warlock();
                break;
            case CharacterClass.WIZARD:
                characterClass = new Wizard();
                break;
            default:
                characterClass = null;
                break;
        }

        characterClass = getPopulatedCharacterClass(cursor, characterClass);

        return characterClass;
    }

    private CharacterClass getPopulatedCharacterClass(Cursor cursor, CharacterClass characterClass) {
        characterClass.setLevel(cursor.getInt(CharacterClassTable.Columns.LEVEL.ordinal()));
        characterClass.setCharacterId(cursor.getInt(CharacterClassTable.Columns.CHARACTER_ID.ordinal()));

        return characterClass;
    }
} 
package com.doryu.charactersheet.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

import com.doryu.charactersheet.datasets.CharacterTable;

public class CharacterDatabaseHelper extends SQLiteOpenHelper {

    private static final String AUTHORITY = "com.flyingtoaster.bixe";
    private static final String BASE_PATH = "stations";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY
            + "/" + BASE_PATH);

    private static final String DATABASE_NAME = "character_sheet.db";
    private static final int DATABASE_VERSION = 1;

    public CharacterDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Method is called during creation of the database
    @Override
    public void onCreate(SQLiteDatabase database) {
        CharacterTable.onCreate(database);
    }

    // Method is called during an upgrade of the database,
    // e.g. if you increase the database version
    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion,
                          int newVersion) {
        CharacterTable.onUpgrade(database, oldVersion, newVersion);
    }
}
 
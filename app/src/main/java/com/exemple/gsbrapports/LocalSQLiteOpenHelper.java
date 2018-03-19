package com.exemple.gsbrapports;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jennifer.desgeorges on 19/03/2018.
 */

public class LocalSQLiteOpenHelper extends SQLiteOpenHelper{
    static String DB_NAME = "gsbrapports.db";
    static int DB_VERSION = 1;


    public LocalSQLiteOpenHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String sqlFileTable = "CREATE TABLE famille(id TEXT PRIMARY KEY," +
                "libelle TEXT);" +
                "INSERT into famille values ('aaa', 'Antalgique en association')";
        db.execSQL(sqlFileTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        for (int i = oldVersion; i<newVersion; i++){
            int versionToUpdate = i+1;
            if(versionToUpdate == 2){
                upgradeToVersion2(db);
            }
            else if(versionToUpdate == 3){

            }
        }
    }

    public static void deleteDatabase(Context context){
        context.deleteDatabase(DB_NAME);
    }

    private void upgradeToVersion2(SQLiteDatabase db){
        String sqlCommand = "ALTER TABLE famille ADD COLUMN test NUMERIC";
        db.execSQL(sqlCommand);
    }
}

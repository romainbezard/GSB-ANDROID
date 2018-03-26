package com.exemple.gsbrapports;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

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
        String sqlFileTable = "CREATE TABLE visiteur(id char PRIMARY KEY," +
                "nom char(30)," +
                "prenom char(30)," +
                "login char(20)," +
                "mdp char(20)," +
                "adresse char(30)," +
                "cp char(5)," +
                "ville char(30)" +
                "dateEmbauche int);";

        db.execSQL(sqlFileTable);
        Log.i("DB", "onCreate invoked");
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
        Log.i("DB", "onUpgrade invoked");
    }

    public static void deleteDatabase(Context context){
        context.deleteDatabase(DB_NAME);
    }

    private void upgradeToVersion2(SQLiteDatabase db){
        String sqlCommand = "ALTER TABLE visiteur ADD COLUMN test NUMERIC";
        db.execSQL(sqlCommand);
    }


    public void insertVisiteur( String nom, String prenom, String login, String mdp, String adresse, String cp, String ville, int dateEmbauche){
        String sqlFileTable = "INSERT INTO visiteur(nom, prenom, login, mdp, adresse, cp, ville, dateEmbauche) VALUES ('"+
                 nom + "', " + prenom + "', " + login + "', " + mdp + "', " + adresse + "', " + cp + "', " + ville + "', " + dateEmbauche + "')";
        this.getWritableDatabase().execSQL(sqlFileTable);

        Log.i("DB", "insertVisiteur invoked");
    }
}

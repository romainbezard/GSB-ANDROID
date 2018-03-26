package com.exemple.gsb_android;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.Date;

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

        // Visiteur
        String sqlFileTable = "CREATE TABLE visiteur(id char PRIMARY KEY," +
                "nom char(30)," +
                "prenom char(30)," +
                "login char(20)," +
                "mdp char(20)," +
                "adresse char(30)," +
                "cp char(5)," +
                "ville char(30)," +
                "dateEmbauche date);";

        // Famille
        String sqlFileTable1 = "CREATE TABLE famille(id varchar PRIMARY KEY," +
                "libelle varchar(30));";

        // Medicaments
        String sqlFileTable2 = "CREATE TABLE medicament(id varchar PRIMARY KEY," +
                "nomCommercial varchar(80)," +
                "idFamille varchar(10)," +
                "composition varchar(100)," +
                "effets varchar(100)," +
                "contreIndications varchar(100)," +
                "FOREIGN KEY(idFamille) REFERENCES famille(id))";

        // Offrir
        String sqlFileTable3 = "CREATE TABLE offrir(idRapport int PRIMARY KEY," +
                "idMedicament varchar(30) PRIMARY KEY," +
                "quantite int(2)," +
                "FOREIGN KEY (idMedicament) REFERENCES medicament(id))";

        //Medecin
        String sqlFileTable4 = "CREATE TABLE medecin(id int(11) PRIMARY KEY," +
                "nom varchar(30)," +
                "prenom varchar(30)," +
                "adresse varchar(80)," +
                "tel varchar(15)," +
                "specialiteComplementaire varchar(50)," +
                "departement int(11))";

        // Rapport
        String sqlFileTable5 = "CREARE TABLE rapport(id int(11) PRIMARY KEY," +
                "date date," +
                "motif varchar(100)," +
                "bilan varchar(100)," +
                "idVisiteur char(4)," +
                "idMedecin int(11)," +
                "FOREIGN KEY (idVisiteur) REFERENCES visiteur(id)," +
                "FOREIGN KEY (idMedecin) REFERENCES medecin(id))";



        db.execSQL(sqlFileTable);
        db.execSQL(sqlFileTable1);
        db.execSQL(sqlFileTable2);
        db.execSQL(sqlFileTable3);
        db.execSQL(sqlFileTable4);
        db.execSQL(sqlFileTable5);
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


    public void insertVisiteur(String id, String nom, String prenom, String login, String mdp, String adresse, String cp, String ville, Date dateEmbauche){
       id = id.replace("'", "''");
        nom = nom.replace("'", "''");
        prenom = prenom.replace("'", "''");
        login = login.replace("'", "''");
        mdp = mdp.replace("'", "''");
        adresse = adresse.replace("'", "''");
        cp = cp.replace("'", "''");
        ville = ville.replace("'", "''");

        String sqlFileTable = "INSERT INTO visiteur(id, nom, prenom, login, mdp, adresse, cp, ville, dateEmbauche) VALUES ('" + id + "', '"
                + nom + "', '" + prenom + "', '" + login + "', '" + mdp + "', '" + adresse + "', '" + cp + "', '" + ville + "', '" + dateEmbauche + "');";
        this.getWritableDatabase().execSQL(sqlFileTable);

        Log.i("DB", "insertVisiteur invoked");
    }





    public boolean verifMdp(String login, String mdp){
        boolean bool = true;
        String req = "SELECT * FROM visiteur WHERE login = '" + login + "' and mdp = '" + mdp + "';";

        Cursor cursor = this.getReadableDatabase().rawQuery(req, null);
        cursor.moveToFirst();
        if(cursor.isAfterLast()){
            bool = false;
        }
        return bool;
    }
}

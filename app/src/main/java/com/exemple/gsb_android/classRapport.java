package com.exemple.gsb_android;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class classRapport {
    private String id;
    private char date;
    private String motif;
    private String bilan;
    private String idVisiteur;
    private String idMedecin;

    public void classRapport(String Id, char Date, String Motif, String Bilan, String IdVisteur, String IdMedecin){
        id = Id;
        date = Date;
        motif = Motif;
        bilan = Bilan;
        idVisiteur = IdVisteur;
        idMedecin = IdMedecin;
    }
}

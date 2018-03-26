package com.exemple.gsb_android;

import java.util.Date;


public class Rapport {
    private String id;
    private Date date;
    private String motif;
    private String bilan;
    private String idVisiteur;
    private Medecin leMedecin;

    public Rapport(String Id, Date Date, String Motif, String Bilan, String IdVisteur, String IdMedecin, Medecin LeMedecin){
        id = Id;
        date = Date;
        motif = Motif;
        bilan = Bilan;
        idVisiteur = IdVisteur;
        this.leMedecin = leMedecin;
        leMedecin = LeMedecin;
    }


    // Méthode

    public void Modifier_Rapport(String motif, String bilan, Date date, Medecin LeMedecin){
        // à finir
    }

    // Set
    public void setDate(Date DATE){
        date = DATE;
    }

    public void setMotif(String Motif){
        motif = Motif;
    }

    public void setBilan(String Bilan){
        bilan = Bilan;
    }

    public void setIdVisiteur(String IdV){
        idVisiteur = IdV;
    }

    public void setMedecin(Medecin LeMedecin){
        leMedecin = LeMedecin;
    }

    // Get
    public String getMotif(){
        return motif;
    }

    public String getBilan(){
        return bilan;
    }

    public String getId(){
        return id;
    }
}

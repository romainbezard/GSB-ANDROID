package com.exemple.gsb_android;

/**
 * Created by charles.morel on 26/03/2018.
 */

public class Offrir {
    private int idRapport;
    private String idMedicament;
    private int quantite;

    public Offrir(int IdRapport, String IdMedicament,int Quantite){
        idMedicament = IdMedicament;
        idRapport =IdRapport;
        quantite = Quantite;
    }

    //Set
    public void setIdRapport(int id){
        idRapport = id;
    }

    public void setIdMedicament(String id){
        idMedicament = id;
    }

    public void setQuantite(int q){
        quantite = q;
    }

    // Get
    public int getIdRapport(){
        return idRapport;
    }

    public String getIdMedicament(){
        return idMedicament;
    }

    public int getQuantite(){
        return quantite;
    }
}

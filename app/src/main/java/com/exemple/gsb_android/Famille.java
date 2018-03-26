package com.exemple.gsb_android;

/**
 * Created by charles.morel on 26/03/2018.
 */

public class Famille {
    private String id;
    private String libelle;

    public Famille(String  ID, String Libelle){
        id = ID;
        libelle = Libelle;
    }

    // Set
    public void setLibelle(String l){
        libelle = l;
    }

    // Get
    public String getLibelle(){
        return libelle;
    }
    public String getId(){
        return id;
    }
}

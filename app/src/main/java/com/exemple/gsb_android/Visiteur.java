package com.exemple.gsb_android;

import java.net.IDN;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class Visiteur {
    private String id;
    private String nom;
    private String prenom;

    public Visiteur(String ID, String Nom, String Prenom)
    {
        id = ID;
        nom = Nom;
        prenom = Prenom;
    }

    // Set

    public void setNom(String ID){
        id = ID;
    }

    public void setPrenom(String Prenom){
        prenom = Prenom;
    }

    // Get
    public String getId(){
        return id;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }
}

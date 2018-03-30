package com.exemple.gsb_android;
import java.io.Serializable;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class Visiteur implements Serializable{
    private String id;
    private String nom;
    private String prenom;

    public Visiteur(String ID, String Nom, String Prenom)
    {
        id = ID;
        nom = Nom;
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

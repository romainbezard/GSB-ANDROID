package com.exemple.gsb_android;

import java.net.IDN;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class Visiteur {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    private char dateEmbauche;

    public Visiteur(String ID, String Nom, String Prenom, String Login, String Mdp, String Adresse, String Cp, String Ville, char DateEmbauche)
    {
        id = ID;
        nom = Nom;
        prenom = Prenom;
        login = Login;
        mdp = Mdp;
        adresse = Adresse;
        cp = Cp;
        ville = Ville;
        dateEmbauche = DateEmbauche;
    }

    // Set

    public void setNom(String ID){
        id = ID;
    }

    public void setPrenom(String Prenom){
        prenom = Prenom;
    }

    public void setAdresse(String Adresse){
        adresse = Adresse;
    }

    public void setCp(String CP){
        cp = CP;
    }

    public void setVille(String Ville){
        ville= Ville;
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

    public String getAdresse(){
        return adresse;
    }

    public String getVille(){
        return ville;
    }

    public String getCp(){
        return cp;
    }
}

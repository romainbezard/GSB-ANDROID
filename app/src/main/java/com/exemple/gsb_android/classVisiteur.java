package com.exemple.gsb_android;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class classVisiteur {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    private char dateEmbauche;

    public void classVisiteur(String ID, String Nom, String Prenom, String Mdp, String Adresse, String Cp, String Ville, char DateEmbauche)
    {
        id = ID;
        nom = Nom;
        prenom = Prenom;
        mdp = Mdp;
        adresse = Adresse;
        cp = Cp;
        ville = Ville;
        dateEmbauche = DateEmbauche;
    }
}

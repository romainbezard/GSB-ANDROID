package com.exemple.gsb_android;

/**
 * Created by charles.morel on 23/03/2018.
 */

public class Medecin {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int tel;
    private String specialitecomplementaire;
    private int departement;

    public Medecin(int ID, String name, String surname, String addr, int Tel, String Specialitecomp, int Departement){
        nom = name;
        prenom = surname;
        adresse = addr;
        tel = Tel;
        specialitecomplementaire =Specialitecomp;
        departement = Departement;
    }

    // Set
    public void setNom(String n){
        nom = n;
    }

    public void setPrenom(String p){
        prenom = p;
    }

    public void setAdresse(String addr){
        adresse = addr;
    }

    public void setTel(int t){
        tel = t;
    }

    public void setSpecialitecomplementaire(String sc){
        specialitecomplementaire = sc;
    }

    public void setDepartement(int dp){
        departement = dp;
    }


    // Get
    public int getId(){
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

    public String getSpecialitecomplementaire(){
        return specialitecomplementaire;
    }

    public int getTel(){
        return tel;
    }

    public int getDepartement(){
        return departement;
    }
}

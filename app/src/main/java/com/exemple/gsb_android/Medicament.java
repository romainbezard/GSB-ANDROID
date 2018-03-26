package com.exemple.gsb_android;

/**
 * Created by charles.morel on 26/03/2018.
 */

public class Medicament {
    private String id;
    private String nomCommercial;
    private String idFamille;
    private String composition;
    private String effets;
    private String contreindications;

    public Medicament(String ID, String NomCom, String IdFamille, String comp, String Effets, String Contreindications){
        id = ID;
        nomCommercial = NomCom;
        idFamille =IdFamille;
        composition = comp;
        effets = Effets;
        contreindications = Contreindications;
    }

    // Set
    public void setNomCommercial(String name){
        nomCommercial = name;
    }

    public void setIdFamille(String id){
        idFamille = id;
    }

    public void setComposition(String comp){
        composition = comp;
    }

    public void setEffets(String e){
        effets = e;
    }

    public void setContreIndications(String ci){
        contreindications = ci;
    }

    // Get
    public String getId(){
        return id;
    }

    public String getNomCommercial(){
        return nomCommercial;
    }

    public String getIdFamille(){
        return idFamille;
    }

    public String getComposition(){
        return composition;
    }

    public String getEffets(){
        return effets;
    }

    public String getcontreIndications(){
        return contreindications;
    }
}

package com.exemple.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by romain.bezard on 19/03/2018.
 */

public class accueil extends Activity{

    public static final String EXTRA_VISITEUR = "com.example.application.example.EXTRA_VISITEUR";

    private Button btnMesVisites, btnMesMedecins, btnDeconnexion;
    private TextView txtBonjour;
    private ImageView imageView;
    private String Login, mdp;
    private Intent intent;
    private Visiteur Vis = null;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.accueil);

        // Instanciation de l'image
        imageView = findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);

        // Instanciation des boutons
        btnMesMedecins = findViewById(R.id.Btn_mesMedecins);
        btnDeconnexion = findViewById(R.id.Btn_Deconnexion);
        btnMesVisites = findViewById(R.id.Btn_mesVisites);

        // Instanciation TextView
        txtBonjour = findViewById(R.id.bonjour);

        // Instanciation des variables
        intent = getIntent();
        Vis = (Visiteur) intent.getSerializableExtra(login.EXTRA_VISITEUR);
        // Bonjour, nom prenom
        txtBonjour.setText(txtBonjour.getText() + " " + Vis.getNom() + " " + Vis.getPrenom());

        // Deconnexion
        btnDeconnexion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLogin();
            }
        });

        // Visites
        btnMesVisites.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openVisite();
            }
        });

        // Medecin
        btnMesMedecins.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMedecin();
            }
        });
    }

    public void openLogin(){
        intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void openVisite(){
        intent = new Intent(this, rapportdevisite.class);
        intent.putExtra(EXTRA_VISITEUR, Vis);
        startActivity(intent);
    }

    public void openMedecin(){
        intent = new Intent(this, medecins.class);
        startActivity(intent);
    }
}

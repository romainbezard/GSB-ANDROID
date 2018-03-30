package com.exemple.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class rapportdevisite extends Activity {

    public static final String EXTRA_VISITEUR = "com.example.application.example.EXTRA_VISITEUR";

    private Button btnModifierRapport, btnAjouterRapport;
    private ImageView imageView;
    private Intent intent;
    private Visiteur Vis;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.rapportdevisite);

        // Instancisation de l'image
        imageView = findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);

        // Instanciation des boutons
        btnAjouterRapport = findViewById(R.id.Btn_AjouterRapport);
        btnModifierRapport = findViewById(R.id.Btn_ModifierRapport);

        // Instanciation du visiteur
        intent = getIntent();
        Vis = (Visiteur)intent.getSerializableExtra(accueil.EXTRA_VISITEUR);

        // Modifier Rapport
        btnModifierRapport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openModif();
            }
        });

        // Ajouter Rapport
        btnAjouterRapport.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAjout();
            }
        });
    }

    public void openModif(){
        intent = new Intent(this, modifierrapport.class);
        intent.putExtra(EXTRA_VISITEUR, Vis);
        startActivity(intent);
    }

    public void openAjout(){
        intent = new Intent(this, ajouterrapport.class);
        intent.putExtra(EXTRA_VISITEUR, Vis);
        startActivity(intent);
    }
}
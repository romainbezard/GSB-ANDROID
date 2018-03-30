package com.exemple.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class medecins extends Activity {

    private EditText rechercheMedecin, medecin;
    private Button modifierInfos, rapportVisite;
    private Intent intent;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.medecins);

        // Instanciation des EditText
        rechercheMedecin = findViewById(R.id.Edit_RechercheMedecin);
        medecin = findViewById(R.id.Edit_Medecin);

        // Instanciation des boutons
        modifierInfos = findViewById(R.id.Btn_VoirModifierInfos);
        rapportVisite = findViewById(R.id.Btn_VoirRapportsMedecin);

        // Bouton modifier infos
        modifierInfos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openInfosMedecin();
            }
        });

        // Bouton rapport medecin
        rapportVisite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRapportVisite();
            }
        });
    }

    public void openInfosMedecin(){
        intent = new Intent(this, majmedecin.class);
        startActivity(intent);
    }

    public void openRapportVisite(){
        intent = new Intent(this, listerapports.class);
        startActivity(intent);
    }

}

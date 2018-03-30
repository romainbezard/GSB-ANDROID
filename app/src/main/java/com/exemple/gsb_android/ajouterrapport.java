package com.exemple.gsb_android;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class ajouterrapport extends Activity {

    public static final String EXTRA_VISITEUR = "com.example.application.example.EXTRA_VISITEUR";

    private EditText rechercheMedecin, medecin, motifRapport, bilanRapport;
    private Button btnDateRapport, btnNewMedicament, btnEnregistrer;
    private Intent intent;
    private Visiteur visiteur;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.ajouterrapport);

        // Instanciation des EditText
        rechercheMedecin = findViewById(R.id.Edit_RechercheMedecin);
        medecin = findViewById(R.id.Edit_Medecin);
        motifRapport = findViewById(R.id.Edit_MotifRapport);
        bilanRapport = findViewById(R.id.Edit_BilanRapport);

        // Instanciation des boutons
        btnDateRapport = findViewById(R.id.Btn_DateRapport);
        btnNewMedicament = findViewById(R.id.Btn_NouveauMedicament);
        btnEnregistrer = findViewById(R.id.Btn_Enregistrer);

        // Nouveau medicament
        btnNewMedicament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addNewMedoc();
            }
        });

        // Enregistrer
        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });

    }

    // Afficher le calendrier
    public void showDatePickerDialog(View v){
        DialogFragment newFragment = new DatePickerAjout();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    public void addNewMedoc(){
        // do something...
        Intent intent = new Intent(this, PopAddMedoc.class);
        startActivity(intent);
    }

    public void save(){
        // do something...
    }
}
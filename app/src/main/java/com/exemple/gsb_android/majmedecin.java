package com.exemple.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class majmedecin extends Activity {

    private TextView txtNomMedecin;
    private EditText adresseMedecin, telMedecin, specialiteMedecin;
    private Button valider;
    Intent intent;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.majmedecin);

        // Instanciation du textView
        txtNomMedecin = findViewById(R.id.Txt_NomMedecin);

        // Instanciation EditText
        adresseMedecin = findViewById(R.id.Edit_AdresseMedecin);
        telMedecin = findViewById(R.id.Edit_TelMedecin);
        specialiteMedecin = findViewById(R.id.Edit_SpecialiteMedecin);

        // Instanciation Button
        valider = findViewById(R.id.Btn_ValiderMaj);

        // Valider
        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeMaj();
            }
        });
    }

    public void closeMaj(){
        // ICI FAUT FAIRE UN AJOUT DANS LA BASE DE DONNEES
        intent = new Intent(this, medecins.class);
        startActivity(intent);
    }
}

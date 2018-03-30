package com.exemple.gsb_android;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class listerapports extends Activity {

    private Button afficheColonne, choisirDate;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.listerapports);

        // Instanciation Button
        afficheColonne = findViewById(R.id.Btn_AfficheColonnes);
        choisirDate = findViewById(R.id.Btn_ChoisirDate);

        // Affiche Colonne
        afficheColonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRows();
            }
        });

        // Choix de la date
        choisirDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog(view);
            }
        });
    }

    public void showDatePickerDialog(View v){
        DialogFragment newFragment = new DatePickerRapport();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    public void openRows(){
        // do something...
    }
}


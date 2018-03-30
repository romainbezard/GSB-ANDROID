package com.exemple.gsb_android;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Date;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class modifierrapport extends Activity {

    private Button btnChoixDate;
    private Visiteur Vis;
    private Intent intent;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.modifierrapport);

        // Instanciation bouton
        btnChoixDate = findViewById(R.id.Btn_ChoisirDate);

        // Instanciation du visiteur
        intent = getIntent();
        Vis = (Visiteur)intent.getSerializableExtra(accueil.EXTRA_VISITEUR);
    }

    public void showDatePickerDialog(View v){
        DialogFragment newFragment = new DatePicker();
        newFragment.show(getFragmentManager(), "datePicker");
    }

}
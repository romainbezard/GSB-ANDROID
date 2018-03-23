package com.exemple.gsb_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by romain.bezard on 19/03/2018.
 */

public class login extends Activity {

    ImageView imageView;
    EditText login, mdp;
    Button btnConnexion;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.login);

        // Instanciation de l'image
        imageView = findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);

        // Instanciation des textBox
        login = findViewById(R.id.Login);
        mdp = findViewById(R.id.Mdp);

        // Instanciation du bouton connexion
        btnConnexion = findViewById(R.id.Btn_connexion);

    }

    // Quand on clique sur le bouton de connexion

    private void btnConnexion_Click(){

    }


}

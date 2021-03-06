package com.exemple.gsb_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;





import com.exemple.gsb_android.LocalSQLiteOpenHelper;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by romain.bezard on 19/03/2018.
 */

public class login extends Activity {

    public static final String EXTRA_VISITEUR = "com.example.application.example.EXTRA_VISITEUR";


    private ImageView imageView;
    private EditText login, mdp;
    private Button btnConnexion;
    private TextView errorLogin;
    private TextView visiteurView;
    private LocalSQLiteOpenHelper localSQLiteOpenHelper;
    private Visiteur visiteur;


    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.login);


        // Instanciation de l'image
        imageView = findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);

        // Instanciation des textBox
        login = findViewById(R.id.Login);
        mdp = findViewById(R.id.Mdp);

        // Instanciation ErrorLogin
        errorLogin = findViewById(R.id.ErrorLogin);
        visiteurView = findViewById(R.id.visiteurView);

        // Instanciation du bouton connexion
        btnConnexion = findViewById(R.id.Btn_connexion);

        // Instanciation de la BDD
        localSQLiteOpenHelper = new LocalSQLiteOpenHelper(this);
        //localSQLiteOpenHelper.insertVisiteur("a132","Pnt", "Coco", "pcoco", "aaaa", "12 avenue lorraine", "01000", "Bourg", "23/03/2018");
        localSQLiteOpenHelper.close();

        // Connexion
        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccueil();
            }
        });
    }

    // Quand on clique sur le bouton de connexion

    public void openAccueil() {
        String log = login.getText().toString();
        String MDP = mdp.getText().toString();
        Boolean connexion;
        localSQLiteOpenHelper = new LocalSQLiteOpenHelper(this);
        connexion = localSQLiteOpenHelper.verifMdp(log, MDP);
        localSQLiteOpenHelper.close();

        if (connexion) {
            visiteur = localSQLiteOpenHelper.selectVisiteur(log,MDP);
           if(visiteur != null){
                Intent intent = new Intent(this, accueil.class);
                intent.putExtra(EXTRA_VISITEUR,visiteur);
                startActivity(intent);
           }
        } else {
            errorLogin.setText("Identifiant et/ou mot de passe invalide");
        }
    }
}

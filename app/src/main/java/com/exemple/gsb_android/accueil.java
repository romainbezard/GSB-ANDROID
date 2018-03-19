package com.exemple.gsb_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by romain.bezard on 19/03/2018.
 */

public class accueil extends Activity{

    Button btnMesVissites, btnMesMedecins, btnDeconnexion;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.accueil);
        imageView = (ImageView)findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);
    }
}

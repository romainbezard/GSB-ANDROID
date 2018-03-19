package com.exemple.gsb_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by romain.bezard on 19/03/2018.
 */

public class activity_main extends Activity {

    ImageView imageView;
    EditText login, mdp;
    Button btnConnexion;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);
    }

    private void btnConnexion_Click(){

    }


}

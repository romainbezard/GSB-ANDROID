package com.exemple.gsb_android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by celine.duclos on 23/03/2018.
 */

public class ajouterrapport extends Activity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.ajouterrapport);
        imageView = (ImageView)findViewById(R.id.imageGSB);
        imageView.setImageResource(R.mipmap.gsb);
    }
}
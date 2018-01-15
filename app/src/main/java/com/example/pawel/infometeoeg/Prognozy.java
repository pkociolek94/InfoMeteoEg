package com.example.pawel.infometeoeg;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;
import com.squareup.picasso.Picasso;

public class Prognozy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prognozy);
        Shimmer shimmer = new Shimmer();
        ShimmerTextView tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
        shimmer.setDuration(2500);
        shimmer.start(tv);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/test.ttf");
        tv.setTypeface(face);
        ImageView iv = (ImageView) findViewById(R.id.prognoza);
        //Picasso.with(getApplicationContext()).load("http://www.meteoelblag.pl/wp-content/uploads/2017/10/Prognoza_czwartek.jpeg").into(iv);

    }
}

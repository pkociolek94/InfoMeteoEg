package com.example.pawel.infometeoeg;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;
import com.squareup.picasso.Picasso;

import me.itangqi.waveloadingview.WaveLoadingView;


public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private String[] elementy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDesign();
        final WaveLoadingView wv = (WaveLoadingView)findViewById(R.id.waveLoadingView);
        final Button test = (Button)findViewById(R.id.test);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView iv = (ImageView) findViewById(R.id.prognoza);
                wv.setProgressValue(5);
                Picasso.with(getApplicationContext()).load("http://www.meteoelblag.pl/wp-content/uploads/2017/10/Prognoza_czwartek.jpeg").into(iv);

            }
        });
    }

        public void setDesign(){
            Shimmer shimmer = new Shimmer();
            ShimmerTextView tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
            shimmer.setDuration(2500);
            shimmer.start(tv);
            Typeface face=Typeface.createFromAsset(getAssets(),"test1.ttf");

            Button button = (Button) findViewById(R.id.test);
            Button button1 = (Button) findViewById(R.id.test1);
            Button button2 = (Button) findViewById(R.id.test2);
            Typeface face1=Typeface.createFromAsset(getAssets(),"czcionka.ttf");
            button.setTypeface(face1);
            button1.setTypeface(face1);
            button2.setTypeface(face1);
            tv.setTypeface(face1);
    }

    }



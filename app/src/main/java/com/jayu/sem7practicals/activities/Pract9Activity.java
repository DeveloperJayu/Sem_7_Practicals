package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.jayu.sem7practicals.R;

public class Pract9Activity extends AppCompatActivity {

    ImageView imgPract9;
    Button btnRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract9);

        imgPract9 = findViewById(R.id.imgPract9);
        btnRotate = findViewById(R.id.btnRotate);

        btnRotate.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
            imgPract9.startAnimation(animation);
        });
    }
}
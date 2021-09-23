package com.jayu.sem7practicals.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.jayu.sem7practicals.R;

public class Pract3Activity extends AppCompatActivity {

    Button btnImplicit,btnExplicit,btnActivityAsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract3);
        btnImplicit=findViewById(R.id.btnImplicit);
        btnExplicit=findViewById(R.id.btnExplicit);
        btnActivityAsResult=findViewById(R.id.btnActivityAsResult);
        setTitle("Practical 3");

        btnImplicit.setOnClickListener(view ->{
            String url = "https://www.google.co.in";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        });

        btnExplicit.setOnClickListener(view ->{
            Intent intent = new Intent(Pract3Activity.this,MainActivity.class);
            startActivity(intent);
            finish();
        });

        btnActivityAsResult.setOnClickListener(view -> {
            Intent intent = new Intent(Pract3Activity.this,Pract3SecondActivity.class);
            startActivityForResult(intent,2);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode ==2){
            String message = data.getStringExtra("MESSAGE");
            Toast.makeText(Pract3Activity.this, message, Toast.LENGTH_LONG).show();
        }
    }
}
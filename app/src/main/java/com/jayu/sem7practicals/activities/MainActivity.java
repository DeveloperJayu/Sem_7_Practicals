package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jayu.sem7practicals.R;

public class MainActivity extends AppCompatActivity {

    Button btnPract1,btnPract2Relative,btnPract2Linear,btnPract2Table,btnPract3,btnPract4,btnPract5,btnPract6,btnPract7,btnPract8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

        btnPract1 = findViewById(R.id.btnPract1);
        btnPract2Relative = findViewById(R.id.btnPract2Relative);
        btnPract2Linear = findViewById(R.id.btnPract2Linear);
        btnPract2Table = findViewById(R.id.btnPract2Table);
        btnPract3 = findViewById(R.id.btnPract3);
        btnPract4 = findViewById(R.id.btnPract4);
        btnPract5 = findViewById(R.id.btnPract5);
        btnPract6 = findViewById(R.id.btnPract6);
        btnPract7 = findViewById(R.id.btnPract7);
        btnPract8 = findViewById(R.id.btnPract8);

        btnPract1.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract1Activity.class);
            intent.putExtra("title","Practical 1");
            startActivity(intent);
        });

        btnPract2Relative.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract1Activity.class);
            intent.putExtra("title","Practical 2 Relative");
            startActivity(intent);
        });

        btnPract2Linear.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract1Activity.class);
            intent.putExtra("title","Practical 2 Linear");
            startActivity(intent);
        });

        btnPract2Table.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract1Activity.class);
            intent.putExtra("title","Practical 2 Table");
            startActivity(intent);
        });

        btnPract3.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract3Activity.class);
            startActivity(intent);
        });

        btnPract4.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract4Activity.class);
            startActivity(intent);
        });

        btnPract5.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract5Activity.class);
            startActivity(intent);
        });

        btnPract6.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract6Activity.class);
            startActivity(intent);
        });

        btnPract7.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract7Activity.class);
            startActivity(intent);
        });

        btnPract8.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this,Pract8Activity.class);
            startActivity(intent);
        });

    }
}
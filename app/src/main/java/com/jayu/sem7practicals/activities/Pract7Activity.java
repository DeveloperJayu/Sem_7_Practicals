package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jayu.sem7practicals.R;

public class Pract7Activity extends AppCompatActivity {

    EditText edtName;
    Button btnSubmit;
    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract7);

        edtName = findViewById(R.id.edtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtName = findViewById(R.id.txtName);
    }
}
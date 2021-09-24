package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jayu.sem7practicals.R;
import com.jayu.sem7practicals.model.pract7Model;
import com.jayu.sem7practicals.utils.pract7DatabaseClient;

import java.util.ArrayList;
import java.util.List;

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

        btnSubmit.setOnClickListener(view -> {
            String name = edtName.getText().toString().trim();
            if (name.isEmpty()) {
                edtName.setError("Please Enter Name");
                edtName.requestFocus();
                return;
            }
            pract7Model model = new pract7Model(name);
            pract7DatabaseClient.getInstance(getApplicationContext()).getAppDatabase().pract7Dao().insert(model);
        });
        txtName.setText(pract7DatabaseClient.getInstance(getApplicationContext()).getAppDatabase().pract7Dao().getAll().getName());
    }
}
package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.jayu.sem7practicals.R;

public class Pract10Activity extends AppCompatActivity {

    EditText edtName, edtAge;
    Button btnSave;
    TextView txtName,txtAge;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    String getName, getAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract10);

        setTitle("Practical 10");

        edtName = findViewById(R.id.edtName);
        edtAge = findViewById(R.id.edtAge);
        btnSave = findViewById(R.id.btnSave);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        pref = getPreferences(0);
        editor = pref.edit();

        getName = pref.getString("name","");
        getAge = pref.getString("age","");
        txtName.setText(getName);
        txtAge.setText(getAge);

        btnSave.setOnClickListener(view -> {
            String name = edtName.getText().toString().trim();
            String age = edtAge.getText().toString().trim();

            if (name.isEmpty()){
                edtName.setError("Please Enter Name");
                edtName.requestFocus();
                return;
            }
            else if(age.isEmpty()){
                edtAge.setError("Please Enter Age");
                edtAge.requestFocus();
                return;
            }

            editor.putString("name",name);
            editor.putString("age",age);
            editor.apply();

        });

    }
}
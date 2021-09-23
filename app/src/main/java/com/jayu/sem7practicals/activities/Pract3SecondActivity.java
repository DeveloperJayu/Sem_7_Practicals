package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.jayu.sem7practicals.R;

public class Pract3SecondActivity extends AppCompatActivity {

    EditText edtText;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract3_second);
        setTitle("Practical 3 Second");

        edtText = findViewById(R.id.edtText);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(view -> {
            String message = edtText.getText().toString().trim();
            if (message.isEmpty()){
                edtText.setError("Please Enter Something");
                edtText.requestFocus();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("MESSAGE",message);
            setResult(2,intent);
            finish();
        });
    }
}
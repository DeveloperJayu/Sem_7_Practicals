package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jayu.sem7practicals.R;

public class Pract1Activity extends AppCompatActivity {

    EditText edtName,edtEmail,edtPassword;
    CheckBox chkBoxAndroid,chkBoxWeb;
    TextView txtChkBoxError;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String title = getIntent().getStringExtra("title");

        switch (title) {
            case "Practical 1":
            case "Practical 2 Relative":
                setContentView(R.layout.activity_pract1);
                break;
            case "Practical 2 Linear":
                setContentView(R.layout.layout_pract2_linear);
                break;
            case "Practical 2 Table":
                setContentView(R.layout.layout_pract2_table);
                break;
        }
        setTitle(title);

        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        chkBoxAndroid = findViewById(R.id.chkBoxAndroid);
        chkBoxWeb = findViewById(R.id.chkBoxWeb);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtChkBoxError = findViewById(R.id.txtChkBoxError);

        btnSubmit.setOnClickListener(view->{
            String name = edtName.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();
            txtChkBoxError.setVisibility(View.GONE);
            if (name.isEmpty()){
                edtName.setError("Please Enter A Name");
                edtName.requestFocus();
                return;
            }
            else if (email.isEmpty()){
                edtEmail.setError("Please Enter Email");
                edtEmail.requestFocus();
                return;
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                edtEmail.setError("Please Enter Valid Email");
                edtEmail.requestFocus();
                return;
            }
            else if (password.isEmpty()){
                edtPassword.setError("Please Enter Password");
                edtPassword.requestFocus();
                return;
            }
            else if (!chkBoxWeb.isChecked() && !chkBoxAndroid.isChecked()){
                txtChkBoxError.setText("Please select one or more checkboxes");
                txtChkBoxError.setVisibility(View.VISIBLE);
                return;
            }
            Toast.makeText(Pract1Activity.this,"Submitted",Toast.LENGTH_SHORT).show();
        });

    }
}
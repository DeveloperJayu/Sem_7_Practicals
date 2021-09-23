package com.jayu.sem7practicals.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jayu.sem7practicals.R;
import com.jayu.sem7practicals.adapters.pract6RecyclerAdapter;
import com.jayu.sem7practicals.model.pract6Model;

import java.util.ArrayList;

public class Pract6Activity extends AppCompatActivity {

    RecyclerView recyclerPract6;
    pract6RecyclerAdapter pract6RecyclerAdapter;
    ArrayList<pract6Model> persons = new ArrayList<pract6Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pract6);
        setTitle("Practical 6");
        recyclerPract6 = findViewById(R.id.recyclerPract6);
        pract6RecyclerAdapter = new pract6RecyclerAdapter(persons);
        recyclerPract6.setHasFixedSize(true);
        recyclerPract6.setLayoutManager(new LinearLayoutManager(this));
        recyclerPract6.setAdapter(pract6RecyclerAdapter);
        persons.clear();

        persons.add(new pract6Model("Black Panther","America",R.drawable.black_panther));
        persons.add(new pract6Model("Captain America","America",R.drawable.captain_america));
        persons.add(new pract6Model("Hulk","America",R.drawable.hulk));
        persons.add(new pract6Model("Thor","America",R.drawable.thor));
        persons.add(new pract6Model("Tony Stark","America",R.drawable.tony_stark_new));
        persons.add(new pract6Model("Black Widow","America",R.drawable.widow));
        pract6RecyclerAdapter.notifyDataSetChanged();
    }
}
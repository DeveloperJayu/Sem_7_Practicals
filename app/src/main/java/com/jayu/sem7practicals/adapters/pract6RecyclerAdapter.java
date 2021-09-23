package com.jayu.sem7practicals.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jayu.sem7practicals.R;
import com.jayu.sem7practicals.model.pract6Model;

import java.util.ArrayList;

public class pract6RecyclerAdapter extends RecyclerView.Adapter<pract6RecyclerAdapter.ViewHolder> {

    ArrayList<pract6Model> persons;

    public pract6RecyclerAdapter(ArrayList<pract6Model> persons){
        this.persons = persons;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView name;
        private final TextView address;
        private final ImageView image;
        private ArrayList<pract6Model> person;

        public ViewHolder(@NonNull View view) {
            super(view);
            name = view.findViewById(R.id.personName);
            address = view.findViewById(R.id.personAddress);
            image = view.findViewById(R.id.personImage);
            view.findViewById(R.id.btnDelete).setOnClickListener(view1 -> {
                person.remove(getAdapterPosition());
            });
        }

        public TextView getName() {
            return name;
        }

        public TextView getAddress() {
            return address;
        }

        public ImageView getImage() {
            return image;
        }
    }

    @NonNull
    @Override
    public pract6RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pract6_single_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull pract6RecyclerAdapter.ViewHolder holder, int position) {
        holder.getName().setText(persons.get(position).getName());
        holder.getAddress().setText(persons.get(position).getAddress());
        holder.getImage().setImageResource(persons.get(position).getImage());
        holder.person = persons;
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}

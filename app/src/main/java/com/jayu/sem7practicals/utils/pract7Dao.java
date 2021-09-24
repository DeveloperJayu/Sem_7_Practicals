package com.jayu.sem7practicals.utils;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.jayu.sem7practicals.model.pract7Model;

@Dao
public interface pract7Dao {

    @Insert
    void insert(pract7Model model);

    @Query("SELECT * from pract7Model")
    pract7Model getAll();

}

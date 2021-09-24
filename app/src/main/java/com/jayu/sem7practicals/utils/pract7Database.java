package com.jayu.sem7practicals.utils;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.jayu.sem7practicals.model.pract7Model;

@Database(entities = {pract7Model.class}, version = 1)
public abstract class pract7Database extends RoomDatabase {

    public abstract pract7Dao pract7Dao();

}

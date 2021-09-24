package com.jayu.sem7practicals.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class pract7Model {

    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "fName")
    public String name;

    public pract7Model(String name){
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

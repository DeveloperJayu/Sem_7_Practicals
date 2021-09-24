package com.jayu.sem7practicals.utils;

import android.content.Context;

import androidx.room.Room;

public class pract7DatabaseClient {

    private Context mCtx;
    private static pract7DatabaseClient mInstance;

    private pract7Database appDatabase;

    private pract7DatabaseClient(Context context){
        this.mCtx = context;

        appDatabase = Room.databaseBuilder(mCtx,pract7Database.class,"Pract7").allowMainThreadQueries().build();
    }

    public static synchronized pract7DatabaseClient getInstance(Context context){
        if (mInstance == null){
            mInstance = new pract7DatabaseClient(context);
        }
        return mInstance;
    }

    public pract7Database getAppDatabase() {
        return appDatabase;
    }
}

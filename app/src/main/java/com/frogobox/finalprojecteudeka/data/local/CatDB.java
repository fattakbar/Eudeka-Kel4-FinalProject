package com.frogobox.finalprojecteudeka.data.local;

import android.content.Context;


import com.frogobox.finalprojecteudeka.model.Cat;
import com.frogobox.finalprojecteudeka.model.Favorite;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * FinalProjectEudeka
 * Copyright (C) 15/03/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Line     : bullbee117
 * Phone    : 081357108568
 * Majors   : D3 Teknik Informatika 2016
 * Campus   : Telkom University
 * -----------------------------------------
 * id.amirisback.frogobox
 */

@Database(entities = {Cat.class, Favorite.class}, version = 1)
public abstract class CatDB extends RoomDatabase {

    private static CatDB INSTANCE;
    public abstract CatDao catDao();
    public abstract FavoriteDao favoriteDao();
    private static final Object syncLock = new Object();

    public static CatDB getInstance(Context context) {
        synchronized (syncLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    CatDB.class, "cat.db")
                    .build();
            }

            return INSTANCE;
        }
    }
}

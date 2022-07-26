package com.example.androidroommvvm.room_database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "martial_art_table")
public class MartialArt {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "fav_martial_art")
    private String mFavMartialArt;

    public MartialArt(@NonNull String favMartialArt) {

        mFavMartialArt = favMartialArt;

    }

    public String getFavMartialArt() {
        return mFavMartialArt;
    }


}

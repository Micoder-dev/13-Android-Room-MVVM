package com.example.androidroommvvm.room_database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MartialArtDAO {

    @Insert
    void insertMartialArt(MartialArt martialArt);

    @Query("Delete FROM martial_art_table")
    void deleteAllMartialArts();

    @Delete
    void deleteMartialArt(MartialArt martialArt);

    @Query("Select * FROM martial_art_table ORDER BY fav_martial_art ASC")
    LiveData<List<MartialArt>> getAllMartialArtsInAnAlphabeticalOrder();

}

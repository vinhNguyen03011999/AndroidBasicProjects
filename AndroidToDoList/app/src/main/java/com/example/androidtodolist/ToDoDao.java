package com.example.androidtodolist;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ToDoDao {
    @Query("SELECT * FROM Todo")
    List<Todo> getAll();


    @Insert
    void insert(Todo... todo);

}
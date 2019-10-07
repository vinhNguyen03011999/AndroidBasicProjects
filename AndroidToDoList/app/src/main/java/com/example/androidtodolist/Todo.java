package com.example.androidtodolist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Todo {
    @PrimaryKey
    public int id;
    public String task;
}

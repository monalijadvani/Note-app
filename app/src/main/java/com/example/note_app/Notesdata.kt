package com.example.note_app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Notes")
data class Notesdata(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "Title") var Title: String,
    @ColumnInfo(name = "Addnt") var Addnt: String,
    @ColumnInfo(name = "Date") var Date: String
)

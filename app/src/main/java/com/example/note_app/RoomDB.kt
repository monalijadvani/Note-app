package com.example.note_app

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Notesdata::class], version = 1)
abstract class RoomDB : RoomDatabase() {
       companion object {
           var DB_NAME = "NoteApp"
           fun getInstance(context: Context): RoomDB {

               var room = Room.databaseBuilder(context, RoomDB::class.java, DB_NAME)
                   .allowMainThreadQueries()
                   .fallbackToDestructiveMigration()
                   .build()
               return room
           }
       }
        abstract  fun getNoteDao(): NoteDao

}
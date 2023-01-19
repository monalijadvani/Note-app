package com.example.note_app

import android.icu.text.CaseMap.Title
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {
    @Insert()
    fun addNote(data: Notesdata)

    @Delete()
    fun deleteNote(data: Notesdata)

    @Query("SELECT * FROM Notes ORDER BY id DESC")
    fun getNotes() : List<Notesdata>

    @Query("UPDATE Notes SET Title= :title, Addnt= :notes, Date= :date WHERE id= :id")
    fun editNotes(id:Int, title: String, notes: String, date: String)

}
package com.example.note_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.note_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var notes: List<Notesdata>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        roomDB = RoomDB.getInstance(this)


        binding.recycleview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

//        LoadNotes()

        binding.addbtn.setOnClickListener {

            startActivity(Intent(this, Addnote_Activity::class.java))

        }

    }

    companion object {
        lateinit var roomDB: RoomDB
        lateinit var adapter: Notes_Adapter

        fun UpdateLoadNotes() {
            var final_notes: ArrayList<Notesdata> = ArrayList()
            var note = roomDB.getNoteDao().getNotes()
            final_notes.clear()

        }
    }
}
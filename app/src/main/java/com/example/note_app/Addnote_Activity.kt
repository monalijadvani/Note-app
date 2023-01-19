package com.example.note_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.note_app.databinding.ActivityAddnoteBinding
import java.text.SimpleDateFormat
import java.lang.Exception
import java.util.*

class Addnote_Activity : AppCompatActivity() {

    lateinit var roomDB: RoomDB

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityAddnoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        roomDB = RoomDB.getInstance(this)

        binding.savebtn.setOnClickListener{
            val date = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
            val currentDate = date.format(Date())

            var listing = roomDB.getNoteDao().getNotes()

            var id = 0
            try {
                if(listing.size<=0){
                    id = 1
                }
                else{
                   id = listing.get(0).id
                   id++
                }
            }catch (e:Exception){

            }
//            var notes = Notesdata(id, edt_title)
        }

    }
}
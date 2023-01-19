package com.example.note_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.note_app.Notes_Adapter.*

class Notes_Adapter(mainActivity: MainActivity, notes: List<Notesdata>): RecyclerView.Adapter<NotesHolder>() {
    var dataList = notes
    var MainActivity = mainActivity
    var roomDB: RoomDB = RoomDB.getInstance(mainActivity)
    class NotesHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var txttitle = itemView.findViewById<TextView>(R.id.txttitle)
        var txtnote = itemView.findViewById<TextView>(R.id.txtnote)
        var txtdate = itemView.findViewById<TextView>(R.id.date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesHolder {
        var view = LayoutInflater.from(MainActivity).inflate(R.layout.rcv_item, parent, false)
        return NotesHolder(view)
    }

    override fun onBindViewHolder(holder: NotesHolder, position: Int) {
        holder.txttitle.text = dataList.get(position).Title
        holder.txtnote.text = dataList.get(position).Addnt
        holder.txtdate.text = dataList.get(position).Date

        holder.txttitle.isSelected = true
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
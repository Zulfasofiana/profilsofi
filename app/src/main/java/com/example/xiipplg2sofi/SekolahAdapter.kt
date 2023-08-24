package com.example.xiipplg2sofi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SekolahAdapter(private val list:ArrayList<SekolahData>):
    RecyclerView.Adapter<SekolahAdapter.sekolahViewHolder>() {

    class sekolahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nama = itemView.findViewById<TextView>(R.id.namaSekolah)
        val alamat = itemView.findViewById<TextView>(R.id.alamatSekolah)

        fun bind(get: SekolahData) {
            nama.text = get.nama
            alamat.text = get.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): sekolahViewHolder {
        return sekolahViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.list_sekolah,parent,false))
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: sekolahViewHolder, position: Int) {
        holder.bind(list[position])
    }
}

package com.example.xiipplg2sofi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SekolahActivity : AppCompatActivity() {
    lateinit var sekolahView: RecyclerView
    lateinit var sekolahAdapter: SekolahAdapter
    val list = ArrayList<SekolahData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sekolah)

        sekolahView = findViewById(R.id.rvSekolah)
        sekolahView.layoutManager = LinearLayoutManager(this)

        list.add(SekolahData("SDN Daleman", "Kec. Sayung, Kab.Demak"))
        list.add(SekolahData("SMPN 2 Sayung", "Jl. Raya Semarang-Demak, Kec. Sayung, Kab.Demak"))
        list.add(SekolahData("SMKN 1 Sayung","Jl. Raya Semarang-Demak km14, Kec. Sayung, Kab.Demak"))

        sekolahAdapter = SekolahAdapter(list)
        sekolahView.adapter = sekolahAdapter
    }
}
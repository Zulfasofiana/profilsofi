package com.example.xiipplg2sofi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProjectActivity : AppCompatActivity() {

    lateinit var projectView: RecyclerView
    lateinit var projectAdapter: ProjectAdapter
    val list = ArrayList<ProjectData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        projectView = findViewById(R.id.rvProject)
        projectView.layoutManager = LinearLayoutManager(this)

        list.add(
            ProjectData("DuplicateApp", "Project latihan DuplicateApp",
                "https://github.com/Zulfasofiana/DUPLICATEAPP")
        )

        list.add(
            ProjectData("Profil Guru", "Project latihan Profil Guru",
                "https://github.com/Zulfasofiana/profilguru")
        )

        projectAdapter = ProjectAdapter(list)
        projectView.adapter = projectAdapter

    }
}
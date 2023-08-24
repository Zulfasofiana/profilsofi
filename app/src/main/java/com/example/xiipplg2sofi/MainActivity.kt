package com.example.xiipplg2sofi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile: CardView = findViewById(R.id.profile)
        val btnEducation: CardView = findViewById(R.id.Education)
        val btnSkill: CardView = findViewById(R.id.Skill)
        val btnPortfolio: CardView = findViewById(R.id.Portfolio)
        val btnHobby: CardView = findViewById(R.id.Hobby)

        btnProfile.setOnClickListener{
           val intent = Intent( this, ProfilActivity::class.java)
            startActivity(intent)
        }
        btnEducation.setOnClickListener{
            val intent = Intent( this, SekolahActivity::class.java)
            startActivity(intent)
        }
        btnSkill.setOnClickListener{
            val intent = Intent( this, SkillActivity::class.java)
            startActivity(intent)
        }
        btnPortfolio.setOnClickListener{
            val intent = Intent( this, ProjectActivity::class.java)
            startActivity(intent)
        }
        btnHobby.setOnClickListener{
            val intent = Intent( this, HobbyActivity::class.java)
            startActivity(intent)
        }
    }
}



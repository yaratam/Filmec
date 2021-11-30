package com.example.filmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fgfg = findViewById<ImageView>(R.id.one)

        fgfg.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}
package com.example.filmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class fourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val fgfg = findViewById<ImageView>(R.id.two)

        fgfg.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
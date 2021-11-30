package com.example.filmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val fgfg = findViewById<ImageView>(R.id.home)

        fgfg.setOnClickListener{
            startActivity(Intent(this,thirdActivity::class.java))
        }
    }
}
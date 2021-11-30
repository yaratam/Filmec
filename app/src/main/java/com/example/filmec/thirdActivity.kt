package com.example.filmec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val fgfg = findViewById<ImageView>(R.id.search)

        fgfg.setOnClickListener {
            startActivity(Intent(this, fourthActivity::class.java))
        }
    }
}
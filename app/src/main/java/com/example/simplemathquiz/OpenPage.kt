package com.example.simplemathquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OpenPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_page)

        val openButton: Button = findViewById(R.id.openButton)
        openButton.setOnClickListener {
            val intent = Intent(this@OpenPage, Description::class.java)
            startActivity(intent)
        }
    }
}
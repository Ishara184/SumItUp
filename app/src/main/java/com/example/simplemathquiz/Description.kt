package com.example.simplemathquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Description : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val descriptionButton: Button = findViewById(R.id.descriptionButton)
        descriptionButton.setOnClickListener {
            val intent = Intent(this@Description, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
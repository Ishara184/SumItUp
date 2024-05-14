package com.example.simplemathquiz

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ScoreHistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_history)

        val historyTextView: TextView = findViewById(R.id.historyTextView)
        val highScoreTextView: TextView = findViewById(R.id.highScoreTextView)

        val history = intent.getStringExtra("history")
        historyTextView.text = history

        val scores = history?.split("\n")?.mapNotNull { it.substringAfter(": ").toIntOrNull() }
        val highScore = scores?.maxOrNull() ?: 0
        highScoreTextView.text = "High Score: $highScore"
    }
}




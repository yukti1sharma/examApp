package com.example.examapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val startButton = findViewById<Button>(R.id.btnstart)

        startButton.setOnClickListener {
            intent = Intent(this, SecondPage::class.java)
            startActivity(intent)
        }
    }

}
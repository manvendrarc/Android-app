package com.example.splash_project_manvendra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton = findViewById<Button>(R.id.button)
        nextButton.setOnClickListener {
            val intent = Intent(this, permissions::class.java)
            startActivity(intent)
        }
    }
}
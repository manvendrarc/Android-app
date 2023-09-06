package com.example.splash_project_manvendra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        val ihome = Intent(this, MainActivity::class.java)

        findViewById<View>(android.R.id.content).postDelayed({
            startActivity(ihome)
            finish()
        }, 2000)
    }

}
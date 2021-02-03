package com.example.appqr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boutonqr: Button = findViewById(R.id.buttonqr)
        boutonqr.setOnClickListener{
            val intentqr = Intent(this, ScanQR::class.java)
            startActivity(intentqr)
        }

        val boutonliste: Button = findViewById(R.id.buttonliste)
        boutonliste.setOnClickListener{
            val intentliste = Intent(this, ListeQR::class.java)
            startActivity(intentliste)
        }

    }
}
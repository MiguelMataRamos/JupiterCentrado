package com.example.jupitercentrado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jupiter = findViewById<ImageView>(R.id.jupiter)
        val luna = findViewById<ImageView>(R.id.luna)
        val texto = findViewById<TextView>(R.id.texto)

        jupiter.setOnClickListener {
            texto.text = "JUPITER"
        }
        luna.setOnClickListener {
            texto.text = "LUNA"
        }


    }
}
package com.chris.proyecto_prilad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterAcivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_acivity)

        val btn2: Button = findViewById(R.id.registroTerminadoBtn)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, Pantalla_2::class.java)
            startActivity(intent)

        }
    }
}
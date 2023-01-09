package com.chris.proyecto_prilad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pantalla_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)

        val btn: Button = findViewById(R.id.iniciarSesionBtn)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, CalendarioMain::class.java)
            startActivity(intent)


            }
        val btn2: Button = findViewById(R.id.registroBtn)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this, RegisterAcivity::class.java)
            startActivity(intent)
        }
    }
}
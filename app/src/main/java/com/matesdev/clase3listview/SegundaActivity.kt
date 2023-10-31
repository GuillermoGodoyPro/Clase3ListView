package com.matesdev.clase3listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    private lateinit var setNombre: TextView
    private lateinit var setNacion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val bundle = intent.extras

        setNombre = findViewById(R.id.tvNombre)
        setNacion = findViewById(R.id.tvNacion)

        val nombre = bundle?.getString("name", "")
        val nacion = bundle?.getString("nacional", "")

        setNombre.text = nombre
        setNacion.text = nacion

    }
}
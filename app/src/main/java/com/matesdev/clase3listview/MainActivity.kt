package com.matesdev.clase3listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner

    private lateinit var nombre : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinner)

        val nombress = arrayOf("Alejandro", "Samuel","Luciano", "Tomas","Carolina")
        val nimbrish = arrayListOf("Alejandro", "Samuel","Luciano", "Tomas","Carolina Serrano")
        val mutableNombres = mutableListOf("Alejandro", "Samuel","Luciano", "Tomas","Carolina Serrano")

        nimbrish.add("Cacaroto")
        // En kotlin usamos mutableListOf o ListOf
        mutableNombres.add("Aspros")

        val adapterName = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, mutableNombres)
        spinner.adapter = adapterName

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                nombre = mutableNombres[p2]
                Toast.makeText(this@MainActivity, nombre ,Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}
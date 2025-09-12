package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)


        val spOperacionesMAt :Spinner=findViewById(R.id.spn_lista)
        val btn_Calcular :Button =findViewById(R.id.btn_lista)


        val opcionesSpinner= arrayOf(
            "Sumar"
            ,"Restar"
            ,"Multiplicar"
            ,"Hola mundo"
            ,"Dividir")


        val adaptador =ArrayAdapter(this,
            android.R.layout.simple_list_item_1
        ,   opcionesSpinner)

        spOperacionesMAt.adapter=adaptador






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
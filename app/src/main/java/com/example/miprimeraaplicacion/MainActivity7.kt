package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)


        val spn_grupos:Spinner=findViewById(R.id.spn_grupo)
        val spn_seccion:Spinner=findViewById(R.id.spn_seccion)


        val opcionesGrupo= arrayOf(
            "1"
            ,"2"
            ,"3"
            ,"4"
            ,"5"
            ,"6"
            ,"7"
            ,"8"
            ,"9"
            ,"10",
            "11"
            ,"12"
            ,"13"
            ,"14"
            ,"15")

        val adaptadorGrupo = ArrayAdapter(this,
            android.R.layout.simple_list_item_1
            ,   opcionesGrupo)

        spn_grupos.adapter=adaptadorGrupo

        val opcionesSeccion= arrayOf(
            "1"
            ,"2"
            ,"3"
            ,"4"
            ,"5"
            ,"6"
            ,"7"
            ,"8"
            ,"9"
            ,"10")

        val adaptadorSeccion = ArrayAdapter(this,
            android.R.layout.simple_list_item_1
            ,   opcionesSeccion)

        spn_seccion.adapter=adaptadorSeccion












        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
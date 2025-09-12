package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val listaJuegos:ListView=findViewById(R.id.lst_lista)
        val spOperacionesMAt :Spinner=findViewById(R.id.spn_lista)
        val btn_Calcular :Button =findViewById(R.id.btn_lista)
        val btn_saludo :Button=findViewById(R.id.btn_saludo)

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

        val opcionesListView = arrayOf(
            "Gears of war reloaded"
            ,"Doom the dark ages"
            ,"Silksong"
            ,"Expedition 33"
            ,"Death Stranding 2"
            ,"Kingdom Come Deliverance 2"
            ,""
        )

        val adaptadorList =ArrayAdapter(this,android.R.layout.simple_list_item_1,
            opcionesListView)

        listaJuegos.adapter=adaptadorList

        btn_Calcular.setOnClickListener{
            var str_op_selected = spOperacionesMAt.selectedItem.toString()
            val toast =Toast.makeText(this,str_op_selected,Toast.LENGTH_SHORT)
            toast.show()
        }

        btn_saludo.setOnClickListener{
            var str_op2_selec =listaJuegos.selectedItem.toString()
            val toast=Toast.makeText(this,str_op2_selec,Toast.LENGTH_SHORT)
            toast.show()

        }








        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
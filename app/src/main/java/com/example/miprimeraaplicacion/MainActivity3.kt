package com.example.miprimeraaplicacion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miprimeraaplicacion.funciones.OpMatematicas


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)


val edvalorUno:EditText =findViewById(R.id.edvalorUno)
val edValorDos:EditText=findViewById(R.id.edValorDos)
        val  txResultado:TextView=findViewById(R.id.txResultado)
        val btn_calcular:Button=findViewById(R.id.btn_calcular)

        btn_calcular.setOnClickListener{
            //txResultado.text="cambiando texto"
            var numeroUno:Int=edvalorUno.text.toString().toIntOrNull()?:0
            var numeroDos:Int=edValorDos.text.toString().toIntOrNull()?:0

            txResultado.text= OpMatematicas.dividirValores(numeroUno,numeroDos)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
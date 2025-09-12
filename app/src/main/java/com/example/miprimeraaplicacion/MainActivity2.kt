package com.example.miprimeraaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)


        val txUsuario:TextView=findViewById(R.id.id_usuario_logueado)
        val recibirUserNameS=intent.getStringExtra("par_usern")
        val btn_calculadora:Button=findViewById(R.id.btn_calculadora)
        val btn_menu:Button=findViewById(R.id.btn_menu)

        btn_calculadora.setOnClickListener{
            val ventana3 = Intent(this, MainActivity3::class.java)
            startActivity(ventana3)
        }

        btn_menu.setOnClickListener{
            val ventana4 =Intent(this,MainActivity4::class.java)
            startActivity(ventana4)
        }




        txUsuario.text=recibirUserNameS.toString()






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
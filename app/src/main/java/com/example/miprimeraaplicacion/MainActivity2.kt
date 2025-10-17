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
        val btn_api:Button=findViewById(R.id.btn_api)
        val btn_listView:Button=findViewById(R.id.btn_listView)
        val btn_env_api:Button=findViewById(R.id.btn_env_api)

        btn_calculadora.setOnClickListener{
            val ventana3 = Intent(this, MainActivity3::class.java)
            startActivity(ventana3)
        }

        btn_menu.setOnClickListener{
            val ventana4 =Intent(this,MainActivity4::class.java)
            startActivity(ventana4)
        }

        btn_api.setOnClickListener{
            val ventana5 =Intent(this,MainActivity5::class.java)
            startActivity(ventana5)
        }
        btn_listView.setOnClickListener{
            val ventana6=Intent(this,MainActivity6::class.java)
            startActivity(ventana6)
        }

        btn_env_api.setOnClickListener{
            val ventana7=Intent(this,MainActivity7::class.java)
            startActivity(ventana7)
        }



        txUsuario.text=recibirUserNameS.toString()






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
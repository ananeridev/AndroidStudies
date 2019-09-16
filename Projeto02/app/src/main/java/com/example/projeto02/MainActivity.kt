package com.example.projeto02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun experimentar(componente:View) {
        Toast.makeText(
            this, "Ai sim!", Toast.LENGTH_SHORT).show()
    }

    fun experimentarLoko(componente: View) {
        // recuperar um elemento do XML de layout
        // Recuperamos uma TextView de id "tvTopo"
        // ex1: método explícito de recuperação
        val tvTopo = findViewById<TextView>(R.id.tvTopo)

        //tvTopo.text = "C é loko, cachoeira?!"

        // ex2: método implicito de recuperação
        tvTopo.text = etFrase.text
        
    }

}

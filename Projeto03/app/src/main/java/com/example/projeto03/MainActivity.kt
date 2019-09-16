package com.example.projeto03

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularAposentadoria(componente:View) {
        val idade = etIdade.text.toString().toInt()

        val tempoRestante = 70 - idade

        Toast.makeText(
            this,
            "Faltam ${tempoRestante} anos",
            Toast.LENGTH_SHORT).show()

    }
}

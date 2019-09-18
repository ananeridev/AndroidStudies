package com.example.projeto_poliglota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mudarFrase(v:View){
        // recuperando um valor do "strings.xml"
        // getString(R.string.<chave>)
        tvBoasvindas.text = getString(R.string.boa_noite)

        // recuperando um valor do "strings.xml"
        // que precisa de partes dinâmicas
        val frase:String = getString(R.string.frase, "Gloria Groove", 20, 1.9)
        tvBomdia.text = frase
    }
}

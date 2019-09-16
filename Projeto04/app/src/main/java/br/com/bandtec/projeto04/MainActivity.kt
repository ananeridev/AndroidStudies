package br.com.bandtec.projeto04

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injetando "onclick" em componentes
        btNaoEstouAqui.setOnClickListener {
            // mudando a visibilidade de um componente
            imgTopo.visibility = View.INVISIBLE
        }

        btEstouAqui.setOnClickListener {
            // mudando a visibilidade de um componente
            imgTopo.visibility = View.VISIBLE
        }
    }

    fun trocarImagem(v:View) {
        // trocando a imagem de uma ImageView
        // R.mipmap.<nome do arquivo sem extensão>
        imgTopo.setImageDrawable(getDrawable(R.mipmap.caio));
    }
}

package com.example.aulakotlin2

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testeFuncoes() {
        somar(12.0, 13.0)
        somar(12.0)
        somar()
    }

    fun somar(n1:Double = 0.0, n2:Double = 0.0) {
        println("Soma: ${n1+n2}")
    }

    @Test
    fun testarMusica() {
        // instanciando um objeto
        val musica1 = Musica()

        // usando os "getters" e "setters"
        musica1.nome = "Shallow"  // usou o setNome()
        musica1.genero = "Romântica"

        // aqui usamos o getNome()
        println("${musica1.nome} - ${musica1.genero}")
    }
}

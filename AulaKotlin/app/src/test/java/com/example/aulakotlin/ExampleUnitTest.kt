package com.example.aulakotlin

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    @Test
    fun testeVariaveis() {
        // tipagem dinâmica
        var endereco = "Rua xyz"
        var idade = 30
        var altura = 1.5
        var feliz = true

        // não existem tipos primitivos em Kotlin

        // endereco = 12 // erro: não pode mudar o tipo

        // tipagem estática
        var bairro:String = "Saúde"
        var filhos:Int = 1
        var peso:Double = 70.5

        // nulidade de valores
        // A kotlin possui um forte mecanismo para evitar NPE

        // 1. não é possível atribuir nulo em tip estática
        // var cidade:String = null // Erro!

        // para a tip estática aceitar null, usar ? após o tipo
        var cidade:String? = null

        // 2. safe navigator (? após o objeto)
        cidade?.toUpperCase()

        // 3. forçar NPE (!! após o objeto)
//        cidade!!.toUpperCase()


        // na tipagem dinâmica, o null é aceito
        var pais = null

    }

    @Test
    fun testConstantes() {

        // Criamos valores IMUTÁVEIS (constantes) com 'val'
        val cidade = "Sampa"
        val populacao:Int = 46873

        // cidade = "Rio" // erro!

    }

    @Test
    fun testConversoes() {
        var idade = "30".toInt()
        var peso = "70.5".toDouble()

        var txt = "40w"
        // métodos de conversão que terminam em "OrNull()"
        // convertem para null em caso de erro de conversão
        var pessoas = txt.toIntOrNull()
    }

    @Test
    fun testStringTemplates() {
        var bairro = "Saúde"
        println("Você mora no bairro ${bairro}")
        println("Gritando... ${bairro?.toUpperCase()}")
    }

    // função COM parâmetros e SEM retorno
    fun soExecuta(p1:String, p2:Int) {
        println("Prmeiro veio ${p1}, depois o ${p2}")
    }

    // função COM parâmetro e COM retorno
    fun executaERetorna(p1:Int):String {
        return "Você me mandou ${p1}"
    }

    @Test
    fun testeFuncoes() {
        soExecuta("amor", 300)
        println(executaERetorna(80))
    }

    @Test
    fun testeString() {
        var sqlLoka = """
            select * from tabela
            where x = 0
            order by y desc
        """

        val gaguinho = "olá ".repeat(4)
        println(gaguinho)

        val oitoDigitos = "12".padStart(8, '0')
        println(oitoDigitos)

        val frase = "juntos e shallow now"
        println(frase[12])

    }


    @Test
    fun testVetoresListas() {
        // criando um vetor (array)
        val vetorFrutas = arrayOf("pêra", "maçã", "uva", "morango")
        val vetorFrutas2:Array<String> = arrayOf("pêra", "maçã", "uva")

        // criando uma lista (List)
        val listaBairros = mutableListOf("luz", "são matheus", "saúde", "sé")
        val listaBairros2:List<String> = mutableListOf("saúde", "sé")

        // iterando em vetor ou lista
        vetorFrutas.forEach {
            println("Fruta: ${it}")
        }

        // iterando com nome de variável explícito
        vetorFrutas2.forEach { f ->
            println("Fruta: ${f}")
        }

        // iterando com nome de variável de indice e valor explícitos
        listaBairros.forEachIndexed { i, bairro ->
            println("Bairro ${i}: ${bairro}")
        }

        // filtrar o vetor ou a lista
        val filtrada = vetorFrutas.filter { it.contains("m") }
        println(filtrada)
        val filtrada2 = vetorFrutas.filter { it.length>5 }
        println(filtrada2)

        // ordenação usando um atributo como critério
        println(listaBairros)
        listaBairros.sortBy { it.length }
        println(listaBairros)

        // ordenação inversa usando um atributo como critério
        listaBairros.sortByDescending { it.length }
        println(listaBairros)

        // métodos úteis
        println("Primeira fruta: ${vetorFrutas.first()}")
        println("Última fruta: ${vetorFrutas.last()}")
    }


}

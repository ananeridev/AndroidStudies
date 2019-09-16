package com.example.aulakotlin2

class Musica {

    var nome: String? = null
        // ex de get que devolve o valor em CAIXA ALTA
        get() = field?.toUpperCase()

        // ex de set que só atribui se tiver 2+ letras
        set(value) {
            if (value!!.length >= 2) {
                field = value
            }
        }


    var genero:String? = null
}
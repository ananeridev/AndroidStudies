package com.example.aulakotlin2

class Filme(val titulo:String, var ano:Int) {
    // acima, criamos o construtor padrão da classe
    // o compilador kotlin vai criar os atributos
    /*
    private String titulo
    private Integer ano
     */
    // Se forem marcados com "val", só criará os getters
    // Se forem marcados com "var", criará get e set

    // Esta classe poderia ter qualquer outro método

}
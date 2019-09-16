package com.example.aulakotlin2

// data class
// classes onde é obrigatório o construtor padrão
// não criamos métodos dentro

// São criado equals() e hashCode() automaticamente
// Ou seja, se os atributos forem iguais, o objeto todo será igual
data class Lutador(val nome:String, var peso:Double = 0.0) {

}
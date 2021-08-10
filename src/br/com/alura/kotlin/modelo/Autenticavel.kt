package br.com.alura.kotlin.modelo

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
}
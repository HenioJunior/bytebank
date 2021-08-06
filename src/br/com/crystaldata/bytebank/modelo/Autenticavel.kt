package br.com.crystaldata.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
}
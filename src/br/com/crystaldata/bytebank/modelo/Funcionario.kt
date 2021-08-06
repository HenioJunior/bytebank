package br.com.crystaldata.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    ) {

    //Funcao convertido para propertie
    abstract val bonificacao: Double
}



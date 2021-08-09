package br.com.crystaldata.bytebank.teste

import br.com.crystaldata.bytebank.modelo.Endereco

fun testaNullSafety() {

    //(?) indica que podemos receber o valor null...
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro

//    enderecoNulo?.let { endereco: Endereco ->  println(endereco.logradouro)
//    }
    enderecoNulo?.let {
        println(it.logradouro)
        val tamanhoComplemento: Int = it.complemento?.length ?:
        throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
        teste("")
        teste(1)
    }
}

//Safe Casts uso do (?)
fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)

}
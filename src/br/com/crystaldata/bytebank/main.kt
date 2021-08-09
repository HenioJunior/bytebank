import br.com.crystaldata.bytebank.exception.SaldoInsuficienteException
import br.com.crystaldata.bytebank.modelo.Endereco as Endereco1

fun main() {

  //(?) indica que podemos receber o valor null...
    var enderecoNulo: Endereco1? = Endereco1(logradouro = "rua vergueiro", complemento = "prédio")
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















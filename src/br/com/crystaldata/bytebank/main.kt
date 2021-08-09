import br.com.crystaldata.bytebank.exception.SaldoInsuficienteException
import br.com.crystaldata.bytebank.modelo.Endereco as Endereco1

fun main() {

  //(?) indica que podemos receber o valor null...
    var enderecoNulo: Endereco1? = Endereco1(logradouro = "rua vergueiro")
    val logradouroNovo: String? = enderecoNulo?.logradouro

//    enderecoNulo?.let { endereco: Endereco ->  println(endereco.logradouro)
//    }
    enderecoNulo?.let {
        println(it.logradouro)
    }
}















import br.com.crystaldata.bytebank.exception.SaldoInsuficienteException
import br.com.crystaldata.bytebank.modelo.Endereco

fun main() {

  //(?) indica que podemos receber o valor null...
    var enderecoNulo: Endereco? = null
    val enderecoNaoNulo: Endereco = enderecoNulo!!
    enderecoNaoNulo.logradouro
}













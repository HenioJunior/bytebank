import br.com.crystaldata.bytebank.modelo.*

fun main() {

    val endereco = Endereco(logradouro = "Rua vergueiro", complemento = "Alura")
    val enderecoNovo = Endereco(bairro = "Vila Mariana", numero = 1000)

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")

}














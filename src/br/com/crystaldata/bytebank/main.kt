import br.com.crystaldata.bytebank.exception.SaldoInsuficienteException
import br.com.crystaldata.bytebank.modelo.Endereco

fun main() {
    println("início main")
//    funcao1()
    testaComportamentosConta()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e : SaldoInsuficienteException) {
        e.printStackTrace()
        println("SaldoInsuficienteException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}











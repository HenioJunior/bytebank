import br.com.crystaldata.bytebank.modelo.Endereco
import java.lang.ArithmeticException
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("início main")
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema de conversão")
        e.printStackTrace()
        null
    }

//    val valorComTaxa: Double? = if (valorRecebido != null) {
//        valorRecebido + 0.1
//    } else {
//        null
//    }

//    val valorComTaxa: Double? = when {
//        valorRecebido != null -> {
//            valorRecebido + 0.1
//        }
//        else -> {
//            null
//        }
//    }
//
//    when {valorComTaxa != null -> {
//        println("Valor recebido: $valorComTaxa")}
//        else -> {
//            println("Valor inválido")
//        }
//    }
    val valorComTaxa: Double? = valorComTaxa(1.0)
    println("Valor recebido: ${valorComTaxa}")

    funcao1()
    println("fim main")
}

fun valorComTaxa(valorRecebido: Double?): Double? {
    if (valorRecebido != null) {
        return valorRecebido + 0.1
    }
    return null
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e : ClassCastException) {
        e.printStackTrace()
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
        println("ClassCastException")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}











package br.com.alura.kotlin.teste

fun testaExpressao() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema de conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }

    when {
        valorComTaxa != null -> {
            println("Valor recebido: $valorComTaxa")
        }
        else -> {
            println("Valor inválido")
        }
    }
}
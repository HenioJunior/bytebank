package br.com.alura.kotlin.modelo

import br.com.alura.kotlin.exception.FalhaAutenticacaoException
import br.com.alura.kotlin.exception.SaldoInsuficienteException
import java.lang.RuntimeException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw br.com.alura.kotlin.exception.SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo"
            )
         }
        if(!autentica(senha)) {
            throw br.com.alura.kotlin.exception.FalhaAutenticacaoException()
        }
//        throw RuntimeException()
        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}

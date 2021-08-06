package br.com.crystaldata.bytebank.modelo

import br.com.crystaldata.bytebank.modelo.Conta

class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}


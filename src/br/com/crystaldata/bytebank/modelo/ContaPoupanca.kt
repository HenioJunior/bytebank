package br.com.crystaldata.bytebank.modelo

import br.com.crystaldata.bytebank.modelo.Conta

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(titular, numero) {

    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}


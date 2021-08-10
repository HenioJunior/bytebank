package br.com.alura.kotlin.exception

import java.lang.Exception


class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente") : Exception(mensagem)
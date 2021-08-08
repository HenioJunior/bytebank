import br.com.crystaldata.bytebank.modelo.Cliente
import br.com.crystaldata.bytebank.modelo.ContaCorrente
import br.com.crystaldata.bytebank.modelo.ContaPoupanca
import br.com.crystaldata.bytebank.modelo.totalContas

fun main() {

    testaContasDiferentes()
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)
    println("Total de contas: $totalContas")

}












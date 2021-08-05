fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.00
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao()}")
}






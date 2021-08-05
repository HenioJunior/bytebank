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

    val fran = Gerente(
        "Fran",
        "222-222-222-22",
        2000.00,
        1234
    )
    println()
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if(fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }
}






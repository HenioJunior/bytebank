class TestaFuncionarios {

    public fun testaFuncionarios() {
        val alex = Funcionario(
            "Alex",
            "111.111.111-11",
            1000.00
        )

        println("nome ${alex.nome}")
        println("cpf ${alex.cpf}")
        println("salario ${alex.salario}")
        println("bonificacao ${alex.bonificacao}")

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
        println("bonificacao ${fran.bonificacao}")

        if (fran.autentica(1234)) {
            println("autenticou com sucesso")
        } else {
            println("falha na autenticacao")
        }

        val gui = Diretor(
            nome = "Gui",
            cpf = "333.333.333-33",
            salario = 4000.0,
            senha = 4000,
            plr = 200.0
        )
        println()
        println("nome ${gui.nome}")
        println("cpf ${gui.cpf}")
        println("salario ${gui.salario}")
        println("bonificação ${gui.bonificacao}")
        println("plr ${gui.plr}")

        if (gui.autentica(1234)) {
            println("autenticou com sucesso")
        } else {
            println("falha na autenticacao")
        }

        val maria = Analista(
            nome = "Maria",
            cpf = "444.444.444-44",
            salario = 3000.0
        )
        println()
        println("nome ${gui.nome}")
        println("cpf ${gui.cpf}")
        println("salario ${gui.salario}")
        println("bonificação ${gui.bonificacao}")
        println("plr ${gui.plr}")

        val calculadora = CalculadoraBonificacao()
        calculadora.registra(alex)
        calculadora.registra(fran)
        calculadora.registra(gui)
        calculadora.registra(maria)

        println("total de bonificação: ${calculadora.total}")
    }

}
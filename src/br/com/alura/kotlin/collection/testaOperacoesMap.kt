package br.com.alura.kotlin.collection

fun testaOperacoesMap() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println("Pedidos")
    println(pedidos)

//    println()
//    println("pedidosMapeados")
//    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido -> Pair(pedido.numero, pedido)
//    }
//    println(pedidosMapeados)

    println()
    println("pedidosMapeados")
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)

    println()
    println("pedidosFreteGratis")
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)

//    println()
//    println("pedidosFreteGratis - associateBy")
//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedido ->
//        pedido.valor > 50.0
//    }
//    println(mapa)

    println()
    println("pedidosFreteGratis - groupBy")
    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }
    println(pedidosFreteGratisAgrupados)
    println()
    println("pedidosFreteGratis - groupBy - false")
    println(pedidosFreteGratisAgrupados[false])

    println()
    println("Agenda")

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])
}
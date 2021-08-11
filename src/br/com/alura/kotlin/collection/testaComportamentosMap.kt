package br.com.alura.kotlin.collection

public fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
//    val valorPedido:Double? = pedidos.getValue(5)
//    println(valorPedido)

    println(pedidos.getOrElse(5) {
        "Não tem o pedido"
    })

    println(pedidos.getOrDefault(1, -1.0))

    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    println()
    println("Keys")
    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    println()
    println("Values")
    for (valor in pedidos.values) {
        println("Valor $valor")
    }

    println()
    println("Values")
    println(pedidos.values)

    println()
    println("Filtro")
    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 70.0
    }
    println(pedidosFiltrados)

    println()
    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    println()
    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println()
    println("Pedidos")
    println(pedidos)

    println()
    println("Plus operator")
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))

    println()
    println("Minus operator")
    println(pedidos - listOf(6, 5))

    println()
    println("putAll")
    pedidos.putAll(listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
//    pedidos += listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    println()
    println("remove")
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}
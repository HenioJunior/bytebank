package br.com.alura.kotlin.collection

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
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




}

data class Pedido(val numero: Int, val valor: Double)











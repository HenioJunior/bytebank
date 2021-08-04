fun main() {
    println("Bem vindo ao Bytebank!")
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 1..5) {
//
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular $titular")
//        println("Número da conta $numeroConta")
//        println("Saldo da conta $saldo")
//        println()
//
//    }

//    for (i in 5 downTo 1) {
//
////        if(i == 4) {
////            break
////        }
//
//        if(i == 4) {
//            continue //pula o 4
//        }
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular $titular")
//        println("Número da conta $numeroConta")
//        println("Saldo da conta $saldo")
//        println()
//    }


//    testaCondicoes(saldo)

}

fun testaCondicoes(saldo: Double) {
//        if (saldo > 0.0) {
//        println("Conta é positiva")
//    }else if(saldo == 0.0) {
//        println("A conta é neutra")
//    } else {
//        println("A conta é negativa")
//    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("A conta é neutra")
        else -> println("A conta é negativa")
    }

}

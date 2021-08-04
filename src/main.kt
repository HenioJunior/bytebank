fun main() {
    println("Bem vindo ao Bytebank!")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numeroConta = 1000
    contaAlex.saldo = 200.00
    println(contaAlex.titular)
    println(contaAlex.numeroConta)
    println(contaAlex.saldo)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numeroConta = 1001
    contaFran.saldo = 300.00
    println(contaFran.titular)
    println(contaFran.numeroConta)
    println(contaFran.saldo)
}

class Conta {
    var titular = ""
    var numeroConta =  0
    var saldo = 0.0

}




fun testaLacos() {
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

    }
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

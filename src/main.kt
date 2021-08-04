fun main() {
    println("Bem vindo ao Bytebank!")

    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

//    saldo += 200

    println("Titular $titular")
    println("Número da conta $numeroConta")
    println("Saldo da conta $saldo")

//    if (saldo > 0.0) {
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
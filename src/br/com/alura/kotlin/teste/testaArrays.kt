package br.com.alura.kotlin.teste

fun testaArrays() {
//    val idades = IntArray(5)
//    idades[0] = 25
//    idades[1] = 19
//    idades[2] = 33
//    idades[3] = 20
//    idades[4] = 55
    val idades: IntArray = intArrayOf(25,19,33,20,55)

    var maiorIdade = Int.MIN_VALUE
    for(idade in idades) {
        if(idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    //foreach
    var menorIdade = Int.MAX_VALUE//começar com o maior valor possível
    idades.forEach { idade ->
        if(idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)
}
import br.com.crystaldata.bytebank.modelo.Endereco

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try {
        funcao2()
    } catch (e : ClassCastException) {
        e.printStackTrace()
        println("ClassCastException")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val endereco = Any()
//        endereco as Endereco
        throw java.lang.ClassCastException()
    }
    println("fim funcao2")
}











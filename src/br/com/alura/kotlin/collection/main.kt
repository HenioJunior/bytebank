package br.com.alura.kotlin.collection

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid
    println(assistiramAmbos.distinct())

}

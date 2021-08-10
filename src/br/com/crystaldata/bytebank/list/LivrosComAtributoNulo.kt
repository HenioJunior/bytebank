package br.com.crystaldata.bytebank.list

fun main() {
//    listaDeLivros
//        .groupBy { it!!.editora }
//        .forEach { (editora, livros) ->
//            println("$editora: ${livros.joinToString { it!!.titulo }}")
//       }

    listaDeLivros
        .groupBy { it?.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro?>) ->
            println("$editora: ${livros.joinToString { it!!.titulo }}")
        }
}
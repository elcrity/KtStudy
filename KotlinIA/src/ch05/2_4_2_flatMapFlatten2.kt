package ch05.flatmapflatten2

class Book(val title:String, val authors:List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("TN", listOf("jasper")), Book("Mort", listOf("Terry")), Book("GO", listOf("Terry","Neil")))

    println(books.flatMap { it.authors }.toSet())
}

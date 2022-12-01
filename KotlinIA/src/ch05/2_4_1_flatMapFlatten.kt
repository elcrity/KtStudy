package ch05.flatmapflatten

fun main(args: Array<String>) {
    val novel = listOf("abc", "def")
    println(novel.flatMap { it.toList() })
}


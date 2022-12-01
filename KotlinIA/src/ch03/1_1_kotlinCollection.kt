package ch03

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
val String = listOf("first", "seven " , "fifty-three")
val numbers = setOf(1,7,53)

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(String.last())
    println(numbers.first())

}
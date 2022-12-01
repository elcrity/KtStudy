package ch05.groupby

data class Person(val name : String, val age : Int)

fun main(args: Array<String>) {
    val people = listOf(Person("앨리스", 31), Person("밥",29), Person("Carol",31))
    println(people.groupBy{it.age})
    val list = listOf("a","ab","b")
    println(list.groupBy (String::first))
}
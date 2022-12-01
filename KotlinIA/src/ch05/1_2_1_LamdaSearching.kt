package ch05.lamdasearching

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("park", 22),Person("Lee", 12)    )
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull ( Person::age ))
}
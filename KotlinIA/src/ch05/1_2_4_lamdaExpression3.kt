package ch05.lamdaexpression2

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("park",22),Person("Lee", 32))
    println(people.maxByOrNull{p: Person -> p.age })
}
package ch05.memberreference2

data class Person(val name: String, val age: Int)

fun Person.isAdult() = age >= 21

fun main(args: Array<String>) {
    val createPerson = ::Person
    val p = createPerson("park",22)
//    val predicate = Person::isAdult
//    println(predicate)
    println(p)
}
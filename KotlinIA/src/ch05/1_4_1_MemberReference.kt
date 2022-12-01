package ch05.memberreference

data class Person(val name:String, val age:Int)

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    val getAge = {Person::age}// == {person: Person -> Person.age} == {p -> p.age} == {it.age}
    run(::salute) // 최상위 함수 참조
}


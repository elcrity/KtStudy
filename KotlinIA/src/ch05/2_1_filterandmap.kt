package ch05.filterandmap

data class Person(val name : String, val age : Int)

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    println(list.filter { it % 2 == 0 })//조건에 맞지 않는 원소 제거

    val people = listOf(Person("앨리스",25), Person("밥", 32))
    println(people.filter{ it.age > 30})

    println(list.map { it*it })//원소를 변환
    println(people.map {it.name})
    println(people.filter { it.age>30 }.map { it.name })
}


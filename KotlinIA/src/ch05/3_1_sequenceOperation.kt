package ch05.sequenceOperation

data class Person(val name:String, val age:Int)

fun main(args: Array<String>) {
    val list = listOf(1,2,3,4)
    println(list.map { it*it }.find{it>3})//1,2,3,4 -> 1,4,9,16 => 4출력
    println(list.asSequence().map { it*it }.find{it>3})//1,2,3,4,->1,4 => 4출력

    val people = listOf(Person("앨리스",29), Person("밥", 31), Person("찰스",31),Person("댄",27))
    println(people.asSequence().map (Person::name).filter { it.length < 2 }.toList())//모든 원소 변환 후, 조건에 맞는 원소 반환 
    println(people.asSequence().filter { it.name.length < 2 }.map ( Person::name ).toList())//조건에 맞는 원소 반환 후, 원소 변환
}


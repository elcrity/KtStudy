package ch05.allanycountfind

data class Person(val name : String, val age : Int)

val canBeInClub27 = {p:Person -> p.age <= 27}

fun main(args: Array<String>) {
    val people = listOf(Person("앨리스", 25), Person("밥", 32), Person("타일러", 20))
    val list = listOf(1, 2, 3)
    println(people.all(canBeInClub27))//모든 원소가 술어 만족하는지 검사 == !any
    println(list.any { it != 3 })
    println(people.any(canBeInClub27))//어떤 원소라도 술어 만족하는지 검사 == !all
    println(!list.all { it == 3 })

    println(people.count(canBeInClub27))//count와 size의 차이 -> size는 조건을 만족하는 모든 원소가 들어가는 중간 컬렉션 생성, count는 조건을 만족하는 갯수만 추적
    println(people.find(canBeInClub27))//가장 먼저 조건을 만족하는 원소 반환 없으면 null, == firstOrNull, 조건 만족하는 원소가 없을시 null이 나온다는걸 명시
}

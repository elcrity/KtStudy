package ch05.lamdaexpression4

data class Person(val name:String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("park",23), Person("lee", 34))
    val names = people.joinToString (separator = " " ,
    transform = {p:Person-> p.name})
    println(names)
    println(people.joinToString(" "){p: Person -> p.name})
    println(people.joinToString(" ") {p -> p.name})//컴파일러의 파라미터 타입 추론
    println(people.joinToString(" ") { it.name })//람다의 파라미터가 한개뿐, 컴파일러가 추론가능시 it사용가능

    val getAge = {p:Person -> p.age}// 람다를 변수 저장시 타입 추론할 문맥이 존재하지 않기때문에 타입 명시가 필수
}


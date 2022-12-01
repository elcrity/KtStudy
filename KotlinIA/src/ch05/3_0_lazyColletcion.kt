package ch05.lazycollection

class Person(val name:String, val age:Int)

fun main(args: Array<String>) {
    val people = listOf(Person("a",1), Person("b",2))

    people.map(Person::name).filter { it.startsWith("A") }// map 리스트 한번, filter리스트 한번씩 반환, 즉 2개의 리스트가 반환됨

    people.asSequence()//원본 컬렉션을 시퀀스로
        .map(Person::name)
        .filter { it.startsWith("A") }
        .toList()//결과 시퀀스를 다시 리스트로 변환환
}

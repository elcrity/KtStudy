package ch04.methodautocreate

import ch04.hashcontainer.Client

data class Client(val name: String, val postalCode: Int)//데이터 클래스는 비교를 위한 equals, hashCode, toString 메서드를 기본 포함

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("박기웅", 16556))
    val processed1 = hashSetOf(Client("박기웅", 16556))
    println(processed.contains(Client("박기웅", 16556)))
    println(processed.hashCode())
    println(processed.equals(processed1))
}
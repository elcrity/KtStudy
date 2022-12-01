package ch03.infixcall

//infix fun Any.to(other: Any) = Pair(this,other) //함수 중위 호출시 사용

fun main(args: Array<String>) {
    val normalcall = mapOf(2.to("two"), 3.to("three"), 5.to("five"))
    val infixcall = mapOf(1 to "one", 7 to "seven", 10 to "ten", "four" to 4 , "Key" to "Value") //중위 호출 방식
    val (number, name)  = 1 to "one" //구조 분해 선언

    println("$normalcall")
    println("$infixcall")
    println("$number, $name")
}


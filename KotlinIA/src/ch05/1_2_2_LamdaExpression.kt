package ch05.lamdaexpression

fun main(args: Array<String>) {
    val sum = {x:Int, y:Int -> x+y}
    println(sum(1,3))
}


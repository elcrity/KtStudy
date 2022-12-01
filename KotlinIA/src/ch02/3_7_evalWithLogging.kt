package ch02.evalWithLogging

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evalWithLogging(e: Expr): Int =
    when(e){
        is Num -> {
            println("num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: left $left + right $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown")
    }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1),Num(3)),Num(5))))
}
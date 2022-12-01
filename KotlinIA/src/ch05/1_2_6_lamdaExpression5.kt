package ch05.lamdaexpression5

fun main(args: Array<String>) {//본문이 여러 줄로 이루어진 람다식은 맨 마지막 줄이 결과값
    val sum = {x:Int, y: Int, -> println("$x + $y 값 계산중")
    x+y
    }

    println(sum(1,4))
}


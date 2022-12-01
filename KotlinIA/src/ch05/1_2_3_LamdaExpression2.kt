package ch05.lamdaexpression2

fun main(args: Array<String>) {
    { println(42) }()
    run{println(42)}//람다 본문에 있는 코드 실행
}
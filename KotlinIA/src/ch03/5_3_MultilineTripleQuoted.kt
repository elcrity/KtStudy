package ch03.MultilineTripleQuoted

val kotlinLogo = """|  //
                   .| //
                   .|/ \""" //.trimMargin(".") 해도 동일

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))//trimMargin("C") C 기준으로 해당 문자열과 직전의 공백 제거
}

/*
- trimMargin 사용시
|  //
| //
|/ \

- trimMargin 미사용시
|  //
                   .| //
                   .|/ \

일반 문자열 -> "D:\\KtStudy\\KotlinIA\\src\\ch02\\1_1HelloWorld.kt"
3중 따옴표 문자열 = >"""D:\KtStudy\KotlinIA\src\ch02\1_1HelloWorld.kt"""

 */
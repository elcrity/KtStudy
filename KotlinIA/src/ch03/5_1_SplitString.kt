package ch03.splitstring

fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.|-".toRegex()))// ., |, - 정규식으로
    println("12.345-6.A".split(".","-"))
    println("12.345-6.A".split('.','-'))
}
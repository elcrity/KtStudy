package ch03.extentionProperties

val String.lastChar: Char
    get() = get(length-1)
var StringBuilder.lastChar: Char
    get() = get(length-1)
    set(value: Char){
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    println(sb)
    sb.lastChar = '!'
    println(sb)
}
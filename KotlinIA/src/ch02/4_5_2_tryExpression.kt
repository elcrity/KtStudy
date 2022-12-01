package ch02.tryExpression

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return println("error")
    }
    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a num"))
    readNumber(reader)
}
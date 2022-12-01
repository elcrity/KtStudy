package ch02.RangeWhen

fun recognize(c : Char) = when(c){
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "오류"
}

fun main(args: Array<String>) {
    println(recognize('8'))
    println(recognize('a'))
    println(recognize('!'))
}


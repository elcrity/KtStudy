package ch05.nowithfunction

fun alphabet() : String{
    val result = StringBuilder()
    for(letter in 'A' .. 'Z'){
        result.append(letter)
    }
    result.append("\nalphabet learned")
    return result.toString()
}

fun main(args: Array<String>) {
    println(alphabet())
}


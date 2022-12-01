package ch05.buildString

fun alphabet() = buildString{
    for(letter in 'A' .. 'Z')
        append(letter)
    append("\ncompleted buildString")
}

fun main(args: Array<String>) {
    println(alphabet())
}
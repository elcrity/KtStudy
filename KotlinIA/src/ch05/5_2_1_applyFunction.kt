package ch05.applyfunction

fun alphabet() = StringBuilder().apply {
    for(letter in 'A' .. 'Z'){
    append(letter)
    }
    append("\ncompleted apply1")
}.toString()

fun main(args: Array<String>) {
    println(alphabet())
}

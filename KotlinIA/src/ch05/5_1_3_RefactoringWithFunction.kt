package ch05.refactoringwithfunction

fun alphabet() = with(StringBuilder()){
    for(letter in 'A' .. 'Z')
        append(letter)
    append("\ncompleted3")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet())
}


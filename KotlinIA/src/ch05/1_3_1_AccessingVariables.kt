package ch05.accessingvariables

fun printMessageWithPrefix(messages : Collection<String>, prefix: String){
    messages.forEach{
        println("$prefix $it")
    }
}


fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found" )
    printMessageWithPrefix(errors, "Error:")
}
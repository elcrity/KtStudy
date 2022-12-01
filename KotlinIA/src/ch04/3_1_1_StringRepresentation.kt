package ch04.methoddefineallclass

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("박기웅", 16556)
    println(client1)
}
package ch04.objectequality

class Client(val name: String, val postalCode: Int){
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("박기웅", 16556)
    val client2 = Client("박기웅", 16556)
    val client3 = Client("기웅", 14)
    println(client1 == client2)
    println(client1 == client3)//==연산은 equals 호출
}
package ch04.hashcontainer

class Client(val name: String, val postalCode: Int){
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }
    override fun toString() = "Client(name = $name, postalCode = $postalCode)"

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode
}

fun main(args: Array<String>) {
    val processed = hashSetOf(Client("박기웅", 16556))
    println(processed.contains(Client("박기웅", 16556)))
}
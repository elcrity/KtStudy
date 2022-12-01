package ch04.copymethod

class Client(val name: String, val postalCode: Int){
   fun copy(name: String = this.name, postalCode: Int = this.postalCode)=
        "Client(name = $name, postalCode = $postalCode)"
}

//data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val lee = Client("일이삼",4122)
    println(lee.copy(postalCode = 4000))

}

package ch04.companionnormalobject

class Person(val name: String){
    companion object Loader{//클래스 안에 정의된 일반 객체 = 동반 객체
        fun fromJSON(jsontext: String) = Person(jsontext)
    }

    override fun toString() = "name = $name"
}

fun main(args: Array<String>) {
    val person = Person.Loader.fromJSON("park")
    println(person)
    val person2 = Person.Loader.fromJSON("Lee")
    println(person2.name)
}

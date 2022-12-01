package ch06.nullableprimitive

data class Person(val name : String, val age : Int? = null){
    fun isOlderThan(other:Person) : Boolean? {
        if(age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(Person("샘",36).isOlderThan((Person("마리",42))))
    println(Person("샘",36).isOlderThan((Person("마리"))))
}

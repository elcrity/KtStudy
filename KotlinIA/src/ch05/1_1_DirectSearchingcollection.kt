package ch05.directserchingcollection

data class Person(val name: String, val age: Int)

fun findTheOledst(people: List<Person>){
    var maxAge = 0
    var theOldest: Person? = null
    for(person in people){
        if(person.age > maxAge){
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {
    val people = listOf(Person("park",22),Person("Lee", 32))
    findTheOledst(people)
}
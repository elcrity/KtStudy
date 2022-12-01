package ch04.objectcomparator2

data class Person(val name: String) {
    object NameComparator : Comparator<Person>{
        override fun compare(o1: Person, o2: Person): Int =
            o1.name.compareTo(o2.name)
    }

    override fun toString(): String = "$name" // == {return "$name"}
}

fun main(args: Array<String>) {
    val persons = listOf(Person("park"), Person("Lee"))
    println(persons.sortedWith(Person.NameComparator))
}

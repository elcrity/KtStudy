package ch04.usingbykeyword

class CoutingSet<T>(
    val innerSet : MutableCollection<T> = HashSet<T>()
    ) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T) : Boolean
    {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CoutingSet<Int>()
    cset.addAll(listOf(1,1,2))
    println("${cset.objectsAdded} 객체 추가됨, ${cset.size} 남음")
}


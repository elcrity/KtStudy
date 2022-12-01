package ch06.elvisoperator

fun strLenSafe(s: String?) : Int = s?.length ?: 0

fun main(args: Array<String>) {
    val x :String? = null
    println(strLenSafe("abc"))
    println(strLenSafe(x))
}

// foo?.bar() -> foo != null -> foo.bar()
//            -> foo == null -> null


package ch06.notnullassertion
//foo!! -> foo != null -> foo
//      -> foo == null -> NUllPointerException

fun ignoreNulls(s: String?){
    val sNotNull:String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}
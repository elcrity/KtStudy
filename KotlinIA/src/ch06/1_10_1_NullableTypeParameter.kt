package ch06.nullabletypeparameter

fun <T>printHashcode(t:T){//T에는 ?가 없지만 t는 null을 받을수 있음. 널이 아님을 확실히 하려면 상한(upper bound)를 지정해줘야함
    println(t?.hashCode())
}

fun main(args: Array<String>) {
    printHashcode(null)
}

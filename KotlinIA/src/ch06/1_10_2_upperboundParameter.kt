package ch06.upperboundparameter

fun<T: Any> printHashcode(t: T){//upper bound를 Any로 지정 null이 될수 없는 타입이 됨
    println(t.hashCode())
}

fun main(args: Array<String>) {
//    printHashcode(null)
    printHashcode(42)
}


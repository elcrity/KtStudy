package ch06.letfuntion

fun sendEmailTo(email: String){
    println("{$email}에 이메일 보내는중")
}

fun main(args: Array<String>) {
    var email: String? = "abc@bcd.com"
    email?.let{ sendEmailTo(it) }

    email = null
    email?.let{ sendEmailTo(it) }
}

//let 함수 -> null이 될수 있는 값(foo?.bar)을 인자로 받아 null이 될수 없는값(foo.bar)으로 넘김
//  foo != null -> it은 람다 안에서 null이 아님
//  foo == null -> 아무일도 일어나지 않음
//foo.let == if(foo != null) sendEmailto(foo.email)

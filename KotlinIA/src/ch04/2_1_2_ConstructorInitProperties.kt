package ch04.constructorinitproperties

class User(val nickname: String)

class User1(val nickname: String,
             val isSubscribed: Boolean = true,// 생성자 파라미터에 대한 기본값
             val isChecked:Boolean = true)

fun main(args: Array<String>) {
    val hyun = User1("현석")
    println(hyun.isSubscribed)
    val gye = User1("계영", false)
    println(gye.isSubscribed)
    val hye = User1(nickname = "혜영", isChecked = false)
    println(hye.isSubscribed)
    println(hye.isChecked)
}
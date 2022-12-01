package ch04.interfaceabstractproperties

fun getFacebookName(accountId: Int) ="fb: $accountId"

interface User{
    val nickname: String
}

class PrivateUser(override val nickname: String) :User

class SubscribingUser(val email: String) : User{ //nickname은 호출될때마다 substringBefore를 호출에 계산하는 게터 활용
    override val nickname: String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {//nickname은 객체 초기화시 필드에 저장했다가 불러옴
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlin.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}

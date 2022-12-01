package ch04.companionobject2

fun getFacebookName(accountId: Int) = "$accountId"

class User private constructor(val nickname: String){
    companion object {
        fun newSubscribingUser(email: String) = //타입 추론으로 리턴
        User(email.substringBefore('@'))

/*
fun newSubscribingUser(email: String): User {//타입 추론을 하지 않기때문에 변수 타입 지정
        return User(email.substringBefore('@'))
    }
*/

        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("abcde@aaaa.com")
    val facebookUser = User.newFacebookUser(12)
    println(subscribingUser.nickname)
}

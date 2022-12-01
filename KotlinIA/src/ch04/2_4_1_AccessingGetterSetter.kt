package ch04.accessinggettersetter

class User(val name: String){
    var address: String = "명시되지 않음"
        set(value: String){
            println("""
                ${name}의 주소가 변경됨:
                "$field" -> "$value".""".trimIndent())//게터에서는 field라는 특별한 식별자를 통해 뒷받침하는 필드에 접근 가능
                                                      //게터에서는 field값을 읽기만 할수 있고 세터에서는 읽거나 쓸수 있음
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User("앨리스")
    user.address = "엘렌하이머 거리 47, 80697 뮌헨"
}
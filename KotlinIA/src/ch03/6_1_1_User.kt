package ch03.user

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException(
            "유저 저장 불가 : ${user.id}: 이름을 찾을수 없음")
    }

    if(user.address.isEmpty()){
        throw IllegalArgumentException(
            "유저 저장 불가 : ${user.id}: 주소를 찾을수 없음")
    }
}

fun main(args: Array<String>) {
    saveUser(User(1,"",""))

}


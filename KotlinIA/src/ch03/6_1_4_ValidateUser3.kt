package ch03.validateuser3

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave(){
    fun validate(value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "유저 저장 불가 : $id: 비어있는 $filedName"
            )
        }
    }
    validate(name, "이름값")
    validate(address, "주소값")

    println("$id,$name,$address")
}

fun saveUser(user: User){
    //fun User.validateBeforeSave() 함수를 로컬 함수로도 정의 가능, ㅏ단 일반적으로는 한단계만 함수 중첩 권장
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
    val user2 = User(2,"bak", "ggs")
    saveUser(User(1, "park", "gs"))
    saveUser(user2)
}

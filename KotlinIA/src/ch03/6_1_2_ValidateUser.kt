package ch03.validateuser

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    fun validate(user: User,
                 value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "유저 저장 불가 : ${user.id}: 비어있는 $filedName"
            )
        }
    }
    validate(user,user.name, "Name")
    validate(user,user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}


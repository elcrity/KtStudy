package ch03.validateuser2

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User){
    fun validate(value: String,
                 filedName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "유저 저장 불가 : ${user.id}: 비어있는 $filedName"
            )
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}

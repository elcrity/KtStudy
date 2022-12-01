package ch04.interfaceabstractproperties1

interface User{
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
package ch04.companionobject

class A{
    companion object{
        fun bar(){
            println("companion object")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}


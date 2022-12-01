package ch04.clickable

interface Clickable {
    fun click()
}

class Button : Clickable{
    override fun click() {
        println("클릭됨")
    }
}

fun main(args: Array<String>) {
    Button().click()
}
package ch03.override

open class View{
    open fun click() = println("view Click")
}

class Button: View(){
    override fun click() = println("Button clicked")
}
fun View.showOff() = println("I'm view!")
fun Button.showOff() = println("I'm Button!")

fun main(args: Array<String>) {
    val view = View()
    view.click()
    view.showOff()
    val button: View = Button()
    button.click()
    button.showOff()
}


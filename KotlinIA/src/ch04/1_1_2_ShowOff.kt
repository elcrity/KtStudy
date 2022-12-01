package ch04.showoff

interface Clickable {
    fun click()
    fun showOff() = println("클릭가능")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable{
    override fun click() {
        println("클릭됨")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}


fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(false)
    button.click()
}
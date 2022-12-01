package ch04.talkativebutton

interface Clickable {
    fun click()
    fun showOff() = println("클릭가능")
}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

internal open class TalkativeButton : Focusable{
    private fun yell() = println("Hey")
    protected fun whisper() = println("let's talk")
}

    /*
fun TalkativeButton.giveSpeech(){ // TalkativeButton클래스는 internal 선언, 모듈 내부에서만 볼수 있음 internal 선언을 하거나
                                  // TalkativeButton클래스를 public 선언
    yell()                        // private 멤버, 확장 함수에서 사용 불가
    whisper()                     // protected 멤버, 해당 클래스나 상속한 클래스에서만 사용 가능, 확장 함수에서 사용 불가
}
*/

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




package ch04.openclass

interface Clickable {
    fun click()
    fun showOff() = println("클릭가능")
}

open class RichButton: Clickable {
    fun disable() {}
    open fun animate(){}
    final override fun click() { //오버라이드 메서드는 기본적으로 open, 하위 클래스에서 오버라이드를 막기 위해 final 명시
    }
}


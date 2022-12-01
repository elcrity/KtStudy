package ch04.reiteration

import java.io.Serializable

interface State: Serializable

interface View{
    fun getCurrentState() : State
    fun restoreState(state: State){
    }
}

class Button : View{
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) = println(/*...*/)
    class ButtonState : State {/*...*/}
}
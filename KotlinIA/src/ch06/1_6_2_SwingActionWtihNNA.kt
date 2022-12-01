package ch06

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

class CopyRowAction(val list: JList<String>) : AbstractAction(){
    override fun isEnabled(): Boolean =
        list.selectedValue != null
    override fun actionPerformed(e: ActionEvent?) {
        val value = list.selectedValue!!
        //!!미사용시 val value = list.selectedValue ?: return 을 사용해야함
        //이렇게 작성시 list.selectedValue값이 null이면 함수가 조기 종료되서 함수의 나머지 본문에서는 value가 항상 null이 됨
    }
}
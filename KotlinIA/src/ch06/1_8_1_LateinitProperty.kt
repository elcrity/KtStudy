package ch06.lateinitproperty

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class MyService{
    fun performAction() : String = "foo"
}

class MyTest {
    private var myService: MyService? = null //null로 초기화하기 위해 null이 될수 있는는 foo? 프로퍼티 선언

    @Before
    fun setUp() {
    myService = MyService()//setup메서드 안에서 진짜 초기값 지정정
   }

    @Test
    fun testAction(){
        Assert.assertEquals("foo", myService!!.performAction())//null가능성을 확인해야 하기에 !!나 ? 사용
    }
}


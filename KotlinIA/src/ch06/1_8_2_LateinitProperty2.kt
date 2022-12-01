package ch06.lateinitproperty2

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class MyService{
    fun performAction() : String = "foo"
}

class MyTest {
    private lateinit var myService: MyService //초기화 하지 않고 null이 될수 없는 프로퍼티 선언
    //나중에 초기화 하는 프로퍼티는 항상 var 여야함, val은 final필드로 컴파일 되어 생성자 안 에서 반드시 초기화 해야함

    @Before
    fun setUp() {
        myService = MyService()//동일하게 초기값 지정
    }

    @Test
    fun testAction(){
        Assert.assertEquals("foo", myService.performAction())//null가능성 검사 필요x
    }
}
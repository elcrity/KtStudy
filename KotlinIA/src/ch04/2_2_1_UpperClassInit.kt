package ch04.upperclassinit

import javax.naming.Context
import javax.print.attribute.AttributeSet

open class View{
    constructor(ctx: Context){

    }
    constructor(ctx: Context, attr: AttributeSet)
}

class MyButton: View{
    constructor(ctx: Context)// View의 생성자에서 생성을 위임함
    : super(ctx){

    }
    constructor(ctx: Context, attr: AttributeSet)// View의 생성자에서 생성을 위임함 
    :super(ctx,attr){

    }
}

//class ThisButton: View{
//    constructor(ctx: Context): this(ctx, MY_STYLE){//아래의 생성자에게 생성을 위임함
//
//    }
//    constructor(ctx:Context, attr:AttributeSet): super(ctx,attr){//View의 생성자에게 생성을 위임함
//
//    }
//}

//클래스에 주 생성자가 없다면 부 생성자는 반드시 상위 클래스로 초기화하거나 다른 생성자에 생성을 위임해야함
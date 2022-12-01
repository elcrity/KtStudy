package ch04.sealedclass

sealed class Expr {//봉인된 클래스는 하위 클래스 전부를 처리해야함, 하지 않으면 오류
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e : Expr) : Int =
    when(e){
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }


/* 인터페이스로 작성
interface Expr

class Num(val value: Int) : Expr
class Sum(val num1: Expr, val num2: Expr) : Expr

fun eval(e: Expr) : Int =
    when(e) {
        is Num -> e.value
        is Sum -> eval(e.num1) + eval(e.num2)
        else ->
            throw IllegalArgumentException("알수없는 식")
    }
    */

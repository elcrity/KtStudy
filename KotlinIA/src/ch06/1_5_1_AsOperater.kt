package ch06.asoperator

class Person(val firstName:String, val lastName:String){
    override fun equals(o: Any?): Boolean{
        val otherPerson = o as? Person ?: return false //null이면 false 대상 타입으로 변환할수 없으면 null 있으면 Person타입으로
                                                       //foo as? Type -> foo is Type -> foo를 대상 타입으로 변환
                                                       //             -> foo !is Type -> null
        return otherPerson.firstName == firstName &&   //otherPerson firstname과 lastname 이 person의 first, lastname과 동일하다면 반환
                otherPerson.lastName == lastName
    }
    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person("드미트리", "제메로프")
    val p2 = Person("드미트리", "제메로프")
    println(p1==p2)
    println(p1.equals(42))
    println(p1.equals(p2))
}


package ch06.safecalloperator

class Employee(val name: String, val manager: Employee?)
fun managerName(employee: Employee) : String? = employee.manager?.name

fun main(args: Array<String>) {
    val ceo = Employee("보스", null)
    val developer = Employee("밥", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}

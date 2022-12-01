package ch06

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
class Company(val name : String, val address: Address?)
class Person(val name : String, val company: Company?)

fun printShippingLabel(person: Person){
    val address = person.company?.address ?: throw IllegalArgumentException("No address") //주소가 있으면 person.company?.address 없으면 오류 no address
    with(address){
        println(streetAddress)
        println("$zipCode $city, $country")
    }
//    println(address.streetAddress) //with를 사용하지 않을때
//    println("${address.zipCode}, ${address.city}, ${address.country}")
}
fun main(args: Array<String>) {
    val address = Address("엘스터", 12345, "수원", "한국")
    val jetbrains = Company("젯브레인", address)
    val person = Person("김", jetbrains)
    printShippingLabel(person)
    printShippingLabel(Person("알렉세이", null))
}

//foo ?: bar -> foo != null -> foo
//           -> foo == null -> bar
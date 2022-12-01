package ch06.nullabletypeextention

fun verifyUserInput(input:String?){
    if(input.isNullOrBlank()){
        println("필요 필드를 채워주세요")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
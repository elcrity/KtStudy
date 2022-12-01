package ch05.accessingvariables2

import ch05.accessingvariables.printMessageWithPrefix

fun printProblemCounts(responses: Collection<String>){
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach{
        if(it.startsWith("4")){//람다함수 밖에 있는 final 아닌 변수clientErrors에 접근 가능, 변경 가능
            clientErrors++          //람다 안에서 사용화는 외부 변수를 포획한 변수라고 부름
        } else if(it.startsWith("5")){//람다함수 밖에 있는 final 아닌 변수serverErrors에 접근 가능, 변경 가능
            serverErrors++
        }
    }
    println("$clientErrors 클라이언트 에러, $serverErrors 서버 에러")
}

fun main(args: Array<String>) {
    val responses = listOf("200 OK", "418 i'm teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}


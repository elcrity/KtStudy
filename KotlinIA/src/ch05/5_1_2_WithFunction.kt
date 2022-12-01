package ch05.withfunction

fun alphabet() : String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){//with(a,{...})와 같음, 첫번째 인자로 받은 객체를 두번째 인자로 받은 람다의 수신 객체로 지정
        for (letter in 'A' .. 'Z'){
            this.append(letter) //this -> 첫번째 인자로 받은 stringBuilder
        }
        append("\ncompleted2")
        this.toString()
    }
}


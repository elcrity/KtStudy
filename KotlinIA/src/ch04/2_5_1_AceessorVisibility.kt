package ch04.accessorvisibility

class LengthCounter{
    var counter: Int = 0
        private set
    fun addWord(word: String){
            counter += word.length
        }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("헬로우 월드!")
    println(lengthCounter.counter)
}


package ch05.samconstructor

fun createAllDoneRunnable() : Runnable{
    return Runnable { println("All done!")
    }
}
fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}


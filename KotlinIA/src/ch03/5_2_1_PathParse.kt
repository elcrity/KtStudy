package ch03.pathParser

fun pathParser(path:String) {
    val directory = path.substringBeforeLast("\\")
    val fullName = path.substringAfterLast("\\")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir : $directory, name : $fileName, extension : $extension")
}

fun main(args: Array<String>) {
    pathParser("D:\\KtStudy\\KotlinIA.iml")
}
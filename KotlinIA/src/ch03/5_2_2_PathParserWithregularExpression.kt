package ch03.pathparserwithregularexpression

fun pathParser(path: String){
    val regex = """(.+)\\(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)//MatchResult 클래스 객체를 반환
    if(matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured //각 그룹에 담긴 값을 지정된 변수에 구조 분해 할당
        println("Dir : $directory, name : $fileName, extension : $extension")
    }
}

fun main(args: Array<String>) {
    pathParser("D:\\KtStudy\\KotlinIA\\src\\ch02\\1_1HelloWorld.kt")
}

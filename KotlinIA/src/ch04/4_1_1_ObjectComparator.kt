package ch04.objectcomparator

import java.io.File
import java.util.Comparator

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1 : File, file2 : File): Int{
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/User")))

    val file = listOf(File("/Z"),File("/a"))
    println(file.sortedWith(CaseInsensitiveFileComparator))
}

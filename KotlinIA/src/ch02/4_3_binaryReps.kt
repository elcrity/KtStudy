package ch02.binaryReps

import java.util.TreeMap

fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()
    val binaryRepsInt = TreeMap<Char, Int>()

    for (c in 'A'..'F'){
       val binary = Integer.toBinaryString(c.toInt())
       binaryReps[c] = binary //== binaryReps.put(c, binary)
    }
    for(c in 'a'..'f'){
        val binaryInt = c
        binaryRepsInt[c] = binaryInt.toInt()
    }

  for((letter, binary) in binaryReps  ){
      println("$letter = $binary = " + letter.toInt())
  }
    for((letter, binaryInt) in binaryRepsInt){
        println("$letter = $binaryInt")
    }
}


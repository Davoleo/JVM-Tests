package net.davoleo.kotlin.theory

import java.util.*

fun main() {

    //The Repeat Loop
    //repeat(number of times) {code to repeat}
    repeat(3) {
        println("Hello,World!")
    }

    //-----------------------------------------------

    //For Loop with ranges
    for (x in 1..10) {
        println("Loop : $x")
    }

    //-----------------------------------------------

    //Random Numbers
    val rand = Random()
    val randomNum = rand.nextInt(50) + 1

    var guess = 0

    //While Loop
    while (randomNum != guess)
        guess += 1

    println("Random number was: $guess")

    //--------------------------------------

    for (x in 1..20) {
        //Equals to 0 --> Even Number
        if (x % 2 == 0)
            continue

        println("Odd Value: $x")

        if (x == 15)
            break
    }

    //---------------------------------------

    val array3: Array<Int> = arrayOf(3, 6, 9)

    //Iterate through array indices
    for (i in array3.indices)
        println("Multiple of 3: ${array3[i]}")

    for ((index, value) in array3.withIndex())
        println("Index: $index \t Value: $value")

    //----------------------------------------
    //loop@ is a label attached to the for loop - it's not necessary but it makes it easier to see what the code is doing - it also allows to break out of outer blocks
    //break is a flow control keyword just like continue and return, they work the same way as they do in java and other languages

    loop@ for (i in 1..10) {
        if (i % 2 != 0)
            print("$i\t")
        if (i >= 8)
            break@loop
    }

}
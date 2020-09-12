package net.davoleo.kotlin.theory.collections

fun main() {

    /**
     * Creates a range of numbers given the first and the last
     */
    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println("R in Alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)
    val twoTo20 = 2.rangeTo(20)
    val range3 = oneTo10.step(3)

    for (x in range3)
        println("range3: $x")

    for (x in tenTo1.reversed())
        println("Reversed: $x")

}
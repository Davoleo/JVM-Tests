package net.davoleo.kotlin.theory.collections

fun main() {

    val numbers = 1..20

    val listSum = numbers.reduce { x, y -> x + y }
    println("Reduce Sum:  $listSum")

    val listSum2 = numbers.fold(5) { x, y -> x + y }
    println("Fold Sum:  $listSum2")

    println("Evens: ${numbers.any { it % 2 == 0 }}")
    println("Evens: ${numbers.all { it % 2 == 0 }}")

    val big3 = numbers.filter { it > 3 }

    big3.forEach { n -> println(">3 : $n") }

    val times7 = numbers.map { it * 7 }
    times7.forEach { it -> println("mult7 : $it") }
}
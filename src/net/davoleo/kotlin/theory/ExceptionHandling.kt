package net.davoleo.kotlin.theory

fun main() {

    val divisor = 0

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't divide by 0")
        } else {
            println("5 / $divisor = ${5 / divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
    }

}
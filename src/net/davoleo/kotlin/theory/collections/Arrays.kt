package net.davoleo.kotlin.theory.collections

fun main() {

    //Single-Typed Array
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val arr: Array<Int> = arrayOf(1, 2, 3)
    println(intArray.joinToString())
    //Multi-Typed Array
    val array = arrayOf(1, 1.23, "Cat")
    println(array[2])

    array[1] = Math.PI

    println("array length: ${array.size}")
    println("Cat in Array: ${array.contains<Any>("Cat")}")

    var partArray = array.copyOfRange(0, 1)
    println("First: ${array.first()}")
    println("Cat Index: ${array.indexOf<Any>("Cat")}")

    println()
    //x is the index for a five sized array
    //we're going to init that array with a value of the index multiplied by itself (x -> x * x)
    val squaresArray = Array(5) { x -> x * x }
    println(squaresArray[2])

}
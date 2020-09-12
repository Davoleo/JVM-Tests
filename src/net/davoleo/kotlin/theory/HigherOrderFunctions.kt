package net.davoleo.kotlin.theory

fun main() {

    val numList = 1..20;

    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }
    println("---------------------------------------")

    val mult3 = makeMathFunction(3)
    println("5 * 3 = ${mult3(5)}")

    val multiply2 = { num1: Int -> num1 * 2 }

    val numList2 = arrayOf(1, 2, 3, 4, 5)

    mathOnList(numList2, multiply2)


}

//Function that generates a "multiply" function
//Ok this is confusing o.o
fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

fun mathOnList(numList: Array<Int>, myFunction: (num: Int) -> Int) {
    for (num in numList) {
        println("MathOnList ${myFunction(num)}")
    }
}
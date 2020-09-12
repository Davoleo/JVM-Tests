package net.davoleo.kotlin.theory

fun main() {

    //One Line Function
    fun add(num1: Int, num2: Int) = num1 + num2
    println("5 + 4 = ${add(5, 4)}")

    //Default parameter values
    fun subtract(num1: Int = 1, num2: Int) = num1 - num2
    println("5 - 4 = ${subtract(5, 4)}")
    //Named parameters (to insert parameters with the order you want)
    println("4 - 5 = ${subtract(num2 = 5, num1 = 4)}")

    //Void functions (Unit type)
    fun sayHello(name: String): Unit = println("Hello $name")
    sayHello("Davoleo")

    val (two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum = " + getSum(1, 2, 3, 4, 5, 6, 7))

    //Function Literals
    val multiply = { num1: Int, num2: Int -> num1 * num2 }
    println("5 * 5 = " + multiply(5, 5))

    println("5! = " + factorial(5))

}

//Multiple values returned by a function
fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

//Multiple parameters
fun getSum(vararg nums: Int): Int {
    var sum = 0

    nums.forEach { n -> sum += n }

    return sum
}

fun isGreater(num1: Int, num2: Int, num3: Int, num4: Int): Boolean = num1 + num2 > num3 + num4

fun isProduct(num1: Int, num2: Int, result: Int): Boolean {
    return num1 * num2 == result
}

fun divideLongNums(num1: Long, num2: Long): Double {
    return num1.toDouble() / num2.toDouble()
}

fun factorial(x: Int): Int {

    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }

    return factTail(x, 1)
}
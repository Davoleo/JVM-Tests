package net.davoleo.kotlin.theory

fun main() {

    val age = 8;

    //if else (identical to Java)
    if (age < 5)
        println("You're not ready for school")
    else if (age == 5)
        println("You can begin going to school")
    else if (age > 5 && age <= 17) {
        val grade = age - 5
        println("You can go to grade $grade")
    } else {
        println("You can go to college")
    }

    //Kinda recalls switch statement
    when (age) {
        0, 1, 2, 3, 4 -> println("You're not ready for school")

        //checks for a specific value
        5 -> println("You can begin going to school")

        //Checks for a range of values
        in 6..17 -> {
            val grade = age - 5
            println("You can go to grade $grade")
        }

        //default
        else -> println("You can go to college")
    }

    //Example When without a parameter (you can use any kind of boolean expression as cases)
    val n = 111
    when {
        n == 0 -> println("n is zero")
        n in 100..200 -> println("n is between 100 and 200")
        n > 300 -> println("n is greater than 300")
        n < 0 -> println("n is negative")
        // else-branch is optional here
    }

}
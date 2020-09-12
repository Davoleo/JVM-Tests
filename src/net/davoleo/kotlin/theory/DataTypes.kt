package net.davoleo.kotlin.theory

fun main() {

    /**
     * val: constants
     * var: variables
     * "Type Inference": (Kotlin knows automatically the type of the variable by what you assigned to it)
     */
    val name = "Davoleo"
    var age = 18;

    /**
     * Explicit type declaration (var Identifier: Type = value)
     */
    val intBitSize = Int.SIZE_BITS;
    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    /**
     *  bigInt: string template example
     *  smallInt: old string concatenation
     */
    println("BIG BOI INT: $bigInt")
    println("small boi int: " + smallInt)

    /**
     * Types:
     *          Int
     *          Long
     *          Double
     *          Float
     *          Boolean
     *          Short (16 bytes)
     *          Byte  (8 bytes)
     *          Char
     */

    val bigLong: Long = Long.MAX_VALUE
    val smallLong: Long = Long.MIN_VALUE
    println("BIG BOI LONG: $bigLong")
    println("small boi long: $smallLong")

    val bigDouble: Double = Double.MAX_VALUE
    val smallDouble: Double = Double.MIN_VALUE
    println("BIG BOI DOUBLE: $bigDouble")
    println("small boi double: $smallDouble")

    val bigFloat: Float = Float.MAX_VALUE
    val smallFloat: Float = Float.MIN_VALUE
    println("BIG BOI FLOAT: $bigFloat")
    println("small boi float: $smallFloat")

    //Loss of Precision
    val doubleNum1: Double = 1.1111111111111111
    val doubleNum2: Double = 1.1111111111111111
    println("\n Sum : " + (doubleNum1 + doubleNum2))

    /**
     * "is" checks if the type of a variable is the one of the class on the right
     * reflects the old instanceof in Java
     */
    if (true is Boolean) {
        println("\n true is boolean :D")
    }

    //Characters -----------------------------------
    /**
     * Chars Escape sequences:
     * \n is the newline character;
     * \t is the tab character;
     * \r is the carriage return character;
     * \\ is the backslash character itself;
     * \' is the single quote mark;
     * \" is the double quote mark.
     * */

    val letterGrade: Char = 'A'
    println("A is a Char : ${letterGrade is Char}")

    var atSymbol = '\u0040' //@
    println(atSymbol)
    //Increasing char's unicode value by one and printing
    println(++atSymbol)
    println(++atSymbol)
    println(++atSymbol)

    // you can use relational operators with characters - the way they are compared is through their unicode
    // although you can't multiply or divide chars

    //Useful Char Functions
    println("'1' is a digit: " + '1'.isDigit()) //true
    println("'a' is a letter: " + 'a'.isLetter()) //true
    println("'#' is a letter or a digit: " + '#'.isLetterOrDigit()) //false
    println("' ' is a white space: " + ' '.isWhitespace()) //true
    //Returns whether the char is an uppercase letter or not | complementary function: isLowerCase()
    println("'K' is an uppercase letter: " + 'K'.isUpperCase()) //true
    println("G".toLowerCase()) //g

}
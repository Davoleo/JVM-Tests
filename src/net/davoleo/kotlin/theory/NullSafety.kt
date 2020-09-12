package net.davoleo.kotlin.theory

fun main() {

    //by default You can't assign null to an explicit type variable | Unless you mark the type with a "?"
    var nullVal: String? = null

    // ?  if the function could possibly return null
    fun returnNull(): String? {
        return null
    }

    val nullVal2 = returnNull()

    if (nullVal2 != null)
        println("${nullVal2.length}")

    //forcing an operation on a possibly null value
    val nullVal3 = nullVal2!!.length

    //If a null value is trying to be assigned assign the string after "?:"
    val nullVal4: String = returnNull() ?: "No Name"

}
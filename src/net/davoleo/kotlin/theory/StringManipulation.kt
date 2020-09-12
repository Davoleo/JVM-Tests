package net.davoleo.kotlin.theory

fun main() {

    val nick = "Davoleo"
    val longString = """This is a multiline and extremely long string 
        |omg Kotlin is quite awesome, i've never seen this multiline string thingy
        | anywhere else :P
    """.trimMargin()

    val awesome = " is awesome"

    println(nick + awesome)
    println("Long String: $longString")
    println("1 + 2: ${1 + 2}")
    println("Long String Length: ${longString.length}")

    val str1 = "Random String"
    val str2 = "random String"
    println("Strings Equal:  ${str1 == str2}")
    println("Compare Strings:  ${str1.compareTo(str2)}")
    println("Compare A & B: ${"B".compareTo("A")}")

    println("2nd char: ${str1[2]}")
    println("Chars from 2 to 7: ${str1.subSequence(2, 8)}")
    println("Contains random:  ${str1.contains("random")}")
}
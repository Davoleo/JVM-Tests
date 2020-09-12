package net.davoleo.kotlin.practice

import java.util.*
import kotlin.math.ceil


fun main() {
    val scanner = Scanner(System.`in`)

    println("----------------------------------------------")

    var first: Char = scanner.next().first()
    var second: Char = scanner.next().first()

    //check if chars are equals ignoring case
    if (first.toUpperCase() == second.toUpperCase())
        print(true)
    else
        print(false)

    println("----------------------------------------------")

    first = scanner.next().first()
    second = scanner.next().first()
    val third: Char = scanner.next().first()

    //Checks if the three variables are in alphabetical order
    if (first == (second - 1)) {
        if (second == (third - 1))
            println(true)
        else
            print(false)
    } else {
        print(false)
    }

    println("----------------------------------------------")

    first = scanner.next().first()

    //Checks if the variable is either an uppercase letter or a digit between 1 and 9
    if (first.isUpperCase() || first in '1'..'9')
        println(true)
    else
        println(false)

    println("----------------------------------------------")

    val num1 = scanner.next().toInt()
    val num2 = scanner.next().toInt()
    val num3 = scanner.next().toInt()

    println(num1 != num2 && num2 != num3 && num1 != num3)

    println("----------------------------------------------")

    val longs = longArrayOf(100_000_000_001, 100_000_000_002, 100_000_000_003)
    println(longs.joinToString())
    val numbers = intArrayOf(12, 17, 8, 101, 33)
    println(numbers.joinToString())
    val numArr = Array<Int>(100) { 0 }
    numArr[0] = 1
    numArr[9] = 10
    numArr[99] = 100
    println(numArr.joinToString())

    println("----------------------------------------------")

    var times = scanner.next().toInt()
    var count = 0

    repeat(times) {
        val o = scanner.next().toInt()

        if (o > 0) {
            count++
        }
    }

    println(count)

    println("----------------------------------------------")

    times = scanner.nextInt()
    var aCount = 0
    var bCount = 0
    var cCount = 0
    var dCount = 0

    repeat(times) {
        when (scanner.nextInt()) {
            2 -> dCount++
            3 -> cCount++
            4 -> bCount++
            5 -> aCount++
        }
    }
    println("$dCount $cCount $bCount $aCount")

    println("----------------------------------------------")
    times = scanner.nextInt()
    var div4 = 0

    repeat(times) {
        val f = scanner.nextInt()

        if (f % 4 == 0 && f > div4) {
            div4 = f
        }
    }

    println(div4)

    println("----------------------------------------------")

    val intNumber = scanner.nextInt()
    val lowerBound = scanner.nextInt()
    val higherBound = scanner.nextInt()
    val range = lowerBound..higherBound;

    if (lowerBound < higherBound)
        println(intNumber in range)
    else
        println(intNumber !in range)

    println("----------------------------------------------")

    val jAge = scanner.nextInt()
    println(jAge in 18..59)

    println("----------------------------------------------")

    val intRange1 = IntRange(scanner.nextInt(), scanner.nextInt())
    val intRange2 = IntRange(scanner.nextInt(), scanner.nextInt())
    val num = scanner.nextInt()

    println(num in intRange1 && num in intRange2)

    println("----------------------------------------------")

    when (scanner.nextInt()) {
        1, 3, 4 -> println("No!")

        2 -> println("Yes!")

        else -> println("Unknown Number")
    }

    println("----------------------------------------------")

    val army = scanner.nextInt()
    when {
        army <= 0 -> println("no army")
        army in 1..4 -> println("few")
        army in 5..9 -> println("several")
        army in 10..19 -> println("pack")
        army in 20..49 -> println("lots")
        army in 50..99 -> println("horde")
        army in 100..249 -> println("throng")
        army in 250..499 -> println("swarm")
        army in 500..999 -> println("zounds")
        army >= 1000 -> println("legion")
    }

    println("----------------------------------------------")

    val string1 = scanner.nextLine()
    val op = scanner.nextLine()
    val string2 = scanner.nextLine()

    when (op) {
        "equals" -> println(string1 == string2)
        "plus" -> println(string1 + string2)
        "endsWith" -> println(string1.endsWith(string2))
        else -> println("Unknown operation")
    }

    println("----------------------------------------------")

    val string = scanner.next()
    val builder: StringBuilder = StringBuilder()
    for (letter in 'a'..'z') {
        if (!string.contains(letter))
            builder.append(letter)
    }
    println(builder.toString())

    println("----------------------------------------------")

    val weirdWord = scanner.next()
    val charMap: HashMap<Char, Int> = HashMap()
    var finalCount = 0

    for (char in weirdWord) {
        if (!charMap.containsKey(char)) {
            charMap.put(char, 1)
        } else {
            var amount = charMap[char]!!
            charMap[char] = ++amount
        }
    }

    charMap.forEach { (_, count) -> if (count == 1) finalCount++ }
    println(finalCount)

    println("----------------------------------------------")

    val rows: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val columns: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    for (i in 1..6) {
        val n = scanner.nextInt()
        if (i % 2 != 0) {
            rows.remove(n)
        } else {
            columns.remove(n)
        }
    }

    println(rows.joinToString(separator = " "))
    println(columns.joinToString(separator = " "))

    println("----------------------------------------------")

    val number = scanner.nextLine()
    val half = number.length / 2
    val sub1 = number.substring(0..half)
    val sub2 = number.substring(half until number.length)

    var sum1 = 0
    var sum2 = 0

    for (i in 0 until half) {
        sum1 += sub1[i].toInt()
        sum2 += sub2[i].toInt()
    }

    if (sum1 == sum2) {
        println("YES")
    } else {
        println("NO")
    }

    println("----------------------------------------------")

    var stringello = scanner.nextLine()
    val model = scanner.nextLine()

    count = 0
    while (stringello.indexOf(model) != -1) {
        stringello = stringello.replaceFirst(model, "")
        count++
    }
    println(count)

    println("----------------------------------------------")
    //Euphonius words

    val word = scanner.nextLine()
    val groupList = emptyList<Int>().toMutableList()
    count = 0

    var prevChar = false
    for ((index, char) in word.withIndex()) {
        if (index > 0) {
            if (prevChar == isVocal(char)) {
                count++
            } else {
                if (count > 1) {
                    groupList.add(count + 1)
                }
                count = 0
            }
        }
        prevChar = isVocal(char)
    }
    if (count != 0) {
        groupList.add(count + 1)
    }

    var sum = 0
    groupList.forEach { i: Int ->
        sum += ceil((i / 2.0) - 1).toInt()
    }

    println(sum)

    println("----------------------------------------------")
}


fun isVocal(char: Char): Boolean {
    return char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' || char == 'y'
}
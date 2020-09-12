package net.davoleo.kotlin.practice

import java.util.*
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max

fun main() {
    //TODO Some optimizations and refactor, @Davoleo pls k thx

    val scanner = Scanner(System.`in`)

    print("Enter name and surname: ")
    val name = scanner.nextLine()
    print("Enter status: ")
    val status = scanner.nextLine()
    val delim = " § "

    val fontTop = """____ § ___  § ____ § ___  § ____ § ____ § ____ § _  _ § _ §  _ § _  _ § _    § _  _ § _  _ § ____ § ___  § ____ § ____ § ____ § ___ § _  _ § _  _ § _ _ _ § _  _ § _   _ § ___ """.split(delim)
    val fontMiddle = """|__| § |__] § |    § |  \ § |___ § |___ § | __ § |__| § | §  | § |_/  § |    § |\/| § |\ | § |  | § |__] § |  | § |__/ § [__  §  |  § |  | § |  | § | | | §  \/  §  \_/  §   / """.split(delim)
    val fontBottom = """|  | § |__] § |___ § |__/ § |___ § |    § |__] § |  | § | § _| § | \_ § |___ § |  | § | \| § |__| § |    § |_\| § |  \ § ___] §  |  § |__| §  \/  § |_|_| § _/\_ §   |   §  /__""".split(delim)

    var nameTop = ""
    var nameMiddle = ""
    var nameBottom = ""

    name.forEach(action = { char ->
        if (char.isLetter()) {
            val index = (char.toUpperCase() - 65).toInt()
            nameTop += fontTop[index] + " "
            nameMiddle += fontMiddle[index] + " "
            nameBottom += fontBottom[index] + " "
        } else if (char == ' ') {
            nameTop += "     "
            nameMiddle += "     "
            nameBottom += "     "
        }
    })

    val statusLine: String

    if (status.length > nameTop.length) {
        statusLine = "*  $status  *"
        val padLength = (status.length - nameTop.length) / 2.0
        val padding = "".padEnd(ceil(padLength).toInt(), ' ')
        val extra = if (status.length % 2 == 0) " " else ""

        nameTop = "*  $padding$nameTop$padding$extra *"
        nameMiddle = "*  $padding$nameMiddle$padding$extra *"
        nameBottom = "*  $padding$nameBottom$padding$extra *"

    } else {
        val statusPadding = "".padEnd(nameTop.length - status.length, ' ')
        val padLength = statusPadding.length / 2.0

        statusLine = "* "
                .plus(statusPadding.substring(floor(padLength).toInt()))
                .plus(status)
                .plus(statusPadding.substring(ceil(padLength).toInt()))
                .plus("  *")

        nameTop = "*  $nameTop *"
        nameMiddle = "*  $nameMiddle *"
        nameBottom = "*  $nameBottom *"
    }

    val boundary = "".padEnd(max(nameTop.length, statusLine.length), '*')

    println(boundary)
    println(nameTop)
    println(nameMiddle)
    println(nameBottom)
    println(statusLine)
    println(boundary)

}
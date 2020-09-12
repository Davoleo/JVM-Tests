package net.davoleo.kotlin.theory.collections

fun main() {

    //Lists
    //Mutable List
    var list1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    //Immutable List
    val list2: List<Int> = listOf(1, 2, 3)

    list1.add(6)
    println("1st item: ${list1.first()}")
    println("last item: ${list1.last()}")
    println("3rd item ${list1[2]}")

    var list3 = list1.subList(0, 3)
    println("List length : ${list1.size}")
    list3.clear()
    list1.remove(1)
    list1.removeAt(1)

    list1.forEach { i: Int -> println("Mutable List: $i") }
}
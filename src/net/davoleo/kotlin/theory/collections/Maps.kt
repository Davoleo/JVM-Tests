package net.davoleo.kotlin.theory.collections

fun main() {

    //Maps
    //Contains KEY/VALUE pairs

    //Mutable Map
    val map = mutableMapOf<Int, Any?>()

    val map2 = mapOf(1 to ":O", 2 to 25)

    //Change the value of an existing key
    map[1] = "Davoleo"
    map[2] = 42

    //Get the map size
    println("Map Size: ${map.size}")

    //Add new Key/Value Pairs
    map.put(3, "Sbrandisburgo")

    //Remove the pair at the 2nd key
    map.remove(2)

    //For Loop iterating through the map
    for ((x, y) in map) {
        println("Key is $x, Value is $y")
    }

}
package net.davoleo.kotlin.theory

fun main() {

    //Instantiating Objects
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    val botolo = Cat("Botolo", 20.0, 14.5, "Davoleo")
    botolo.getInfo()

    val tweety = Bird("Tweety", true)
    tweety.fly(10.0)

}

//Private by default | unless you specify open
open class Animal(val name: String, var height: Double, var weight: Double) {

    //Constructor
    init {
        //Checks if there's any decimal value inside a string
        val regex = Regex(".*\\d+.*")

        //if require is false an IllegalArgumentException is thrown
        require(!name.matches(regex)) { "Animal Names Can't Contain Numbers" }

        require(height > 0) { "Height must be greater than 0" }
        require(weight > 0) { "Weight must be greater than 0" }

    }

    //Example Method
    open fun getInfo(): Unit {
        println("$name is $height tall and weighs $weight")
    }
}

class Cat(name: String, height: Double, weight: Double, var owner: String) : Animal(name, height, weight) {

    override fun getInfo() {
        super.getInfo()
        println("$name is owned by $owner")
    }

}

//Just like java
interface Flyable {

    var flies: Boolean

    fun fly(distance: Double)
}

class Bird constructor(val name: String, override var flies: Boolean = true) : Flyable {

    override fun fly(distance: Double) {
        if (flies)
            println("$name flies for $distance meters")
    }
}
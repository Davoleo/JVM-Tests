package net.davoleo.scala

object Basics {

  //The entry point of the JVM
  def main(args: Array[String]): Unit = {
    println("Hello, " + " World!")

    //Val are constant values that cannot be reassigned (type inference here [you don't need to specify int but you can do it])
    //It is strongly advised to specify the type for public class fields
    val x = 1 + 1
    //x = 3   Can't do this
    println("x = " + x)

    //Var can be reassigned instead
    //both type specifications and string interpolation are pretty similar to Kotlin
    var y: Int = x * x
    //To interpole values in a string you need to prefix it with 's'
    println(s"x = $y")

    //Block expression to combine multiple expressions
    println("Multiple Expression print: " + {
      val x = 5 + 3
      x + 1
    })

    //Functions are expressions that have parameters

    {
      //Anonymous function example
      (x: Int) => x * 2
    }

    //Named Function example
    val add = (x: Int, y: Int) => x + y
    print("Result of the add function: " + add(2, 5))

    // ----------- Methods -------------
    //They look similar to function but:
    //- They are defined with the "def" keyword
    //- They can take multiple parameter lists
    //- Other differences

    def addThenMultiply(x: Int, y: Int)(mulitplier: Int): Int = (x + y) * mulitplier

    println("Multi param-list method call: " + addThenMultiply(2, 3)(3))

    //------------- Classes ---------------

    //Constructor parameters
    class Greeter(prefix: String, suffix: String) {
      //When a method returns Unit it means that it doesn't return anything useful (Unit is an object that has no information)
      def greet(name: String): Unit = println(prefix + name + suffix)
    }

    //Making an instance of the Greeter class with the new keyword
    val greeter = new Greeter("Hello, ", "!")
    greeter.greet("Davoleo")

    //------------- Case Classes ---------------
    //Instances of Case classes are immutable and compared by value by default
    case class Point(x: Int, y: Int)

    //you can instantiate case classes without the new keyword
    val point = Point(1, 2)
    val point2 = Point(1, 2)
    println("Comparing 2 case class instances: " + (point == point2))

    // ------------- Objects ---------------
    //Singleton instances of their own definition
    object IdGenerator {
      private var counter = 0

      def create(): Int = {
        counter += 1
        counter
      }
    }

    println("New generated id by object: " + IdGenerator.create())

    // ------------- Traits ---------------
    //They're like interfaces (Abstract data types that can contain methods and fields and also have default implementations)
    trait StringSerializable {
      val serialized: String

      override def toString: String = serialize()

      def serialize(): String

      def deserialize(): AnyVal
    }

  }
}

package net.davoleo.groovy

import groovy.transform.PackageScope

import java.util.function.Consumer

class Differences {

    /* Packages imported by default */
    /* All these packages and classes are imported by default, i.e. you do not have to use an explicit import statement to use them:
    *   java.io.*
    *   java.lang.*
    *   java.math.BigDecimal
    *   java.math.BigInteger
    *   java.net.*
    *   java.util.*
    *   groovy.lang.*
    *   groovy.util.*
    */

    //In Groovy, the methods which will be invoked are chosen at runtime.
    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }

    static void testMethod(long l) {
        println "in m(long)"
    }

    static void testMethod(Integer i) {
        println "in m(Integer)"
    }

    //If you don't specify a scope modifier on a field it doesn't mean that it'll be package-private like in java
    //but it means a property will be created (private field with getter and setter to access it)
    String name
    //To create a package-private field you can annotate it with @PackageScope
    @PackageScope
    private String packagePrivateName

    //inner classes
    static class Kek {
        class Pog {
        }
    }
    Kek kek = new Differences.Kek()
    Kek.Pog pog = new Kek.Pog()

    static void main(String[] args) {
        //In java you would get 1 while in Groovy you get 2
        Object o = "Object"
        int result = method(o)
        println(result)

        //Array initializers:
        //Java
        //Can't use, {} block is reserved for closures
        //int[] array = {1, 2, 3};             // Java array initializer shorthand syntax
        //in Groovy 3+ you can optionally use java long syntax
        int[] array2 = new int[]{4, 5, 6}  // Java array initializer long syntax
        //Groovy literal list annotation to initialize an array
        int[] array = [1, 2, 3]

        //ARM Blocks
        new File("/path/to/file").eachLine {
            println(it)
        }

        //Lambda expressions (both java style and with closures)
        Runnable run = { println("run") }
        Consumer<String> lambda = System.out::println

        GString specialString = "can contain interpolation yay $result"

        //Groovy will automatically cast a single-character String to char only when assigning to a variable of type char.
        char test = 'a'
        assert Character.digit(test, 16) == 10: 'But Groovy does boxing'
        assert Character.digit((char) 'a', 16) == 10

        try {
            assert Character.digit('a', 16) == 10
            assert false: 'Need explicit cast'
        } catch (MissingMethodException e) {
        }

        //Groovy will call the Integer Param Method while Java would call the primitive one
        int i
        testMethod(i)

        //In Java == means equality of primitive types or identity for objects. In Groovy == means equality in all cases.
        //It translates to a.compareTo(b) == 0, when evaluating equality for Comparable objects, and a.equals(b) otherwise.
        //To check for identity (reference equality), use the is method: a.is(b).
        //From Groovy 3, you can also use the === operator (or negated version): a === b (or c !== d).
        assert array !== array2

        //Extra Keywords
        var test4 = "kldaksdl" //For inferred type variables
        def test5 = "dsajkjd"
        assert test in array2
        //trait                 //For Trait definitions
        //it                    // Refers to the parameter implicit name withing closures

    }

}

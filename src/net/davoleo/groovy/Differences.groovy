package net.davoleo.groovy

import groovy.transform.PackageScope

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
    * */

    //In Groovy, the methods which will be invoked are chosen at runtime.
    static int method(String arg) {
        return 1
    }

    static int method(Object arg) {
        return 2
    }

    //If you don't specify a scope modifier on a field it doesn't mean that it'll be package-private like in java
    //but it means a property will be created (private field with getter and setter to access it)
    String name
    //To create a package-private field you can annotate it with @PackageScope
    @PackageScope
    private String packagePrivateName

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

    }

}

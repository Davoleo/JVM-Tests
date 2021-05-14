package net.davoleo.groovy.meta

import groovy.time.TimeCategory
import net.davoleo.java.Helper
import org.junit.experimental.categories.Category

/**
 Groovy allows metaprogramming both at compile-time and ad runtime
 Runtime Metaprogramming
 Groovy's Metaobject Protocol (MOP)
 Three kind of Objects:
 1) POJO: Regular Java object whose class can be written in Java or any other JVM language
 2) POGO: A groovy Object object whose class is written in Groovy. implements the {@link GroovyObject} interface by default
 3) Groovy Interceptor: A groovy object that implements the {@link GroovyInterceptable} interface and has method-interception capability
 */
class MetaProgramming implements GroovyInterceptable {

    private def firstField = "Hello"
    def secondField = ' '
    def thirdField = "WORLDO!"

    def getFirstField() {
        return "get" + firstField
    }

    @Override
    Object invokeMethod(String name, Object args) {
        return "Called invokeMethod $name with args $args"
    }

    /*
     * Called whenever a method can't be intercepted through the {@link GroovyObject#invokeMethod(java.lang.String, java.lang.Object)} method
     * The final callback (although it's called before invokeMethod in the chain (?))
     */
//    def methodMissing(String name, def args) {
//        print(name)
//        if (name == 'someMissingMethod')
//            return "$name method was found so I'm being called instead :P"
//    }

    @Override
    Object getProperty(String propertyName) {
        if (propertyName == 'fourthField')
            return 'fourthField'
        else
            return metaClass.getProperty(this, propertyName)
    }

    @Override
    void setProperty(String propertyName, Object newValue) {
        if (propertyName == "thirdField")
            this.@"$propertyName" = 'overridden'
    }

    def test() {
        return 'Test Method Exists and was called'
    }

    static def $static_methodMissing(String name, def args) {
        return "Missing static method of name $name"
    }

    static def $static_propertyMissing(String name) {
        return "Missing static property of name $name"
    }

    static void main(String[] args) {
        //Method interception through invokeMethod
        def groovyClass = new MetaProgramming()
        //if the class didn't Implement (GroovyInterceptable)
        //assert groovyClass.test() == 'Test Method Exists and was called'
        assert groovyClass.someMethod() == 'Called invokeMethod someMethod with args []'

        //getProperty Override
        assert groovyClass.firstField == "getHello"
        assert groovyClass.secondField == ' '
        assert groovyClass.thirdField == "WORLDO!"
        assert groovyClass.fourthField == "fourthField"

        //setProperty Override
        groovyClass.thirdField = "World"
        assert groovyClass.thirdField == 'overridden'

        //get and sets fields bypassing Visibility and setters/getters methods
        assert groovyClass.metaClass.getAttribute(groovyClass, 'firstField') == 'Hello'

        //missingMethod instead of invokeMethod is only called if Groovy can't find any method in the class (called before tho)
        groovyClass.someMissingMethod("LITRI")

        //static methods and fields
        //assert MetaProgramming.foo() == 'Missing static method of name foo'
        assert MetaProgramming.foobar == 'Missing static property of name foobar'

        String metaStringTest = 'test'
        metaStringTest.metaClass.invokeMethod = { String _ ->
            'invoked'
        }

        //TimeCategory is a category class that extends many predefined classes like Integer and Date to accept new methods
        //all of that allows for this simple syntax
        use(TimeCategory) {
            println(1.minute.from.now)
            println(10.hours.ago)

            def someDate = new Date()
            println(someDate - 3.months)
        }
        /** {@link Category(Class)} allows to transform a class into something that extends predefined classes  */

        //You can write default class extensions through static methods and category classes
        //for example file.getText is not defined in File.java but in ResourceGroovyMethods.java which is then injected in the other code
        int i = 0;
        5.maxRetries {
            i++
        }
        assert i == 1

        Helper.printHelloWorld()
    }
}

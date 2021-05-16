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

        //CompileTime metaprigramming advantages are:
        //- Transformations directly visible in bytecode
        //- You can call injected features from other JVM languages
        //- Overall performace improvement

        //2 Categories of AST Transformations:
        //- Global: Applied transparently and globally, as soon as they are found on compile classpath
        //- Local: applied by annotating the source with markers. Unlike the others they may support parameters

        //Example Local Transformations:
        //- @ToString generates a human readable toString representation of the class
        //- @EqualsAndHashCode tries to generate equals and hashCode following the practices described in Effective Java by Josh Bloch
        //- @TupleConstructor generates constructors for each property with default values
        //- @MapConstructor generates a constructor you can use through key-value pairs with the keys being variable names
        //- @Canonical combines @ToString @EqualsAndHashCode and @TupleConstructor
        //- @InheritConstructors tries to generate constructor that match super constructors for you
        //- @Category simplifies the creation of a category class (see example above)
        //- @IndexedProperty can be used to generate getters for indexed properties like lists and arrays
        //- @Lazy implements lazy object initialization in the getter method
        //- @Newify is used to bring alternative syntaxes to construct objects (mainly Ruby and Python)
        //- @Sortable used to automate writing Comparable classes
        //- @Builder generates features so that the class can be used as a builder
        //- @AutoImplement implements all abstract superclass methods returning default values
        //- @NullCheck will block and fail calls if parateres that are passed are null
        //- @Delegate Allows to call methods and properties of the variable called on the class to the methods of the variable
        //- @Immutable combines @ToString @EqualsAndHashCode @TupleConstructor @MapConstructor @ImmutableBase @ImmutableOptions @PropertyOptions @KnownImmutable
        //- @ImmutableBase -> automatically makes the class final
        //- @KnownImmutable marks a class as immutable
        //- @Memoized caches results of computations
        //- @TailRecursive automatically transforms a recursive method call to the iterative version of itself
        //- @Singleton implements the singleton design pattern in the specified class (you can also use lazy init)
        //utils Logging:
        //- @Log relies on the JDK logging framework to log stuff about the method/class
        //- @Commons logging via the Apache Commons Logging framework
        //- @Log4j logging via the Apache Log4j 1.x framework
        //- @Log4j2 logging via the Apache Log4j 2.x framework
        //- @Slf4j logging via Simple Logging Facade for Java framework
        //Concurrency
        //@Synchronized similar to the synchronized keyword but locks on different objects for safer concurrency
        //@WithReadClock and WithWriteClock use java.util.concurrent.locks.ReentrantReadWriteLock to lock and synchronize read and write methods
        //
        //@AutoClone Strategies to implement the @java.lang.Cloneable interface
        //@AutoExternalize Auto implements the java.io.Externalizable interface
        //
        //@Field makes a global script variable (turned into a local run() variable a field of the class of the script)
        //@PackageScope turns a property into a field that has package level scope
        //@AutoFinal automatically marks class fields as final | On methods it makes the parameters final
        //@TypeChecked activates compile-time type checking on your Groovy code
        //@CompileStatic activates static compilation on Groovy Code
        //@CompileDynamic disables static compilation on parts of your Groovy code

    }
}

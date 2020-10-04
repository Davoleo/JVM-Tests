/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 18/03/2020 / 20:55
 * Class: GenericsMain
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package net.davoleo.java.generics;

import net.davoleo.java.model.Box;
import net.davoleo.java.oop.shapes.Shape;

import java.util.*;

import static net.davoleo.java.generics.GenericMethods.*;

//Generics allow to make general classes that can be later restricted to specific data types
public class GenericsMain {

    public static void main(String[] args) {
        //List is an example of generic interface
        List<Integer> intList = new LinkedList<>();

        intList.add(0);
        int x = intList.iterator().next();

        //List of unknown elements (should be used instead of List<Object>) - the ? is the wildcard that adapts to every object
        //It is certain that an element returned from a List<?> is at least an Object
        List<?> unknownList = new ArrayList<>();

        //We should use "? extends SampleClass" for the parameterized type to accept all the objects of the subclasses of the specified class
        List<? extends Shape> polymorphicList = new ArrayList<>();

        //Generic Methods -------------------------------------------
        arrayToCollection(new Integer[] {1, 2, 3, 4, 5}, intList);

        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();

        // T inferred to be Object
        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<>();

        // T inferred to be String
        arrayToCollection(sa, cs);

        // T inferred to be Object
        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<>();

        // T inferred to be Number
        arrayToCollection(ia, cn);

        // T inferred to be Number
        arrayToCollection(fa, cn);

        // T inferred to be Number
        arrayToCollection(na, cn);

        // T inferred to be Object
        arrayToCollection(na, co);

        // compile-time error
        //arrayToCollection(na, cs);

        Box<Integer> integerBox = new Box<>();
        integerBox.setObject(10);
        integerBox.inspect(1.7);

        boolean is = isAnyGreater(new Integer[] {2, 4, 7, 8}, 9);
        System.out.println("Is any Greater: " + is);

        List<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
        Box.addBox(10, listOfIntegerBoxes);
        Box.addBox(20, listOfIntegerBoxes);
        Box.addBox(30, listOfIntegerBoxes);
        Box.printBoxes(listOfIntegerBoxes);

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> stringList = Arrays.asList("abc", "def", "ghi");

        //Will print the sum of elements of this list
        System.out.println("integerList Sum: " + sumOfList(integerList));

        //Will print elements of this lists
        printList(integerList);
        printList(stringList);

        GenericMethods.addNums1to10(intList);
        printList(intList);

        /*
        * Wildcard Guidelines:
        *    An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
        *    An "out" variable is defined with a lower bounded wildcard, using the super keyword.
        *    In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
        *    In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.
        *
        * These guidelines do not apply to a method's return type.
        * Using a wildcard as a return type should be avoided because it forces programmers using the code to deal with wildcards.
        */
    }

}

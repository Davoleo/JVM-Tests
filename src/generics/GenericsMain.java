/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 18/03/2020 / 20:55
 * Class: GenericsMain
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package generics;

import oop.geometria.Figure;

import java.util.*;

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
        List<? extends Figure> polymorphicList = new ArrayList<>();

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

    }


    @SuppressWarnings({"ManualArrayToCollectionCopy", "UseBulkOperation"})
    public static <T> void arrayToCollection(T[] array, Collection<T> collection) {
        for (T item: array) {
            collection.add(item);
        }
    }
}

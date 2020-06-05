/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 03/06/2020 / 20:28
 * Class: GenericMethods
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package generics;

import javafx.util.Pair;

import java.util.Collection;
import java.util.List;

public class GenericMethods {

    public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
        return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
    }

    @SuppressWarnings({"ManualArrayToCollectionCopy", "UseBulkOperation"})
    public static <T> void arrayToCollection(T[] array, Collection<T> collection) {
        for (T item: array) {
            collection.add(item);
        }
    }

    /**
     * Checks if any of the comparable items inside of the passed array are greater than the second element
     * @param array the array of T items (is Comparable)
     * @param elem the second element (is Comparable)
     * @param <T> The type that implements the Comparable interface
     * @return whether any of the array items are greater than the second element
     */
    public static <T extends Comparable<T>> boolean isAnyGreater(T[] array, T elem) {
        for (T arrElem : array) {
            if (arrElem.compareTo(elem) > 0)
                return true;
        }

        return false;
    }

    /**
     * Sample method to showcase a use for UpperBounded Wildcards
     * Sums all the elements of a list of items that are or extend the Number Class
     * @param list the list of Number instances
     * @return the sum in double of all the numbers in the list
     */
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    /**
     * Sample method to showcase a use case for Unbounded Wildcards
     * Prints all the objects of a list
     * @param list the list of objects
     */
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }

    /**
     * Sample method to showcase a use case for Lower Bounded Wildcards
     * Adds numbers from 1 to 10 to a list
     * @param list the list you want to add numbers into
     */
    public static void addNums1to10(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

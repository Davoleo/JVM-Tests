/*-----------------------------------------------
 * Author: Davoleo
 * Date / Hour: 14/02/2019 / 16:00
 * Class: GenericMethods
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 *-----------------------------------------------*/

package net.davoleo.java.collections;

public class GenericMethods {

    public static void main(String[] args) {
        Integer[] iray = {1, 2, 3, 4};
        Character[] cray = {'b', 'u', 'c', 'y'};

        printMeGeneric(iray);
        printMeGeneric(cray);

        //printMe(iray);
        //printMe(cray);

        System.out.println();
        System.out.println("The maximum is: " +  max(23, 42, 1));
        System.out.println("The maximum is: " +  max('s', 'è', '?'));
        System.out.println("The maximum is: " +  max("ASD", "AJL", "ASJD"));
    }

    /**
     * Instead of overloading the same method for all the kinds of data
     * We write one generic method that works with any type of data
     *
     * If you have both overloaded methods and data-specific ones the specific ones will have a higher priority over the generic ones
     *
     * @param x the array of generic data that is going to be printed out
     * @param <T> Is a conventional data type that represent a generic data type, You can use what you want insite < > but the usual parameter is T
     */
    private static <T> void printMeGeneric(T[] x)
    {
        for (T t : x)
            System.out.printf("%s ", t);
        System.out.println();
    }

    /**
     * This is a generic method that returns the maximum between general data
     *
     * Additional Information
     * compareTo:
     * returns a negative number if the object is less than the parameter
     * returns a positive number if the object is more than the parameter
     * returns 0 if the object is equals to the parameter
     *
     * @param a First generic parameter
     * @param b Second generic parameter
     * @param c Third generic parameter
     * @param <T> Some generic type of data: <b>extends Comparable<T> means that the generic data type is restricted to classes that extends Comparable<T> </b>
     * @return returns the maximum between a, b and c
     */
    private static <T extends Comparable<T>> T max(T a, T b, T c)
    {
        T max = a;

        if (b.compareTo(a) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    private static void printMe(Integer[] i)
    {
        for (int x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }

    private static void printMe(Character[] i)
    {
        for (char x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
}

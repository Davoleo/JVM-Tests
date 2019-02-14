package data;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/02/2019 / 16:00
 * Class: GenericMethods
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class GenericMethods {

    public static void main(String[] args)
    {
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b', 'u', 'c', 'y'};

        printMeGeneric(iray);
        printMeGeneric(cray);

        //printMe(iray);
        //printMe(cray);
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

    @SuppressWarnings("unused")
    private static void printMe(Integer[] i)
    {
        for (int x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }

    @SuppressWarnings("unused")
    private static void printMe(Character[] i)
    {
        for (char x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
}

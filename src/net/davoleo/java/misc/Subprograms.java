/*------------------------------------
 * Author: Davoleo
 * Date: 13/5/18
 * Hour: 20:55
 * Copyright - © - Davoleo - 2018
 *------------------------------------*/

package net.davoleo.java.misc;

public class Subprograms {

    /**
     * Prints a row of a given character and length
     *
     * @param symbol  The Character that will be printed
     * @param length  The length of the string of characters
     * @param newLine whether there should be a new line at the end
     */
    public static void printCharRow(char symbol, int length, boolean newLine) {
        for (int j = 0; j < length; j++)
            System.out.print(symbol);

        if (newLine)
            System.out.println();
    }

    /**
     * Clones a char a given number of times
     *
     * @param symbol The char that will be cloned
     * @param count  The number of times it will be cloned
     * @return a string of cloned chars
     */
    private static String cloneChar(char symbol, int count) {
        String row = "";
        for (int i = 0; i < count; i++)
            row += symbol;

        return row;
    }


    private static void printPrettyMessage(String message, char symbol, int length) {
        //String row = clone(symbol, length);
        //System.out.println(row);

        printCharRow(symbol, length, true);

        System.out.println(message);

        printCharRow(symbol, length, false);
    }

    public static void timesTwo(int number) {
        System.out.println("Received Number: " + number + "\n");
        number *= 2;
        System.out.println("Times 2: " + number + "\n");
    }

    public static void main(String[] args) {

        //Subprogram: usually called function, although it's called method in OOP
        //re-usable computational unit
        //Code blocks that can be called an re-used everywhere in the codebase
        //a library: is a collection of functions
        //Functions shouldn't have anything more than the strict necessary stuff to do what they're supposed to do
        double root = Math.sqrt(15.8);

        int n = 333;
        timesTwo(n);
        System.out.println("After the method is called: " + n + "\n");

        // ...other instructions

        //Method call
        printPrettyMessage("bye bye...", '-', 30);

        printPrettyMessage("WARNING: WORK IN PROGRESS", '◬', 40);

        //...other instructions...


    }

}

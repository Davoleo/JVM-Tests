/*------------------------------------
 * Author: Davoleo
 * Date: 16/6/18
 * Hour: 20:00
 * Copyright - © - Davoleo - 2018
 *------------------------------------*/

package net.davoleo.java.misc;

import java.io.IOException;
import java.io.InputStreamReader;

public class Extras {

    public static void main(String[] args) {
        //escape sequences
        //Codes that you can use in string and char literals that correspond to certain special chars or actions
        System.out.println("\thello");          //\t inserts a tab space
        System.out.println("hello\b");          //\b inserts a backspace
        System.out.println("\nhello");          //\n creates a new line
        System.out.println("hello\rapple");     //\r inserts a carriage return (line interruption)
        System.out.println("hello\f");          //\f inserts a formfeed
        System.out.println("\'hello\'");        //\' inserts a '
        System.out.println("\"hello\"");        //\" inserts a "
        System.out.println("\\hello\\");          //\\ inserts a \

        int readChar = -1;
        System.out.print("Write a char: ");
        InputStreamReader keyboard = new InputStreamReader(System.in);

        //try/catch statement to handle exceptions
        try {
            readChar = keyboard.read();
        } catch (IOException e) {
            //the catch block is called if an exception is raised
            e.printStackTrace();
        }

        try {
            int lol = 5 / 0;
        } catch (Exception e) {
            System.out.println("HAHHAHAHHAAHAHAHAHAHAHHAHAHAHA");
        }

        System.out.println("the ASCII code of the input char is: " + readChar);

        System.out.println("--- Factorial ---");
        System.out.println(factorial(100));

    }

    /**
     * Controlled recursive call
     *
     * @param n number you need the factorial of
     * @return factorial of n
     */
    private static long factorial(long n) {
        if (n <= 1)
            return 1;
        else
            return factorial(n - 1);
    }
}

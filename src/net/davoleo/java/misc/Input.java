/*------------------------------------
 * Author: Davoleo
 * Date: 9/5/18
 * Hour: 00:30
 * Copyright - © - Davoleo - 2018
 *------------------------------------*/

package net.davoleo.java.misc;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        //System.in: The default input flux (i.e: Keyboard)
        //Scanner is a class that can analyze input fluxes

        Scanner keyboard = new Scanner(System.in);

        //nextInt is a method of the Scanner class that looks for a numeric value to return from an input string
        int eta = keyboard.nextInt();
        System.out.println("hai " + eta + " anni");
    }
}

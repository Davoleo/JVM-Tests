/*--------------------------------------
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 22.54
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 *--------------------------------------*/

package net.davoleo.java.practice;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int n;
        double media;
        final int count;

        System.out.println("Write how many number you want the average of: ");
        count = keyboard.nextInt();

        int i = 0;
        while (i < count) {
            System.out.println("Insert the n°o " + (i + 1) + ": ");
            n = keyboard.nextInt();
            total += n;
            i++;
        }

        media = (double) total / count;
        System.out.println("The average is: " + media);

    }
}

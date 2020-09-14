/*---------------------------------
 * Author: Davoleo
 * Date: 9/5/18
 * Hour: 23:35
 * Copyright - © - Davoleo - 2018
 *---------------------------------*/

package net.davoleo.java.statements;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        //iterative statement
        //repeats a code block until the condition becomes false

        //counter
        int num = 0;

        //if you have just one line of instructions then you can avoid braces
        while (num <= 100000) {
            //System.out.println(num);
            num++;
        }

        int count = 0;
        int sum = 0;

        while (count <= 100) {
            sum += count;
            count++;
        }

        System.out.println(sum);

        //Sum between numbers in the range between A and B
        Scanner tastiera = new Scanner(System.in);
        int sumAB = 0;   //sum between bounds
        int a = 0, b = 0;    //bounds

        System.out.println("I'll start from: ");
        a = tastiera.nextInt();

        System.out.println("I'll sum numbers until: ");
        b = tastiera.nextInt();

        if (b < a) {
            System.out.println("ok I'll swap the bounds for you, little bitch... ");
            int temp = a;
            a = b;
            b = temp;
        }
        int count2 = a;
        while (count2 <= b)
        /*{
            sumAB += count2;
            count2++;
        }*/
            sumAB += count2++;

        System.out.println("The sum of numbers in the range between " + a + " and " + b + " is: " + sumAB);

        int sum1000 = 0;
        while (sum1000 < 1000) {
            System.out.println("Adding another number (" + sum1000 + "):");
            sum1000 += tastiera.nextInt();
        }
        System.out.println("Finished with value: " + sum1000);

        /*
        Do-While Cycle
        Characteristics:
        The code is executed at least one time before evaluating the condition
        */
        int cont = 0;
        do {
            System.out.println("HI EVERYONE");
            cont++;
        }
        while (cont < 11);

    }
}

package net.davoleo.java.practice;

import java.util.Random;
import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date: 03/10/2018
 * Hour: 18.11
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Randomizer {

    public static void main(String[] args) {

        boolean doContinue;

        do {
            Random r = new Random();
            Scanner keyboard = new Scanner(System.in);
            int n, limitMax;

            System.out.println("Write the high bound (Max: " + Integer.MAX_VALUE + "):");
            limitMax = keyboard.nextInt();

            n = r.nextInt(limitMax);

            System.out.println("The generated number is: " + n);

            System.out.println("Do you want to generate another number? (true/false) ");
            doContinue = keyboard.nextBoolean();
        }
        while (doContinue);
    }
}
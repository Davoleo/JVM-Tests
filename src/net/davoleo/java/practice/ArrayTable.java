/*------------------------------------
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 15.40
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 *------------------------------------*/

package net.davoleo.java.practice;

import java.util.Random;

public class ArrayTable {

    public static void main(String[] args) {
        System.out.println("Index\tValue");

        int[] array = {32, 18, 14, 12, 54, 2};

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + "\t\t" + array[i]);
        }

        System.out.println("-------------------------------------------------------------");

        Random rand = new Random();
        int[] frequency = new int[7];

        for (int roll = 0; roll < 1000; roll++)
            ++frequency[1 + rand.nextInt(6)];

        System.out.println("Side\tFrequency");

        for (int side = 1; side < frequency.length; side++)
            System.out.println(side + "\t\t" + frequency[side]);
    }
}

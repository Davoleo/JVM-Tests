package net.davoleo.java.esercizi;

import java.util.Random;

/*************************************************
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 15.40
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ArrayTable {
    public static void main(String[] args)
    {
        System.out.println("Indice\tValore");

        int array[]={32,18,14,12,54,2};

        for (int i=0; i<array.length; i++)
        {
            System.out.println(i+1 + "\t\t" + array[i]);
        }

        System.out.println("-------------------------------------------------------------");


        Random rand = new Random();
        int frequenza[] = new int[7];

        for (int roll=0; roll<1000; roll++)
            ++frequenza[1 + rand.nextInt(6)];

        System.out.println("Faccia\tFrequenza");

        for (int faccia=1; faccia<frequenza.length; faccia++)
            System.out.println(faccia + "\t\t" + frequenza[faccia]);

    }
}

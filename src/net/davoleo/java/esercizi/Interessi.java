package net.davoleo.java.esercizi;

/*************************************************
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 23.24
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Interessi {
    public static void main(String[] args)
    {
        double somma;
        double principale = 10000;
        double ratio = .01;

        for(int giorno=1; giorno <= 20; giorno++)
        {
            somma = principale*Math.pow(1 + ratio, giorno);
            System.out.println(giorno + "   " + somma);
        }

    }

}

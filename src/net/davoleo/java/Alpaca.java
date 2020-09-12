package net.davoleo.java;

import net.davoleo.java.model.Time;

import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date: 11/10/2018
 * Hour: 00.11
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Alpaca {

    public static void main(String[] args)
    {

        Scanner tastiera = new Scanner(System.in);

        //Advanced Hello World
        String section;
        System.out.println("Inserisci la sezione che vuoi avviare: ");
        System.out.println("Sezioni: 'advanced_hello' | 'constructors' | 'VLAM' | 'time'");
        section = tastiera.nextLine();

        switch (section)
        {
            case "advanced_hello":
            Helper h1 = new Helper();

            System.out.println("Inserisci il tuo nome: ");
            String name = tastiera.nextLine();
            System.out.println("Inserisci il nome della tua prima ragazza: ");
            h1.setGirlName(tastiera.nextLine());
            h1.simpleMessage(name);
            break;

            case "constructors":
                Helper h2 = new Helper("Guidobalda");
                h2.simpleMessage("GESU'");
                break;

                //Sta per Variable Length Arguments Methods
            case "VLAM":
                System.out.println(Helper.average(12,21,54,23,8));
                break;

            case "time":
                Time time = new Time();

                time.setTime(20, 43, 3);
                System.out.println(time.toMilitary());
                System.out.println(time.toString());
                break;

                default:
                    System.out.println("INVALID INPUT!");


        }


    }

}

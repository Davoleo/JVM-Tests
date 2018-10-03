package esercizi;

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

            do
            {
                Random r = new Random();
                Scanner keyboard = new Scanner(System.in);
                int n, limitMax;

                System.out.println("Inserisci il limite massimo (Max: " + Integer.MAX_VALUE + "):");
                limitMax = keyboard.nextInt();

                n = r.nextInt(limitMax);

                System.out.println("Il numero generato è: " + n);

                System.out.println("Vuoi generare un altro numero? (true/false) ");
                doContinue = keyboard.nextBoolean();
            }

            while (doContinue);


        }

    }

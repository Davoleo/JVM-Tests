package esercizi;

import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 22.54
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Media {

    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        int somma = 0;
        int n;
        double media;
        int contatore = 0;
        final int quantita;

        System.out.println("Inserisci il numero di numeri di cui vuoi fare la media: ");
        quantita = tastiera.nextInt();

        while(contatore < quantita)
        {
            System.out.println("Inserisci il " + (contatore + 1) + "° numero: ");
            n = tastiera.nextInt();
            somma += n;
            contatore++;
        }

        media = (double)somma/quantita;
        System.out.println("La media dei numeri inseriti è: " + media);

    }
}

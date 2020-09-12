package net.davoleo.java.costrutti;

public class For {

    /*************************************************
     * Author: Davoleo
     * Date: 10/5/18
     * Hour: 15:55
     * Copyright - © - Davoleo - 2018
     **************************************************/


    public static void main(String[] args){
        //ciclo enumerativo
        //solitamtente utilizzato quando si sa il numero di cicli da far compiere al codice
        //la prima riga gestisce tutto
        //3 parametri:
        // | inizializzazione (si può fare anche prima, viene eseguita solo una volta, può essere complessa)
        // | condizione
        // | operazioni sul contatore (possono essere su più contatori, vengono eseguite dopo la stampa)

        //Stampa dei primi 50 numeri interi
        int totale = 0;
        for(int numero=1; numero <=50; numero++)
        {
            System.out.println(numero);
            totale += numero;
        }
            System.out.println(totale);

        //Countdown da 100 a 0
        for (int numero = 100; numero >= 0; numero--)
            System.out.println(numero);

        //Possono mancare dei parametri:
        //Inizializzazione: il contatore non esiste, il ciclo va all'infinito
        //Condizione: il ciclio va all'infinito
        //Operazione sul contatore: il contatore è bloccato, il ciclio va all'infinito

        //Somma dei numeri tra A e B ("For" version)
        int a = 36, b = 67, somma = 0;
        for (int cont = a; cont<=b; cont++)
            somma += a;
        System.out.println(somma);

        //Somma dei numeri tra C e D interrompendo al numero ...
        int c = 36, d= 67, somma2 = 0;
        for (int cont = c; cont<=d; cont++)
        {
            if (cont%17==0)
                break;
            else
            somma += c;
        }
        System.out.println(somma);




    }
}

package costrutti;
import java.util.Scanner;

public class While {

    /*************************************************
     * Author: Davoleo
     * Date: 9/5/18
     * Hour: 23:35
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args){
        //i cicli, struttura iterativa (di ripetizione)
        //ripetizione per vero, uscita per falso

        int num = 0;       //contatore

        while(num<=100000)   //come per l'If se c'è solo una riga di istruzioni si possono evitare le graffe
        {
            //System.out.println(num);
            num++;
        }

        int cont1 = 0;
        int somma = 0;
        int limite = 100;

        while(cont1 <= 100)
        {
            somma += cont1;
            cont1++;
        }

        System.out.println(somma);

        //Somma dei numeri compresi tra A e B letti da tastiera
        Scanner tastiera = new Scanner(System.in);
        int sommaA_B = 0;   //somma tra gli estremi
        int a = 0, b= 0;    //estremi

        System.out.println("Parto da: ");
        a= tastiera.nextInt();      //richiesta del dato

        System.out.println("E arrivo fino a: ");
        b = tastiera.nextInt();

        if (b<a)
        {
            System.out.println("va be scambierò io i due estremi brutto stronzo... " +
                    "ma guarda te queste persone che inseriscono i dati al controrio");
            int temp = a;
            a=b;
            b=temp;
        }
        int cont2 = a;
        while (cont2<=b)
        /*{
            sommaA_B += cont2;
            cont2++;
        }*/
        //più ottimizzato
        sommaA_B += cont2++;

        System.out.println("la somma dei numeri tra " + a + " e " + b + " è: " + sommaA_B);

        //far inserire dati da tastiera e sommarli fintanto che la somma è inferiore a 1000
        int somma1000 = 0;
        while(somma1000 < 1000)
        {
            System.out.println("Aggiungiamo un altro numero(" + somma1000 + "):");
            somma1000 += tastiera.nextInt();
        }
        System.out.println("Terminato con valore: " + somma1000);

        /*Ciclo Do-While

        Caratteristiche:
        Condizione in coda
        Il codice viene eseguito almeno una volta prima di verificare la condizione
        */
        int cont = 0;
        do
            {
                System.out.println("HI EVERYONE");
                cont ++;
            }
                while (cont<11);

    }
}

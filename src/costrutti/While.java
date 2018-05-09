/*************************************************
 * Author: Davoleo
 * Date: 9/5/18
 * Hour: 23:35
 * Copyright - © - Davoleo - 2018
 **************************************************/

package costrutti;
import java.util.Scanner;

public class While {
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
        int sommaA_B = 0;
        int a = 0, b= 0;

        System.out.println("Parto da: ");
        a= tastiera.nextInt();

        System.out.println("E arrivo fino a: ");
        b = tastiera.nextInt();

        if (b<a)
        {
            int temp = a;
            a=b;
            b=temp;
        }
        int cont2 = a;
        while (cont2<=b);
        {
            sommaA_B += cont2;
            cont2++;
        }

    }
}

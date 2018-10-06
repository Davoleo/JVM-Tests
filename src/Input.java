import java.util.Scanner;

public class Input {

    /*************************************************
     * Author: Davoleo
     * Date: 9/5/18
     * Hour: 00:30
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args){

        //System.in è il flusso di input di default; quello da tastiera
        //Scanner è la classe che permette di analizzare i flussi in input

        Scanner tastiera = new Scanner(System.in);

        //nextInt è un comando della classe Scanner che cerca per un valore numerico da applicare ad una variabile
        int eta = tastiera.nextInt();
        System.out.println("hai " + eta + " anni");
    }
}

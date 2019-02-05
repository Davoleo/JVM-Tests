package altro;

import java.io.*;

public class Extra {

    /*************************************************
     * Author: Davoleo
     * Date: 16/6/18
     * Hour: 20:00
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {
        //Sequenze di escape
        //Codici utilizzabili nei char e nelle string che corrispondono a certe azioni

        System.out.println("\tciao");          //\t inserisce uno spazio di tabulazione
        System.out.println("ciao\b");          //\b inserisce un backspace in quel punto
        System.out.println("\nciao");          //\n va a capo, crea una nuova linea
        System.out.println("ciao\rapple");     //\r inserisce un interruzione di riga [carriage return]
        System.out.println("ciao\f");          //\f inserisce un formfeed
        System.out.println("\'ciao\'");        //\' inserisce un '
        System.out.println("\"ciao\"");        //\" inserisce un "
        System.out.println("\\ciao\\");          //\\ inserisce un \

        int carattereLetto = -1;
        System.out.print("Inserisci una parola: ");
        InputStreamReader tastiera = new InputStreamReader(System.in);

        //Costrutto try catch per gestire le eccezioni
        try
        {
            carattereLetto = tastiera.read();
        }
        catch (IOException e)       //Interviene se l'eccezione si solleva
        {
            e.printStackTrace();
        }

        try {
            int lol = 5/0;
        } catch (Exception e) {
            System.out.println("HAHHAHAHHAAHAHAHAHAHAHHAHAHAHA");
        }

        System.out.println("Il codice asci del carattere inserito è: " + carattereLetto);

        System.out.println(factorial(100));

    }

    /**
     * Controlled recursive call
     * @param n number you need the factorial of
     * @return factorial of n
     */
    private static long factorial(long n)
    {
        if (n <= 1)
            return 1;
        else
            return factorial(n - 1);
    }
}

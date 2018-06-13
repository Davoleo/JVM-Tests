/*************************************************
 * Author: Davoleo
 * Date: 13/5/18
 * Hour: 20:55
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Sottoprogrammi {

    static void messaggio(String ilMessaggio, char simbolo, int lunghezza)
        {

            for(int j=0; j<lunghezza; j++)
            System.out.print(simbolo);

            System.out.println("\n" + ilMessaggio);

            for(int j=0; j<lunghezza; j++)
            System.out.print(simbolo);
            System.out.println();

        }

    public static void main(String[] args) {

        //Sottoprogramma: in C detto funzione aka metodo in OOP
        //unità di elaborazione riutilizzabile
        //blocchi di codice che possono essere richiamati e utilizzati in qualsiasi altro posto
        //meccanismo alla base di ogni processo industriale
        //libreria: una collezione più o meno grande di funzioni
        //prefabbricati che non fanno nulla di superfluo come output o input a meno che non sia la loro direttiva principale
        double radice = Math.sqrt(15.8);

        // ...altre istruzioni

        //richiamo del metodo
        messaggio("ciao ciao....", '-', 30);

        messaggio("ATTENZIONE: LAVORI IN CORSO", '◬', 50);

        //...altre istruzioni...

    }

}

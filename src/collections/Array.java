package collections;

import java.util.Random;

public class Array {

    /*************************************************
     * Author: Davoleo
     * Date: 14/6/18
     * Hour: 01:00
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main (String [] args)
    {
     //non si tratta di un tipo primitivo (situazione simile alle String)
        //elenco di cellette più o meno lungo nel quale si possono memorizzare dei dati detti elementi
        //gli array monodimensionali sono detti anche vettori
        //Mai andare oltre il limite degli array poiché non c'è un blocco e da errore:
        //ArrayOutOfBoundsException


        Random r = new Random();
        double totaleIncassi = 0;
        double[] incassiGiornalieri = new double [30];

        for (int giorno = 0; giorno<30; giorno++)
        {
            System.out.print("Inserire l'incasso per il giorno "+giorno+ ": ");
            incassiGiornalieri[giorno] = r.nextDouble()*10000;
            System.out.println(incassiGiornalieri[giorno]);
            totaleIncassi+=incassiGiornalieri[giorno];
        }
        double mediaIncassi = totaleIncassi/30;
        System.out.println("\nIncasso medio giornaliero: "+mediaIncassi);

        for(int giorno = 0; giorno<30; giorno ++)   //scannerizza tutte le celle dell'array
        if(incassiGiornalieri[giorno] < mediaIncassi)
            System.out.println("Il giorno " + (giorno+1) + " del mese l'incasso " + "(" + incassiGiornalieri[giorno]+") risulta " + "inferiore alla media");

        String[] giorniSettimana = {"Lunedì", "Martedì", "Mercoledì", "Giovedì","Venerdì","Sabato","Domenica"};


        int array[]={3,4,5,6,7,8};
        add5(array);
        for(int y : array)
            System.out.println();

    }

    private static void add5(int x[])
    {
        for(int i=0; i<x.length; i++)
            x[i]+=5;
    }

}

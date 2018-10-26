package costrutti;

/*************************************************
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 15.56
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ForEach {
    public static void main(String[] args)
    {
        //Costrutto foreach (specializzato per lavorare con gli array)

        int elencoEta[]={21, 16, 86, 21, 3};
        int sommaEta = 0;

        //Per ogni intero presente in elencoEtà
        //I numeri vengono mano a mano memorizzati dentro int età
        for (int eta : elencoEta)
            sommaEta+=eta;
        //  ^^^ Aggiungo il valore di età a sommaEtà per ogni volta che il ciclo viene eseguito

        System.out.println("La sommma di tutte le età è: " + sommaEta);
    }
}

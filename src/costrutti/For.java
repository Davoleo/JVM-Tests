/*************************************************
 * Author: Davoleo
 * Date: 10/5/18
 * Hour: 15:55
 * Copyright - © - Davoleo - 2018
 **************************************************/

package costrutti;

public class For {
    public static void main(String[] args){
        //ciclo enumerativo
        //solitamtente utilizzato quando si sa il numero di cicli da far compiere al codice

        //Stampa dei primi 50 numeri interi
        //la prima riga gestisce tutto
        //3 parametri:
        //inizializzazione si può anche fare prima | condizione | operazione sul contatore (viene eseguita dopo la stampa)
        int totale = 0;
        for(int numero=1; numero <=50; numero++)
        {
            System.out.println(numero);
            totale += numero;
        }
            System.out.println(totale);
    }
}

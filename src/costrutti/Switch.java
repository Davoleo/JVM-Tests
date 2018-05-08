/*************************************************
 * Author: Davoleo
 * Date: 9/5/18
 * Hour: 00:00
 * Copyright - © - Davoleo - 2018
 **************************************************/

package costrutti;

public class Switch {
    public static void main(String[] args) {
        //Struttura selettiva multipla

        /*Costrutto che parmette al programma di scegliere fra più opzioni a seconda del risultato di
         una certa espressione non condizionale*/

        //l'espressione può consegnare un valore di tipo:
        //numerico (byte, short, int)
        //caratteriale (char)
        //letterale (String)
        //enumerazioni (enum)

        int mese = 5;

        switch(mese)
        {
            //i casi vengono targettati con case
            case 1:     case 3:     case 5:     case 7:     case 8:     case 10:    case 21:
                System.out.println("31g");
                break;  //rompe le istruzioni del caso dalle istruzioni scritte dopo

            case 2:
                System.out.println("28g");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("30g");
                break;

            default:
                System.out.println("erratus est! :P");
                break;

        }

    }
}

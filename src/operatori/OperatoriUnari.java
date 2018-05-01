/*************************************************
 * Author: Davoleo
 * Date: 1/5/18
 * Hour: 11:00
 * Copyright - © - Davoleo - 2018
 **************************************************/

package operatori;

public class OperatoriUnari {

    public static void main(String[] args) {
        System.out.println("8989898");

        //Unari, quando agiscono su una sola espressione

        //prefissi
        // - come negazione!  non come sottrazione!
        // + sottintendibile! non come addizione!
        // ++ Incrementare di 1 il valore della variabile PRIMA l'utilizzo   (++a)
        // -- Diminuire di 1 il valore della variabile PRIMA l'utilizzo  (--a)
        // ! operatore logico NOT
        // ~ operatore di negazione bit a bit [bitwise]

        //infissi

        //postfissi
        // ++ Incrementare di 1 il valore della variabile DOPO l'utilizzo
        // -- Diminuire di 1 il valore della veriabile DOPO l'utilizzo

        int a = 5;
        int b = -a;
        //a = -(b+2 - a);
        /* System.out.println(a++);
           System.out.println(a);    */
        System.out.println(++a);
        System.out.println(a);
        /*System.out.println(b--);
        System.out.println (b); */
        System.out.println(--b);
        System.out.println(b);

        //#tramiteilcodiceASCII
        char c = 'U';
        System.out.println(--c);

        int eta = 17;
        boolean maggiorenne =  (!(eta > 18));
        System.out.println(maggiorenne);

        //"10001" ---> "01110"
        int EtaNegataBitaBit = ~eta;
        System.out.println(EtaNegataBitaBit);

        //boolean n = false;
        //System.out.println(!n);

    }
}

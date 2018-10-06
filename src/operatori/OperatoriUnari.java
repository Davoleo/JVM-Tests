package operatori;

public class OperatoriUnari {

    /*************************************************
     * Author: Davoleo
     * Date: 1/5/18
     * Hour: 11:00
     * Copyright - © - Davoleo - 2018
     **************************************************/

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

        int c = 8;
        //Incrementa il valore di c del numero dopo l'operatore
        c += 8;
        System.out.println(c);
        //Decrementa il valore di c del numero dopo l'operatore
        c -= 10;
        System.out.println(c);
        //Moltiplica il valore di c del numero dopo l'operatore
        c *= 10;
        System.out.println(c);
        //Divide il valore di c del numero dopo l'operatore
        c /= 5;
        System.out.println(c);


        //#tramiteilcodiceASCII
        char ch = 'U';
        System.out.println(--ch);

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

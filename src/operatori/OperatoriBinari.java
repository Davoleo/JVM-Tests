/*************************************************
 * Author: Davoleo
 * Date: 2/5/18
 * Hour: 18:50
 * Copyright - © - Davoleo - 2018
 **************************************************/

package operatori;

public class OperatoriBinari {
    public static void main(String[] args) {
        //Binari, quando agiscono su 2 espressioni (infissi)

        //operatore di addizione
        int i1 = 0, i2 = 0, i3 = 0, i4 = 0;
        double d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        String s1 = "", s2 = "", s3 = "";

        i1 = 5 + 3; i2 = 6 + i1; i3 = i1 + i2;

        i1 = 3 + 6 + 8 + 10;
        i2 = (12 + 6) * 2 * (i3 - (i4 / 5));

        i1 = 1000 * 1000 * 1000 * 1000;

        System.out.println(i1);

        s1 = "Ciao";
        s2 = " Mannarof";
        //s3 = s1 + s2;     non va.... ???

        char c1='A',c2='c', c3=' ';
        c3 = (char) (c1 + c2); //Cast, forzatura di tipo [necessaria]
        System.out.println(c3);

        // non possibile con i boolean

        //operatore di sottrazione
        int SottrazioneEsagerata = -1000 * 1000 * 1000 * 1000;

        char c4 = 'z' - 'A';
        System.out.println(c4);
        //non possibile con i boolean

        //operatore di moltiplicazione
        // Stesse particolarità di quello di sottrazione
        char c5 = 'z' * 'A';
        System.out.println(c5);

        //operatore di divisione
        int div1 = 5 / 3;           // viene calcolato il quoziente intero
        System.out.println(div1);
        d1 = 40.0 / 15f;
        System.out.println(d1);
        /*va rappresentato con la virgola oppure con una f altrimenti tutta l'operazione
        torna agli interi, oppure effettuando un Cast*/

        //operatore di resto
        int resto = 11 % 3;
        System.out.println(resto);

        char c6 = 'a' / (char) 3;
        System.out.println("#" + c6 + "#");

        /*
        d1 = 100 + 34.81;   Si, promossione da int a double (no perdita dati)
        i1 = 100 + 34.81;   NO, retrocessione da double a int (perdita di dati, il compilatore evita a meno che non si ponga un cast)
        */

        String ciao = "cia" + 'o' + '!';
        System.out.println(ciao);

        String cose = "ciao" + true;
        System.out.println(cose);

    }
}

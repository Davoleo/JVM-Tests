/*************************************************
 * Author: Davoleo
 * Date: 4/5/18
 * Hour: 21:31
 * Copyright - © - Davoleo - 2018
 **************************************************/

package operatori;

public class OperatoriAssegnamento {
    public static void main(String[] args) {

        int n = 10;
        //    ^ op. di assegnamento
        int totaleSpese = 0;

        totaleSpese += 1;
        totaleSpese -= 1000;
        totaleSpese *= 5;
        totaleSpese /= 3;
        System.out.println(totaleSpese);

        System.out.println(n %= 7 );

        //  &=      ^=      <<=     >>=     >>>=            operazioni bit-a-bit



    }
}

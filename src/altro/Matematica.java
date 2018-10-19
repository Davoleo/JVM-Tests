package altro;

/*************************************************
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 23.35
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Matematica {
    public static void main(String[] args)
    {
        //Valore assoluto
        System.out.println(Math.abs(-23.7));

        //Approssima per eccesso (sempre)
        System.out.println(Math.ceil(7.3));

        //Approssima per difetto (sempre)
        System.out.println(Math.floor(7.9));

        //Valore massimo tra 2 numeri
        System.out.println(Math.max(5.6, 8.5));

        //Valore minimo tra 2 numeri
        System.out.println(Math.min(5.6, 8.5));

        //Eleva a potenza
        //Primo parametro: base
        //Secondo parametro: esponente
        System.out.println(Math.pow(5, 3));

        //Fa la radice quadrata
        System.out.println(Math.sqrt(16));

        //Arrotonda
        System.out.println(Math.round(4.7));

        //Restituisce un valore randomico tra 0 e 1
        System.out.println(Math.random());




    }

}

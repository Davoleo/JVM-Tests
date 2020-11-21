package net.davoleo.java.operators;

public class Relational {

    /*************************************************
     * Author: Davoleo
     * Date: 4/5/18
     * Hour: 21:45
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {

        //They output a boolean result

        //Equality operator == (DOUBLE Equals)
        System.out.println(5 == 5);
        System.out.println(5 == 3);

        //Lesser or Greater Than Operators (>     >=      <=      <)
        int age = 22;
        boolean underage = age < 18;
        System.out.println(underage);

        //operatore "different" !=
        String test = "ciao";
        boolean uguale = (test != "ciao");
        System.out.println(uguale);

        //Special cases
        String cognome1 = "Rossi";
        String cognome2 = "Rossi ";
        boolean confronto = (cognome1 == cognome2);
        System.out.println(confronto);

        //You should compare 2 strings using the compareTo Method
        // if the second string is greater than the first one we get a negative value
        // if strings are equal we get 0
        // if the first string is greater than the second one we gat a positive value
        System.out.println(cognome1.compareTo(cognome2));

        //Relational operators on chars compare their ASCII Code
        System.out.println('a' > '#');
    }
}

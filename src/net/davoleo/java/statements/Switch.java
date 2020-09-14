/*-------------------------------------
 * Author: Davoleo
 * Date: 9/5/18
 * Hour: 00:00
 * Copyright - © - Davoleo - 2018
 *-------------------------------------*/

package net.davoleo.java.statements;

public class Switch {

    public static void main(String[] args) {
        //Multiple selective structure

        //Statement that allows the program execution to execute different blocks of code depending on the evaluation of something to a costant

        //The switch can use these variable types:
        //numeric (byte, short, int)
        //characters (char)
        //string (String)
        //enumerations (enum)

        int month = 5;

        switch (month) {
            //different cases are targeted through the 'case' keyword
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31g");
                break;  //breaks the execution of the switch to avoid cascading to other cases

            case 2:
                System.out.println("28g");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30g");
                break;

            default:
                System.out.println("erratus est! :P");
                break;
        }

    }
}

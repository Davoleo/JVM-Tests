import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date: 11/10/2018
 * Hour: 00.11
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Alpaca {

    public static void main(String[] args)
    {
        //Advanced Hello World
        Scanner tastiera = new Scanner(System.in);
        Helper helper = new Helper();

        System.out.println("Enter your name here: ");
        String name  = tastiera.nextLine();
        System.out.println("Enter name of first gf here: ");
        helper.setGirlName(tastiera.nextLine());
        helper.simpleMessage(name);

    }

}

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

        Scanner tastiera = new Scanner(System.in);

        //Advanced Hello World
        String section;
        System.out.println("Inserisci la sezione che vuoi avviare: ");
        System.out.println("Sezioni: 'advanced_hello' | 'constructors'");
        section = tastiera.nextLine();

        switch (section)
        {
            case "advanced_hello":
            Helper h1 = new Helper();

            System.out.println("Enter your name here: ");
            String name = tastiera.nextLine();
            System.out.println("Enter name of first gf here: ");
            h1.setGirlName(tastiera.nextLine());
            h1.simpleMessage(name);
            break;

            case "constructors":
                Helper h2 = new Helper("Artemis");
                h2.simpleMessage("GESU'");
                break;

                default:
                    System.out.println("INVALID INPUT!");


        }


    }

}

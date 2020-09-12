package net.davoleo.java.esercizi;

import java.util.Scanner;

/*************************************************
 * Author: Davoleo
 * Date: 28/09/2018
 * Hour: 22.38
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Calculator {

    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        short id;
        double n1, n2, result;

        System.out.println("-----------------------------------------------");
        System.out.println("|            Welcome to the Calculator        |");
        System.out.println("|    -                                    +   |");
        System.out.println("|                     Index                   |");
        System.out.println("|              1: Sum                         |");
        System.out.println("|              2: Subtraction                 |");
        System.out.println("|              3: Multiplication              |");
        System.out.println("|              4: Division                    |");
        System.out.println("|                                             |");
        System.out.println("|    ÷                                    x   |");
        System.out.println("|                                             |");
        System.out.println("-----------------------------------------------");

        System.out.println("Enter an index: ");
        id = tastiera.nextShort();
        switch (id)
        {
            case 1:
                System.out.println("Insert a number: ");
                n1 = tastiera.nextDouble();
                System.out.println("Insert another number: ");
                n2 = tastiera.nextDouble();

                result = n1 + n2;
                System.out.println("The result of " + n1 + " + " + n2 + " is: " + result);
                break;

            case 2:
                System.out.println("Insert the first number: ");
                n1 = tastiera.nextDouble();
                System.out.println("Insert the second number: ");
                n2 = tastiera.nextDouble();

                result = n1 - n2;
                System.out.println("The result of " + n1 + " - " + n2 + " is: " + result);
                break;

            case 3:
                System.out.println("Insert a number: ");
                n1 = tastiera.nextDouble();
                System.out.println("Insert another number: ");
                n2 = tastiera.nextDouble();

                result = n1 * n2;
                System.out.println("The result of " + n1 + " * " + n2 + " is: " + result);
                break;

            case 4:
                System.out.println("Insert the first number: ");
                n1 = tastiera.nextDouble();
                System.out.println("Insert the second number: ");
                n2 = tastiera.nextDouble();

                if(n2 != 0)
                {
                    result = n1 / n2;
                    System.out.println("The result of " + n1 + " / " + n2 + " is: " + result);
                }
                else
                    System.out.println("Division by 0 is undefined!");
                break;

                default:
                    System.out.println("The index inserted is invalid");
                    break;
        }

    }

}

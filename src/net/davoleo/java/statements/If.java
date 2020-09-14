/*------------------------------------------------
 * Author: Davoleo
 * Date: 4/5/18
 * Hour: 22:14
 * Copyright - © - Davoleo - 2018
 *------------------------------------------------*/

package net.davoleo.java.statements;

public class If {

    public static void main(String[] args) {

        //Selective statements that allows to execute different blocks of code depending on the condition in the head of the if statement
        //you don't need braces when there's only one line of instructions in the block
        int eta = 22;
        if (eta > 18) {
            System.out.println("you're older than 18");
            System.out.println("YOU'RE FUCKING OLD!");
        } else {
            System.out.println("You're maximum 18 years old");
            System.out.println("who do you think you are, pay respect you kiddo???????????????");
        }

        //Nested if statements
        int eta2 = 66;
        if (eta2>18)
            if (eta2 < 65)
                System.out.println("You're adult but not OLD");
            else
                System.out.println("You're adult, BUT ALSO OLD");
        else
            System.out.println("you're not OLD AT ALL");

        //If statement with compund conditions
        int eta3 = 5;

        if (eta3 > 18 && eta3 < 65)
            System.out.println("You're adult but not OOOOOLLLLLLLLLLLLDDDDDDD");
        else
            System.out.println("you could be young... but you could also be OOOOOLLLLLLLLLLLLDDDDDDD");
        //Short evaluation: per le condizioni complesse, se la prima è falsa non valutà la seconda

        //Ternary operator (Conditional assignments and short if statements)
        System.out.println(eta != 98 ? "diverso da 98 :P" : "uguale a 98");


        //Nested if statements
        int age = 60;

        if(age < 50)
            System.out.println("U'RE young");
        else
        {
            System.out.println("U're old");
            if(age>75)
                System.out.println("U're very old");
            else
                System.out.println("Don't worry you're not that old");
        }

        //Else if statement
        //Alternative checks - the second if is checked only if the first condition is false

        if(age >= 60)
            System.out.println("you're a senior");
        else if (age >= 50)
            System.out.println("you're 50 years old");
        else
            System.out.println("You're pretty young");


    }
}

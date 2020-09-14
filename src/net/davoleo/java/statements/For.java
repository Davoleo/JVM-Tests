/*---------------------------------------
 * Author: Davoleo
 * Date: 10/5/18
 * Hour: 15:55
 * Copyright - © - Davoleo - 2018
 *---------------------------------------*/

package net.davoleo.java.statements;

public class For {

    public static void main(String[] args) {
        //enumerative cycle
        //Usually used when you know how many cycles you need to execute
        //The head of the for loop handles 3 things:
        // | initialization (can also be done separately, is done one single time, can be complex)
        // | condition (finishes the loop once it becomes 'false')
        // | counter increment (can be more complex than just a simple int, is executed after the body)
        //The body contains the code that is to be executed multiple times

        //Prints the first 50 integer numbers and then the sum of all of them
        int total = 0;
        for (int num = 1; num <= 50; num++) {
            System.out.println(num);
            total += num;
        }
        System.out.println(total);

        //Reverse loop from 100 to 0
        for (int num = 100; num >= 0; num--)
            System.out.println(num);

        //Some part of the head of the for loop can be missing:
        //Initialization: The counter does not exist if it's not created externally the cycle goes on forever
        //Condition: If there's no condition the cycle goes on forever
        //Counter increment: if the counter is not incremented in the body either then the cycle goes on forever

        //Sums all the numbers in the range between A and B
        int a = 36, b = 67, sum = 0;
        for (int i = a; i <= b; i++)
            sum += a;
        System.out.println(sum);

        //Sums all the numbers in the range between C and D breaking the loop at a specific number ...
        int c = 36, d = 67, sum2 = 0;
        for (int i = c; i <= d; i++) {
            if (i % 17 == 0)
                break;
            else
                sum2 += c;
        }
        System.out.println(sum2);




    }
}

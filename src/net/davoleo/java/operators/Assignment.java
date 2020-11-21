package net.davoleo.java.operators;

public class Assignment {

    /*************************************************
     * Author: Davoleo
     * Date: 4/5/18
     * Hour: 21:31
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {

        int n = 10;
        //    ^ Assignment Operator
        int totalCost = 0;

        //Adds 1 to totalCost (can also be written as "++") and assigns it to itself
        totalCost += 1;
        //Subtracts 1000 from totalCost and assigns it to itself
        totalCost -= 1000;
        //Multiplies totalCost by 5 and assigns it to itself
        totalCost *= 5;
        //Divides totalCost by 3 and assigns it to itself
        totalCost /= 3;
        System.out.println(totalCost);
        System.out.println(n %= 7);

        //  &=     ^=      <<=     >>=     >>>=            bit-wise assignment operations
    }
}

/*--------------------------------------------
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 15.56
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 *--------------------------------------------*/

package net.davoleo.java.statements;

public class ForEach {

    public static void main(String[] args) {
        //For Each (used to work with array and lists)
        int[] ages = {21, 16, 86, 21, 3};
        int ageSum = 0;

        //For each number in the ages array
        //Numbers are temporarily stored in the age variable
        for (int age : ages)
            ageSum += age;
        //  ^^^ Adding age to the sum of Ages every time the loop si executed

        System.out.println("The sum of all ages is: " + ageSum);
    }
}

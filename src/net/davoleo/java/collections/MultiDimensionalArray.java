/*---------------------------------------
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 16.39
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 *---------------------------------------*/

package net.davoleo.java.collections;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //An Array of arrays
        //First Array contains 3 int arrays that contain some int numbers
        int[][] firstArray = {{8, 9, 10, 11}, {12, 13, 14, 15}, {4, 5, 6, 7}};
        int[][] secondArray = {{30, 31, 32, 33}, {43}, {4, 5, 6}};

        System.out.println("First array:");
        display(firstArray);

        System.out.println();

        System.out.println("Second array:");
        display(secondArray);
    }

    private static void display(int[][] x) {
        //Nested For Loop to loop over Multidimensional arrays
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}

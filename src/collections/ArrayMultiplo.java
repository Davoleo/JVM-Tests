package collections;

/*************************************************
 * Author: Davoleo
 * Date: 26/10/2018
 * Hour: 16.39
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class ArrayMultiplo {
    public static void main(String[] args)
    {
                        //Riga 0             1               2
        int primoArray[][] = {{8,9,10,11}, {12,13,14,15}, {4,5,6,7}};
        int secondoArray[][] = {{30, 31, 32, 33}, {43}, {4,5,6}};

        System.out.println("Primo array:");
        display(primoArray);

        System.out.println();

        System.out.println("Secondo array:");
        display(secondoArray);
    }

    private static void display(int x[][])
    {
        for(int row=0; row<x.length; row++)
        {
            for (int column = 0; column < x[row].length; column++)
            {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}

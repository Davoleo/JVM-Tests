/*-------------------------------------
 * Author: Davoleo
 * Date: 14/6/18
 * Hour: 01:00
 * Copyright - © - Davoleo - 2018
 *-------------------------------------*/

package net.davoleo.java.collections;

public class Array {

    public static void main(String[] args) {
        //It's not a primitive type (like String)
        //it's like an immutable indexed list of cells that can contain data
        //one-dimensional arrays are also called "vectors"
        //If you try to access either a negative or an index >= to the length of the array an
        //ArrayOutOfBoundsException is thrown
        //Arrays are 0 indexed which means that the index of the first element is 0
        //and the index of the last element is = to the length of the array - 1

        double total = 0;
        //Creates a new array with 30 empty spaces
        double[] dailyProfit = new double[30];

        //Looping over the length of the array
        for (int day = 0; day < dailyProfit.length; day++) {
            System.out.print("Writing Day " + day + "profit : ");
            dailyProfit[day] = Math.random() * 10000;
            System.out.println(dailyProfit[day]);
            total += dailyProfit[day];
        }

        double averageProfit = total / 30;
        System.out.println("\nAverage Daily Profit: " + averageProfit);

        for (int day = 0; day < dailyProfit.length; day++) {
            if (dailyProfit[day] < averageProfit) {
                System.out.println("Il day " + (day + 1) + " del mese l'incasso " + "(" + dailyProfit[day] + ") risulta " + "inferiore alla media");
            }
        }

        //Literal Array Initialization (creates an array of the needed length while also populating it with data)
        String[] giorniSettimana = {"Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato", "Domenica"};

        int[] array = {3, 4, 5, 6, 7, 8};
        add5(array);

        for (int y : array)
            System.out.println(y);
    }

    private static void add5(int[] x) {
        for (int i = 0; i < x.length; i++)
            x[i] += 5;
    }

}

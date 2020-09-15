/*------------------------------------------
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 23.24
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 *------------------------------------------*/

package net.davoleo.java.practice;

public class Profit {

    public static void main(String[] args) {
        double sum;
        double deposit = 10000;
        double ratio = .01;

        for (int day = 1; day <= 20; day++) {
            sum = deposit * Math.pow(1 + ratio, day);
            System.out.println(day + "   " + sum);
        }
    }
}

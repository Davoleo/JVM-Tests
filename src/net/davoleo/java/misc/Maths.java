/*------------------------------------
 * Author: Davoleo
 * Date: 19/10/2018
 * Hour: 23.35
 * Project: JavaBase
 *------------------------------------*/

package net.davoleo.java.misc;

public class Maths {
    public static void main(String[] args) {
        //Returns the Absolute Value
        System.out.println(Math.abs(-23.7));

        //Respectively return the nearest "integer" value above and below
        System.out.println(Math.ceil(7.3));
        System.out.println(Math.floor(7.9));

        //Returns the greater number of the two params
        System.out.println(Math.max(5.6, 8.5));

        //Returns the lesser number of the two params
        System.out.println(Math.min(5.6, 8.5));

        //Powers a number
        //First Param: base
        //Second param: exponent
        System.out.println(Math.pow(5, 3));

        //Returns the square root of the param
        System.out.println(Math.sqrt(16));

        //Rounds the parameter
        System.out.println(Math.round(4.7));

        //Returns a random floating point value between 0 and 1
        System.out.println(Math.random());
    }

}

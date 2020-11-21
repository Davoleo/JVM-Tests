package net.davoleo.java.operators;

public class Unary {

    /*************************************************
     * Author: Davoleo
     * Date: 1/5/18
     * Hour: 11:00
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {
        //Unary operators act on a single operand

        // - negation | (when not used as a subtraction)
        // ++ Increments the value of the variable by one (can be prefixed or postfixed)
        // -- Decreases the value of thye variable by one (can be prefixed or postfixed)
        // ! Logic Operator NOT
        // ~ Bitwise negation

        int a = 5;
        int b = -a;
        //a = -(b+2 - a);
        /* System.out.println(a++);
           System.out.println(a);    */
        System.out.println(++a);
        System.out.println(a);
        /*System.out.println(b--);
        System.out.println (b); */
        System.out.println(--b);
        System.out.println(b);

        //See operators.Assignment class
        int c = 8;
        c += 8;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 5;
        System.out.println(c);


        //#ASCIICode
        char ch = 'U';
        System.out.println(--ch);

        int age = 17;
        boolean notUnderage = !(age < 18);
        System.out.println(notUnderage);

        //"10001" ---> "01110"
        int bitWiseNegatedAge = ~age;
        System.out.println(bitWiseNegatedAge);

        //boolean n = false;
        //System.out.println(!n);

    }
}

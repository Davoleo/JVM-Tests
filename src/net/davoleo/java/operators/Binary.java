package net.davoleo.java.operators;

public class Binary {

    /*************************************************
     * Author: Davoleo
     * Date: 2/5/18
     * Hour: 18:50
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {
        //Binary operators make operations on 2 operands they are written between the 2 operands

        //Sum - Subtraction - Multiplication - Division
        int i1, i2, i3, i4 = 0;
        double d1;
        String s1, s2;

        i1 = 5 + 3;
        i2 = 6 + i1;
        i3 = i1 + i2;

        i1 = 3 + 6 + 8 + 10;
        i2 = (12 + 6) * 2 * (i3 - (i4 / 5));

        i1 = 1000 * 1000 * 1000 * 1000;

        System.out.println(i1);

        s1 = "Hello";
        s2 = " Mannarof";

        char c1 = 'A', c2 = 'c', c3 = ' ';
        c3 = (char) (c1 + c2); //Cast - Forcing the IDE to take a type as another one more specific
        System.out.println(c3);

        //INT numeric limit overflow
        int bigBoiSubtraction = -1000 * 1000 * 1000 * 1000;

        char c4 = 'z' - 'A';
        System.out.println(c4);
        char c5 = 'z' * 'A';
        System.out.println(c5);
        int div1 = 5 / 3;   // will output an int result
        System.out.println(div1);
        d1 = 40.0 / 15f;    // will output a floating point result as at least one of the two parameters is a floating point value
        System.out.println(d1);

        //Remainder
        int remainder = 11 % 3;
        System.out.println(remainder);

        char c6 = 'a' / (char) 3;
        System.out.println("#" + c6 + "#");


        d1 = 100 + 34.81;   //Promotion to double (no data loss -> Implicit conversion)
        //i1 = 100 + 34.81;   //Promotion to int (data loss -> Conversion MUST be an explicit cast otherwise the compiler throws an error)
        //Compile-Time error ^

        String hello = "hell" + 'o' + '!';
        System.out.println(hello);

        String things = "hello" + true;
        System.out.println(things);

    }
}

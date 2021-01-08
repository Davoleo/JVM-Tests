package net.davoleo.java;
//import java.lang.*;

import net.davoleo.java.model.Chest;
import net.davoleo.java.oop.interfaces.ClassHeader;

import java.util.ArrayList;
import java.util.List;

@ClassHeader(
        author = "Davoleo",
        date = "24/4/2018",
        currentRevision = 2,
        lastModified = "10/08/2020",
        lastModifiedBy = "Davoleo",
        reviewers = {"Davoleo"})
public class TestClass {

    /*************************************************
     * Author: Davoleo
     * Date: 24/4/18
     * Hour: ##:##
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args){

        //class: System class that containes the object: "out" That contains the methods print and println
        System.out.println(5 + 3);
        System.out.println("hello za warudo");
        System.out.println("PI Value " + 3.14);
        System.out.println(3 * 5);
        System.out.println(3.0 / 5); //<-- Type CAST

        //Primitive Types

        //byte -128 +127  [8 bits, 1 byte]
        byte b1 = 23;

        //short [16 bits, 2 bytes]
        short minValue = -32768;
        short maxValue = 32767;

        //int  [32 bits, 4 bytes]
        int maxValueInt = 2147483647;
        int minValueInt = -2147483648;

        //long  [32 bits, 4 bytes]
        long maxValueLong = 9223372036854775807L;
        long minValueLong = -9223372036854775808L;

        //float [32 bits, 4 bytes] floating point single precision
        float f1 = 3.12345678F;

        System.out.println(Float.MAX_VALUE);
        //Float Class

        //Double: 8 bytes, (64 bits) floating point double precision
        double d1 = 3.12345678;

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE); //the nearest to 0

        System.out.println(d1 + " --- " + f1);

        //char
        char c1 = 'a';
        char c2 = '.';
        char c3 = '#';
        char c4 = 35;      //memorizes the ASCII code of a character (in this case it's #)
        System.out.println(c4);
        int i = 100 + 'a'; //sums the ASCII code of A to 100
        System.out.println(i);

        //boolean
        boolean trueFalse = 5 > 3;
        System.out.println(trueFalse);

        boolean check;

        //String [not a primitive type] (Takes more ram than char)
        String snme = "Parrotta";
        check = snme.endsWith("tta");
        System.out.println(check);

        int variabile = 0;
        //  type                 identifier         assigned to         value


        int esa = 0xA2;     //exadecimal number initialized by 0x
        int ott = 0712;     //octal number

        //Test to see if changes done to objects in a list propagate
        List<Chest> chestList = new ArrayList<>();
        chestList.add(new Chest(567));
        chestList.add(new Chest(333));

        for (Chest chest : chestList) {
            System.out.println("Chest Value: " + chest.getValue());
        }

        chestList.get(1).setValue(111);

        for (Chest chest : chestList) {
            System.out.println("Chest Value: " + chest.getValue());
        }
    }

    //Reverses a DD-MM-YYYY date | (oh wow this method is really sad, I'm only actually realizing now)
    private static String reverseDate(String date) {
        int dd = Integer.parseInt(date.substring(0, 2));
        int mm = Integer.parseInt(date.substring(3, 5));
        int yyyy = Integer.parseInt(date.substring(6, 10));

        return yyyy + "-" + mm + "-" + dd;
    }
}
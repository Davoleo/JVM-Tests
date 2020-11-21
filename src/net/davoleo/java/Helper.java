package net.davoleo.java;

/*************************************************
 * Author: Davoleo
 * Date: 11/10/2018
 * Hour: 00.01
 * Project: JavaBase
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Helper {

    //InternalStateVariables
    private String word;

    public Helper() {
    }

    public Helper(String name) {
        word = name;
    }

    public void simpleMessage(String name) {
        System.out.println("Hello " + name);
        System.out.printf("Just shut up davoleo %s \n", this.getWord());
    }


    //Getter and Setter example
    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    //Returns the average of a bunch of numbers
    public static int average(int... numbers) {
        int total = 0;
        for (int x : numbers)
            total += x;

        return total / numbers.length;
    }
}

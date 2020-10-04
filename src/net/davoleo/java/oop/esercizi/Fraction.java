package net.davoleo.java.oop.esercizi;

/*************************************************
 * Author: Davoleo
 * Date: 23/06/2018
 * Hour: 16.35
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Fraction {

    private final int numerator;
    private final int denominator;

    //Constructors
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else {
            this.denominator = 1;
            System.out.println("The Denominator of your fraction has been changed to 1 to avoid a Division by Zero Exception");
        }
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(String iFraction) {
        //split is a method of the String class that divides a string in an array of multiple strings depending on the passed char/string
        //parseInt: converts other types into ints

        numerator = Integer.parseInt(iFraction.split("/")[0]);
        denominator = Integer.parseInt(iFraction.split("/")[1]);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getResult() {
        return numerator / denominator;
    }

    public Fraction sum(Fraction otherFraction) {
        return new Fraction(numerator * otherFraction.denominator + denominator * otherFraction.numerator,
                denominator * otherFraction.denominator);
        //mcm using product at the denominator
    }
}

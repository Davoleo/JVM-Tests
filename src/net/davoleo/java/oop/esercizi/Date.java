package net.davoleo.java.oop.esercizi;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 30/11/2018 / 16:39
 * Class: Date
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;

        System.out.printf("The object of " + Date.class + " can be converted to this string: %s\n", this);
    }

    @Override
    public String toString()
    {
        return String.format("%d-%d-%d", day, month, year);
    }
}

package net.davoleo.java.practice.oop;

/*************************************************
 * Author: Davoleo
 * Date: 16/6/18
 * Hour: 23:00
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

@SuppressWarnings("WeakerAccess")
public class Time {

    private final int hh;
    private final int mm;
    private final int ss;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hh) {
        this(hh, 0, 0);
    }

    public Time(int hh, int mm) {
        this(hh, mm, 0);
    }

    public Time(int hh, int mm, int ss)
    {
        this.hh = (hh >= 0 && hh < 24 ? hh : 0);
        this.mm = (mm >= 0 && mm < 60 ? mm : 0);
        this.ss = (ss >= 0 && ss < 60 ? ss : 0);
    }

    public String displayMilitary()
    {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    public String displayClassic()
    {
        return String.format("%d:%02d:%02d %s", ((hh==0 || hh==12) ? 12 : hh%12), mm, ss, (hh>=12 ? "PM" : "AM"));
    }

}

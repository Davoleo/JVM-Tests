package net.davoleo.java.model;

public class Time {

    private int hh;
    private int mm;
    private int ss;

    public void setTime(int hh, int mm, int ss)
    {
        this.hh = ((hh >= 0 && hh < 24) ? hh : 0);
        this.mm = ((mm >= 0 && mm < 60) ? mm : 0);
        this.ss = ((ss >= 0 && ss < 60) ? ss : 0);
    }

    public String toMilitary()
    {
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }

    public String toString()
    {
        return String.format("%d:%02d:%02d %s", ((hh==0 || hh==12) ? 12 : hh%12), mm, ss, (hh>=12 ? "PM" : "AM"));
    }

}

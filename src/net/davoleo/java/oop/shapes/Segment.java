package net.davoleo.java.oop.shapes;

/*************************************************
 * Author: Davoleo
 * Date: 23/06/2018
 * Hour: 22.35
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Segment {

    private final Point point1;
    private final Point point2;

    //Segment having 2 points
    public Segment(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    //Segment from the axist origin to a point
    public Segment(int x2, int y2) {
        this(0, 0, x2, y2);
    }

    //Segment that degenerates into a point
    public Segment() {
        this(0, 0, 0, 0);
    }

    public double length() {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
    }
}

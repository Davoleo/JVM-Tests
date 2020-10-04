package net.davoleo.java.oop.shapes;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 17.45
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Circle extends Shape {
    private int centerX, centerY;
    private int radius;

    public Circle(int x, int y, int r) {
        centerX = x;
        centerY = y;

        radius = Math.abs(r);
    }

    public Point getCenter() {
        return new Point(centerX, centerY);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

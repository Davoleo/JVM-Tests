package net.davoleo.java.oop.shapes;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 15.31
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Rectangle extends Shape {

    /**
     * Java visibility modifiers:
     * <p>
     * public (free access, everywhere)
     * private (no access unless in the same class)
     * package-private AKA default (free access from the classes in the same package)
     * protected (free access from the classes in the same package)
     * <p>
     * Table: https://imgur.com/a/HN53hSw
     */
    private final Point topLeft;
    private final int height;
    final int width;

    public Rectangle(int topLeftX, int topLeftY, int w, int h) {
        topLeft = new Point(topLeftX, topLeftY);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int bottomRightX, int bottomRightY) {
        this(p.getX(), p.getY(), bottomRightX - p.getX(), bottomRightY - p.getY());
    }

    public Rectangle() {
        this(0, 1, 2, 1);
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    //Classes that have the final keyword can't be extended
    //Final method can't be overridden
    //Final variables become constant and can't be modified after the declaration
    final double MY_CONSTANT = Math.PI * 33;

    final public double area() {
        return width * height;
    }

    public Point getTopLeft() {
        return topLeft;
    }
}

package net.davoleo.java.oop.shapes;

/*************************************************
 * Author: Davoleo
 * Date: 17/6/18
 * Hour: 16:00
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Point extends Shape {

    //x y Coordinates that correspond to a point
    //Internal State        //They describe the internal structure of an object
    private int x;        //private protects variable so they can't be edited outside of the class
    private int y;
    private static int count = 0;       //It's not part of instances of the class it's global and part of the class itself

    //Constructors
    //To initialize fundamental variables without which the object existence wouldn't make sense
    //There can be multiple constructors but each one has to have a different signature
    //If there is no constructor when you instantiate a class a default constructor is called that takes no params and doesn't do anything
    public Point(int x, int y) {
        //Checks and statements before the point is created
        this.x = x;
        this.y = y;
        count++;
    }

    //Point on the X axis
    public Point(int x) {
        this(x, 0);
        //^ Calls the other constructor
    }

    public Point() {
        this(0, 0);
    }

    //Methods
    //getter: To read private variables
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setter    To write to private variables
    public void setX(int x) {
        //"this." clears the ambiguous statement x = x
        //this.x = x in the internal state of the object
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getCount() {
        return count;
    }

    public void offset(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point point1, Point point2) {
        int x1 = point1.x;
        int x2 = point2.x;
        int y1 = point1.y;
        int y2 = point2.y;

        return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
    }

    @Override
    public double perimeter() {
        return 0;
    }

    public int getQuarter() {
        if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else
                                if(x>0 && y<0)
                                    return 4;
                                        else return 99;

    }

}
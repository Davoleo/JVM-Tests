package net.davoleo.java.oop;

import net.davoleo.java.oop.enums.EnumOW;
import net.davoleo.java.oop.enums.Hero;
import net.davoleo.java.oop.esercizi.Fraction;
import net.davoleo.java.oop.interfacce.FunctionalInterfaces;
import net.davoleo.java.oop.shapes.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*************************************************
 * Author: Davoleo
 * Date: 16/6/18
 * Hour: 23:00
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class MainOOP {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------------------------
        //POINTS

        //Declaring an object
        //Yyou can only declare objects as references to objects
        Point p1;
        p1 = new Point(10, 10);   //Constructor method to initialize the object

        //p1.x = 123;      You can't edit internal variables directly
        //p1.y = -67;

        p1.setX(900);
        p1.setY(1000);
        System.out.println("x: " + p1.getX() + " | y: " + p1.getY());

        Point p2;
        p2 = new Point(23, -10);
        System.out.println(p2);

        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------
        //FRACTIONS

        System.out.println("The point is in the: " + p1.getQuarter() + " quarter.");

        Fraction f1, f2, f3, f4;

        f1 = new Fraction(1, 7);
        System.out.println("f1 is: " + f1);

        f2 = new Fraction(7);
        System.out.println("f2 is: " + f2);
        System.out.println("f2's Numerator is: " + f2.getNumerator());
        System.out.println("f2's Denominator is: " + f2.getDenominator());

        f3 = new Fraction("23/53");
        System.out.println("f3 is: " + f3);
        System.out.println("f3 results: " + f3.getResult());

        f4 = new Fraction("1/2");
        Fraction fsomma = f4.sum(new Fraction("1/3"));
        System.out.println("The sum of 1/2 and 1/3 is: " + fsomma);

        System.out.println("-------------------------------------------------------------------");
        //--------------------------------------------------------------------------------------------------------------------
        //Static members
        //They're not linked to a specific object
        //They're shared between all objects of the class

        Random r = new Random();

        //it generates a random number between 1 and 9 - 10000 times and every time the number is equals to 5 it creates a point
        for (int i = 0; i < 10000; i++)
            if (r.nextInt(10) == 5)
                new Point();

        System.out.println(Point.getCount() + " points were created.");
        //getCount is a STATIC method

        //Many utility classes contain Static methods like the Math class
        double circleArea = Math.PI * Math.pow(27.2, 2);
        System.out.println("The area of the circle is " + circleArea);

        Point pA = new Point(0, 2);
        Point pB = new Point(3, 7);
        System.out.println("Distance between pA and pB: " + Point.distance(pA, pB));


        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------------------------------------
        //Segments - Compound classes

        Segment segment = new Segment(12, 1, 2, 13);

        System.out.println("Length of the segment: " + segment.length());

        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------------------------------------
        //Rectangles - Compound classes

        Rectangle rectangle = new Rectangle(100, 50, 30, 10);
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle's Area: " + rectangle.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Squares - Inheritance

        Square square = new Square(1, 1, 3);
        System.out.println("Length of the perimeter of the square: " + square.perimeter());
        System.out.println("Area of the square: " + square.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Cerchi
        Circle circle = new Circle(0, 0, 5);
        System.out.println("Circle's Perimeter: " + circle.perimeter());
        System.out.println("Circles's Area: " + circle.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Polymorphism
        //Shape objects can contain information of the children classes
        //This compatibility is called Polymorphism
        Shape f = new Square(10, 40, 100);
        f.perimeter();

        Shape[] canvas = new Shape[1000];

        canvas[0] = new Square(30, 30, 40);
        canvas[1] = new Square(30, 10, 50);
        canvas[2] = new Circle(100, 100, 70);
        canvas[3] = new Rectangle(15, 10, 150, 80);
        canvas[4] = new Square(30, 100, 80);

        int shapesCount = 5;
        double totalLength = 0;

        canvas[0].perimeter();

        for (int i = 0; i < shapesCount; i++)
            totalLength += canvas[i].perimeter();

        System.out.println(totalLength);

        //late binding / dynamic binding
        //in contrast to
        //early binding / static binding
        //late binding is when the program at runtime chooses which perimeter method to call depending on the object type

        System.out.println("---------------------------------------------------------------------\n");
        //-----------------------------------------------------------------------------------------------------------------
        //Exceptions
        int numberOfItems = 0;
        int[] vector = {3, 8, -78, 19, 56, 0, 41, 88, 12, 13, 14, 90};

        try {
            System.out.println("Average: " + intermediateMethod(vector, numberOfItems));
        } catch (IllegalArgumentException exception) {
            System.out.println("Illegal Argument ;)");
        }
        //----

        try
        {
            PrintWriter backup = new PrintWriter("z:\\IDoNotExist.txt");
        }
        catch(FileNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("The backup file can't be created");
        }
        finally
        {
            System.out.println("Whether the exception is thrown or not this method is always called");
        }

        System.out.println("---------------------------------------------------------------------\n");

        EnumOW.printHeroesWithPredicate(hero -> hero.realName().contains("Genji"));
        System.out.println();

        FunctionalInterfaces.processPersons(
                Arrays.asList(EnumOW.values()),
                hero -> hero.age() <= 25,
                hero -> System.out.println(hero.toString()));

        EnumOW[] enumArray = EnumOW.values();
        List<Hero> heroRoster = new ArrayList<>();
        for (EnumOW enumOW : enumArray) {
            heroRoster.add(enumOW.getHero());
        }
        /*
         * Method Reference:
         * Kind	Example
         * Reference to a static method	ContainingClass::staticMethodName
         * Reference to an instance method of a particular object	containingObject::instanceMethodName
         * Reference to an instance method of an arbitrary object of a particular type	ContainingType::methodName
         * Reference to a constructor	ClassName::new
         */
        heroRoster.sort(Hero::compareByName);
    }

    /**
     * @deprecated Explanation why this method is deprecated
     */
    @Deprecated
    private static int intermediateMethod(int[] vector, int numberOfItems) {
        try {
            return average(vector, numberOfItems);
        } catch (ArithmeticException e) {
            return -1111111111;
        }
    }

    /**
     * Exception are grouped in:
     * Checked: Can't be ignored
     * Unchecked: Can be ignored
     * <p>
     * Unchecked exceptions are grouped in:
     * Errors: Generated by something that is external from the program (ex: disk/internet connection)
     * Runtime Exceptions: Generated by something in the program (ex: logic errors / Divisions by 0)
     * <p>
     * Checked exceptions are known and have to be handled so that the program does not crash brutally
     * Checked exceptions can be thrown again at the method called in an explicit way
     **/
    private static int average(int[] vector, int numberOfItems) {
        int sum = 0;
        for (int i = 0; i < numberOfItems; i++)
            sum += vector[i];

        if (numberOfItems != 0)
            return sum / numberOfItems;
        else
            throw new ArithmeticException();
        //An exception is thrown
        //that can be handled by a try catch statement
        //If the exception is not handled the program crashes and java raises this error: Uncaught Exception
    }
}

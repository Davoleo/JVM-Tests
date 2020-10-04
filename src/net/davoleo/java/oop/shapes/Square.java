package net.davoleo.java.oop.shapes;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 16.03
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

//Inheritance allows to specialize a class to a more specific use
//For example the class that could draw a rectangle is specialized to draw a square
//Extending the rectangle, the square class inherits all public and protected variables and methods of the superclass
public class Square extends Rectangle {

    public Square(int x1, int x2, int size) {
        //super calls the the constructor of the super class that takes 4 int numbers
        //super has to be the first instruction of the constructor when you use it
        super(x1, x2, size, size);
    }

    //When perimeter() is called on a Square object it first looks for the method in the  Square class, if it's overridden it calls that
    //Otherwise it calls the permiter() method of the super class
    //by overriding you overwrite the behaviour of the method perimeter() in the Rectangle class
    //When you override a method you usually annotate it with @Override so in case the signature of the method changes you are warned that the overridden
    //method is not overriding the super class anymore
    @Override
    public double perimeter() {
        return 4 * width;
    }
}

package net.davoleo.java.oop.shapes;

import java.awt.*;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 17.28
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

@SuppressWarnings("WeakerAccess")

//You can't instantiate abstract classes
//Although you can use them to create subclasses and through polymorphic objects
//They're usually used in cases when modeling an abstract object that can't really exist in a concrete way
public abstract class Shape {

    //Collection of default constants
    enum LineThickness {
        THIN,
        MEDIUM,
        REGULAR,
        THICK
    }

    Color penna = Color.black;
    LineThickness spessore = LineThickness.REGULAR;

    //Abstract method don't contain a body just a signature and they have to be overridden in subclasses
    //Abstract methods can be created only in abstract classes
    //There can be an abstract class that doesn't contain abstract methods
    public abstract double perimeter();

    public Shape() {
        //Initialization statements
        //...
    }

    public Shape(Color c, LineThickness tratto) {
        this();
        penna = c;
        spessore = tratto;
    }
}
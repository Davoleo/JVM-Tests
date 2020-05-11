/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 10/12/2019 / 19:59
 * Class: Hero
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2019
 * ----------------------------------- */

package oop.enumerazioni;

public class Hero {

    private final String name;
    private final int age;
    private final Sex sex;
    private final String location;

    public Hero(String name, int age, Sex sex, String location)
    {        this.name = name;
        this.age = age;
        this.location = location;
        this.sex = sex;
    }

    public String realName()
    {
        return name;
    }

    public int age()
    {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String localize()
    {
        return "This hero's location is equals to: " + location;
    }

    public static int compareByName(Hero a, Hero b) {
        return a.name.compareTo(b.name);
    }

    @Override
    public String toString() {
        return "Real Name: " + name + "\nAge: " + age + "\nSex: " + sex.name() + "\nLocation: " + location;
    }

    enum Sex {
        MALE,
        FEMALE,
        UNDEFINED
    }



}

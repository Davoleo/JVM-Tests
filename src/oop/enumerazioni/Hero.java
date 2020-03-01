/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 10/12/2019 / 19:59
 * Class: Hero
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2019
 * ----------------------------------- */

package oop.enumerazioni;

import java.time.LocalDate;

public class Hero {

    private final String name;
    private final int age;
    private final Sex sex;
    private final String location;
    private final LocalDate birthday;

    public Hero(String name, int age, Sex sex, String location, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.sex = sex;
        this.birthday = birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public String localize()
    {
        return "This hero's location is equals to: " + location;
    }

    public static int compareByAge(Hero a, Hero b) {
        return a.birthday.compareTo(b.birthday);
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

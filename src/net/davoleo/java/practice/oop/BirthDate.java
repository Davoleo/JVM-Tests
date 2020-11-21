package net.davoleo.java.practice.oop;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 30/11/2018 / 17:03
 * Class: BirthDate
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class BirthDate {

    private final String name;
    private final Date birthDate;

    BirthDate(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("My name is: %s, I was born on %s", name, birthDate);
    }
}

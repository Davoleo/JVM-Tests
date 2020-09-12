/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 19/07/2020 / 14:01
 * Class: Person
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package net.davoleo.java.model;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birthday;
    private final Sex gender;
    private final String email;

    public Person(String name, LocalDate birthday, Sex gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    public enum Sex {
        FEMALE,
        MALE
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Birthday: " + birthday.toString() + "\n" +
                "Sex: " + gender.name() + "\n" +
                "e-mail address: " + email + "\n";
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}

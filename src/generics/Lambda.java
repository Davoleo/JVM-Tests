/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 19/07/2020 / 14:01
 * Class: Lambda
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package generics;

import model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Flavia", LocalDate.of(1990, 3, 11), Person.Sex.FEMALE, "in@idrisus.ca"),
                new Person("Doris", LocalDate.of(1980, 11, 1), Person.Sex.FEMALE, "at.magnis.dis@tellus.org"),
                new Person("Xavier", LocalDate.of(1985, 5, 8), Person.Sex.FEMALE, "ullamcorper@duissit.co.uk"),
                new Person("Alfreda", LocalDate.of(1986, 4, 14), Person.Sex.FEMALE, "tellus@pedesuspendissedui.edu"),
                new Person("Rashad", LocalDate.of(1989, 4, 17), Person.Sex.FEMALE, "dignissim.lacus@enimconsequat.com"),
                new Person("Neville", LocalDate.of(1998, 3, 11), Person.Sex.FEMALE, "orci.tincidunt@loremac.net"),
                new Person("Connor", LocalDate.of(1978, 11, 6), Person.Sex.FEMALE, "rutrum.justo@ultrices.org"),
                new Person("Charity", LocalDate.of(1997, 10, 7), Person.Sex.FEMALE, "at.risus@cursusNuncmauris.org"),
                new Person("Dylan", LocalDate.of(1995, 5, 23), Person.Sex.FEMALE, "nullam.lobortis@dignissim.co.uk"),
                new Person("Chava", LocalDate.of(1962, 7, 6), Person.Sex.FEMALE, "nulla@nuncacmattis.ca"),
                new Person("Merrill", LocalDate.of(1993, 5, 8), Person.Sex.FEMALE, "mi@faucibuslectus.com"),
                new Person("Keelie", LocalDate.of(1985, 5, 3), Person.Sex.FEMALE, "arcu@pretium.co.uk")
        );

        printPeopleOlderThan(people, 14);
        System.out.println("------------------------------------------------------------");
        printPeopleWithinAgeRange(people, 10, 20);
        System.out.println("------------------------------------------------------------");
        printPeopleWithPredicate(people,
                person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25);
        System.out.println("------------------------------------------------------------");
        processPeople(people,
                person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25,
                Person::print
        );
        System.out.println("------------------------------------------------------------");
        processPeopleWithFunction(people,
                person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25,
                Person::getEmail,
                System.out::println);
        System.out.println("------------------------------------------------------------");

        //Aggregate operations to do the same thing
        people.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE && person.getAge() >= 18 && person.getAge() <= 25)
                .map(Person::getEmail)
                .forEach(System.out::println);

        people.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
    }

    private static void printPeopleOlderThan(List<Person> people, int age) {
        for (Person person : people) {
            if (person.getAge() >= age) {
                person.print();
            }
        }
    }

    private static void printPeopleWithinAgeRange(List<Person> people, int low, int high) {
        for (Person person : people) {
            if (low <= person.getAge() && person.getAge() <= high) {
                person.print();
            }
        }
    }

    private static void printPeopleWithPredicate(List<Person> people, Predicate<Person> test) {
        for (Person person : people) {
            if (test.test(person)) {
                person.print();
            }
        }
    }

    private static void processPeople(List<Person> people, Predicate<Person> test, Consumer<Person> consumer) {
        for (Person person : people) {
            if (test.test(person)) {
                consumer.accept(person);
            }
        }
    }

    //Function to take the people members and perform some operations in the consumer
    private static void processPeopleWithFunction(List<Person> people, Predicate<Person> test,
                                                  Function<Person, String> mapper, Consumer<String> consumer) {
        for (Person person : people) {
            if (test.test(person)) {
                String data = mapper.apply(person);
                consumer.accept(data);
            }
        }
    }

    //Generic Data approach
    private static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper, Consumer<Y> consumer) {
        for (X elem : source) {
            if (tester.test(elem)) {
                Y data = mapper.apply(elem);
                consumer.accept(data);
            }
        }
    }
}

/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 19/02/2020 / 22:06
 * Class: FunctionalInterfaces
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package net.davoleo.java.oop.interfaces;

import net.davoleo.java.oop.enums.EnumOW;
import net.davoleo.java.oop.enums.Hero;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    //Example Predicate (They allow you to execute a custom function that returns a boolean value to test something)
    //Here I'm using a lambda expression to tell it should check if the passed string contains the String "Davoleo"
    Predicate<String> examplePredicate = s -> s.contains("Davoleo");

    public static void processPersons(List<EnumOW> roster, Predicate<Hero> tester, Consumer<Hero> block) {
        for (EnumOW hero : roster) {
            if (tester.test(hero.getHero())) {
                block.accept(hero.getHero());
            }
        }
    }
}

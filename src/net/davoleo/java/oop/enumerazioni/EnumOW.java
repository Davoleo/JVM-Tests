package net.davoleo.java.oop.enumerazioni;

import net.davoleo.java.oop.esercizi.Frazione;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 30/11/2018 / 18:01
 * Enum: EnumOW
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public enum EnumOW {

    //Tanks
    DVA(new Hero("Hana Song", 19, Hero.Sex.FEMALE, "Busan, South Korea")),
    Orisa(new Hero("Orisa", new Frazione(1, 12).getResult(), Hero.Sex.FEMALE, "Numbani")),
    Reinhardt(new Hero("Reinhardt Wilhelm", 61, Hero.Sex.MALE, "Stuttgart, Germany")),
    Roadhog(new Hero("Mako Rutledge", 48, Hero.Sex.MALE, "Junkertown, Australia")),
    Winston(new Hero("Winston", 29, Hero.Sex.MALE, "Horizon Lunar Colony")),
    Wrecking_Ball(new Hero("Hammond", 14, Hero.Sex.MALE, "Horizon Lunar Colony/Junkertown")),
    Zarya(new Hero("Aleksandra Zaryanova", 28, Hero.Sex.FEMALE, "Krasnoyarsk Front, Russia")),

    //Damage (DPS)
    Ashe(new Hero("Elizabeth Caledonia", 39, Hero.Sex.FEMALE, "Deadlock Gorge, Arizona, USA")),
    Bastion(new Hero("SST Laboratories Siege Automaton E54", 30, Hero.Sex.UNDEFINED, "Unknown")),
    Doomfist(new Hero("Akande Ogundimu", 45, Hero.Sex.MALE, "Oyo, Nigeria")),
    Genji(new Hero("Genji Shimada", 35, Hero.Sex.MALE, "Shambali Monastery, Nepal")),
    Hanzo(new Hero("Hanzo Shimada", 38, Hero.Sex.MALE, "Hanamura, Japan (formerly)")),
    Junkrat(new Hero("Jamison Fawkes", 25, Hero.Sex.MALE, "Junkertown, Australia (formerly)")),
    Mccree(new Hero("Jesse McCree", 37, Hero.Sex.MALE, "Santa Fe, New Mexico, USA"));

    private Hero hero;

    // TODO: 10/12/2019 Optimize this enum
    EnumOW(Hero hero) {
        this.hero = hero;
    }

    public Hero getHero() {
        return hero;
    }

    public List<Hero> getAllHeroes() {
        List<Hero> heroes = new ArrayList<>();
        for (EnumOW value : values()) {
             heroes.add(value.hero);
        }
        return heroes;
    }

    //Example Use for Predicates (They allow you to execute a custom function that returns a boolean value to test something)
    public static void printHeroesWithPredicate(Predicate<Hero> tester) {
        for(EnumOW value : values()) {
            Hero hero = value.hero;
            if (tester.test(hero)) {
                System.out.println(hero.toString());
            }
        }
    }
}

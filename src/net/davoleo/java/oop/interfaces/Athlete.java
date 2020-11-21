package net.davoleo.java.oop.interfaces;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 21.10
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Athlete implements Sortable<Athlete> {
    int id;
    int age;
    int performance; //in seconds
    final static double AGE_INFLUENCE = 0.4;

    Athlete(int id, int age, int performance) {
        this.id = id;
        this.age = age;
        this.performance = performance;
    }

    @Override
    public boolean lessThan(Athlete otherAthlete) {
        double performaceIndex = performance - AGE_INFLUENCE * age;
        double otherPerfIndex = otherAthlete.performance - AGE_INFLUENCE * otherAthlete.age;
        return performaceIndex < otherPerfIndex;
    }

    @Override
    public boolean greaterThan(Athlete altroAtleta) {
        return !lessThan(altroAtleta);
    }
}

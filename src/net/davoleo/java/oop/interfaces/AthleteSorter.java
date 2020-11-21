package net.davoleo.java.oop.interfaces;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 21.15
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

class AthleteSorter {

    private final Sortable<Athlete>[] athletes;

    AthleteSorter(Sortable<Athlete>[] athletes) {
        this.athletes = athletes.clone();
    }

    private int minPosition(int startFrom) {
        int minPos = startFrom;
        int currentPos = startFrom + 1;

        while (currentPos < athletes.length) {
            if (athletes[currentPos].lessThan((Athlete) athletes[minPos]))
                minPos = currentPos;
            currentPos++;
        }
        return minPos;
    }


    Sortable<Athlete>[] selectionSortA_Z() {
        for (int i = 0; i < athletes.length - 1; i++) {
            int remainingsMinPosition = minPosition(i);
            Sortable<Athlete> temp = athletes[i];
            athletes[i] = athletes[remainingsMinPosition];
            athletes[remainingsMinPosition] = temp;
        }

        return athletes;
    }
}

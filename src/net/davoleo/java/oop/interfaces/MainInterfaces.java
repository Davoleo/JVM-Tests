package net.davoleo.java.oop.interfaces;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 22/12/2018 / 17:26
 * Class: MainInterfaces
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class MainInterfaces {

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------");
        //Interfacce

        Athlete[] athleteList = {
                new Athlete(1, 19, 12),
                new Athlete(2, 19, 13),
                new Athlete(3, 29, 14)
        };

        AthleteSorter sorter = new AthleteSorter(athleteList);
        Athlete[] leaderBoard = (Athlete[]) sorter.selectionSortA_Z();

        System.out.println("LeaderBoard");

        /*for (int i=0; i<classifica.length; i++)
            System.out.println("Pettorale: " + classifica[i].pettorale +
                    " " + (classifica[i].prestazione - Atleti.coefficienteEta*classifica[i].eta));*/

        //^^^ Replaced with the for each below

        for (Athlete atleta : leaderBoard)
            System.out.println("Athlete ID: " + atleta.id + " - " + (atleta.performance - Athlete.AGE_INFLUENCE * atleta.age));

        System.out.println("---------------------------------------------------------------------");
    }

}

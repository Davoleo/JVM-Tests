package net.davoleo.java.oop.interfacce;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 22/12/2018 / 17:26
 * Class: MainInterfacce
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class MainInterfacce {

    public static void main(String[] args)
    {
        //-----------------------------------------------------------------------------------------------------------------
        //Interfacce
        System.out.println("---------------------------------------------------------------------");

        Atleti[] elenco = {new Atleti(1, 19, 12),
                new Atleti(2, 19, 13),
                new Atleti(3, 29, 14)};
        Ordinatore o = new Ordinatore(elenco);
        Atleti[] classifica = (Atleti[]) o.selectionSortA_Z();

        System.out.println("Classifica");

        /*for (int i=0; i<classifica.length; i++)
            System.out.println("Pettorale: " + classifica[i].pettorale +
                    " " + (classifica[i].prestazione - Atleti.coefficienteEta*classifica[i].eta));*/

        //^^^ Sostituito con il for each sotto questo commento

        for (Atleti atleta : classifica)
            System.out.println("Pettorale: " + atleta.pettorale + " " + (atleta.prestazione - Atleti.coefficienteEta*atleta.eta));


        System.out.println("---------------------------------------------------------------------");
    }

}

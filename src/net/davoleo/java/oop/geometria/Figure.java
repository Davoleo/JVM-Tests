package net.davoleo.java.oop.geometria;

import java.awt.*;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 17.28
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

@SuppressWarnings({"unused", "WeakerAccess"})

//non si possono creare oggetti di classi astratte
//Però si possono utilizzare per ereditarietà polimorfismo e sottoclassi
//Sono utilizzate di solito per oggetti così generali che non hanno caratteristiche adatte per poter essere creati concretamente
public abstract class Figure {
    enum tipiTratto {fine, medio, normale, forte}
    //raccolta di costanti predefinite

        Color penna = Color.black;
        tipiTratto spessore = tipiTratto.normale;

    //Il metodo generale stesso, per essere usato DEVE essere fatto Override
    // AKA Troppo generale per essere utilizzato in una classe astratta, ma invece può essere utilizzato in un sottoclasse più particolare
    //I metodi astratti possono essere creati solo nelle classi astratte
    //I metodi astratti DEVONO essere sovrascritti nelle sottoclassi per forza
       public abstract double perimetro();
       //Non viene svolto ciò che contiene, diventa un metodo segnaposto

        public Figure()
        {
            //potenziali importanti azioni di inizializzazione
            //...
        }

        public Figure(Color c, tipiTratto tratto)
        {
            this();
            penna = c; spessore = tratto;
        }

        //Metodi e classi astratte anche dette interfacce

    /*abstract double perimetro();

    public Figure(Color c, tipiTratto tratto)
    {   this();
        penna = c; spessore=tratto;
    }*/

    //altre caratteristiche in comune a tutte le figure ...
    //......
}

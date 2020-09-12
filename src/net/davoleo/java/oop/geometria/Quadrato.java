package net.davoleo.java.oop.geometria;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 16.03
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

    //L'ereditarietà permette di specializzare una classe utilizzandola per un utilizzo più particolare
    //ad esempio specializzare la classe del rettangolo per disegnare un quadrato
    //Lavora per riferimenti a classi base, superclassi, classi madre
    //Estendendo il Rettangolo, il quadrato dispone delle variabili che ci sono nella classe Rettangolo, le EREDITA'

public class Quadrato extends Rettangolo {

    public Quadrato (int x1, int x2, int lato)
    {
        //super richiama il costruttore del rettangolo che utilizza 4 int
        //applicandolo ai parametri del costruttore del quadrato
        //super DEVE essere la prima istruzione di un metodo in cui lo si utilizza
        super(x1,x2,lato,lato);
    }

    //se non trova il metodo nel quadrato cerca nel rettangolo
    //Override [sovvrascrive] del metodo perimetro del rettangolo
    public double perimetro()
    {return 4*base;}

    //Side note:
    //si potrebbe richiamare il perimetro della classe madre direttamente dalla classe figlia con l'utilizzo di super
    //return super.perimetro
    //nella pratica qui non ha senso farlo
}

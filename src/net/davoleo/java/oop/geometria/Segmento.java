package net.davoleo.java.oop.geometria;

/*************************************************
 * Author: Davoleo
 * Date: 23/06/2018
 * Hour: 22.35
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

//Quando una classe è in composizione con un altra si dice che è COMPOSED OF, composta da oggetti anche di altre classi
public class Segmento {

   private Punto p1;
   private Punto p2;

   //Segmento per 2 estremi
   public Segmento(int x1, int y1, int x2, int y2)
   {
       p1 = new Punto(x1, y1);
       p2 = new Punto(x2,y2);
   }

   //Segmento per un estremo e l'origine
    @SuppressWarnings("unused")
    public Segmento(int x2, int y2)
    {
        //Il this richiama le variabili del metodo precedente
        this(0,0, x2, y2);
    }

    @SuppressWarnings("unused")
    public Segmento() {this(0,0,0,0);}

    public double lunghezza()
    {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(),2) + Math.pow(p2.getY() - p1.getY(),2));
        //Applico il teorema di pitagora tra i delta delle coordinate degli estremi
    }
}

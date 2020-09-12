package net.davoleo.java.oop.geometria;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 17.45
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Cerchio extends Figure {
    private int xCentro, yCentro;
    private int raggio;

    public Cerchio(int x, int y, int r)
    {
        super();

        xCentro=x; yCentro=y;

        if(r>0)
            raggio=r;

    }

    @SuppressWarnings("unused")
    public Punto getCentro()
    {
        return new Punto(xCentro, yCentro);
    }

    public double perimetro()
    {return 2*Math.PI*raggio;}

    public double area()
    {return Math.PI*raggio*raggio;}

}

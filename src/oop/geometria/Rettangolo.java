package oop.geometria;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 15.31
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

@SuppressWarnings("unused")
public class Rettangolo extends Figure{


    /**
     *  Java visibility modifiers:
     *
     *  public (free access, everywhere)
     *  private (no access unless in the same class)
     *  package-private AKA default (free access from the classes in the same package)
     *  protected (free access from the classes in the same package)
     *
     *  Table: https://imgur.com/a/HN53hSw
     */
    private Punto UpSx;
    private int altezza;
    int base;

    public Rettangolo(int sx1, int sx2, int b, int h) {
        super();
        UpSx = new Punto(sx1,sx2);
        base = b;
        altezza = h;
    }

    public Rettangolo(Punto p, int x2, int y2)
    {
        this(p.getX(), p.getY(), x2-p.getX(), y2-p.getY());
    }

    public Rettangolo()
    {
        this(0,1,2,1);
    }

    public double perimetro()
    {
        return 2*(base+altezza);
    }

    //la keyword final applicato alle classi non permettono il metodo extends (le classi non posso avere figli)
    //la keyword final applicata ai metodi blocca quest'ultimi alla classe madre, non permettendo un override da parte della figlia
    //la stessa keyword sulle variabili le rende costanti e non più modificabili in nessun modo
    final double pi_greco = Math.PI;

    final public double area()
    {
        return base*altezza;
    }

    public Punto getUpSx()
    {
        return UpSx;
    }
}

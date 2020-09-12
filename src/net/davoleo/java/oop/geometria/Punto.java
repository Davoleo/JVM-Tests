package net.davoleo.java.oop.geometria;

/*************************************************
 * Author: Davoleo
 * Date: 17/6/18
 * Hour: 16:00
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Punto extends Figure {

    //coordinate x y per un punto
    //Stato interno         //Descrivono la struttura interna di un oggetto appartenente a questa classe
    private int x;        //private fa in modo che le variabili non abbiano accesso diretto e dunque le protegge
    private int y;
    private static int conta = 0;       //Non appartiene ad un oggetto è globale della classe

    //Assegnamento e lettura dei dati tramite getter e setter, autoinizializzano le coordinate

    //Costruttori
    //Per le variabili fondamentali (creare un oggetto senza di esse non avrebbe senso)
    //possono esserci infiniti altri costruttori, ma ognuno deve accettare dati diversi
    //se non ce n'è uno personalizzato viene utilizzato un cotruttore di default (senza parametri)
    public Punto(int x, int y)
    {
        //Controlli o qualsiasi cosa che tu voglia fare quando il punto viene costruito
        this.x = x;
        this.y = y;
        conta++;
    }

    //Punto sull'asse x
    @SuppressWarnings("unused")
    public Punto(int x)
    {
        this(x, 0);
        //^ Si riferisce al costruttore generale
    }

    public Punto()
    {
        this(0,0);
    }

    //I costruttori secondari possono aggiungere qualcosa al costruttore principale
    //costruttori che dipendono da altri



    //metodi    I metodi getter e setter possono essere generati automaticamente da Code > Generate > Getter and Setter
    //getter    per accedere alla lettura delle variabili private
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    //setter    per accedere alla scrittura delle variabili private
    public void setX(int x)
    {
        this.x = x;         //this. cancella gli equivoci distinguendo le 2 x
                            //x come quella della classe in cui viene dichiarata
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public static int getConta()
    {
        return conta;
    }

    @SuppressWarnings("unused")
    public void moveTo(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public static double distance(Punto punto1, Punto punto2)
    {
        int x1 = punto1.x;
        int x2 = punto2.x;
        int y1 = punto1.y;
        int y2 = punto2.y;

        return Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
    }

    @Override
    public double perimetro()
    {
        return 0;
    }

    //altro
    public int LocalizzaQuadrante()
    {
        if(x>0 && y>0)
            return 1;
            else
                if(x<0 && y>0)
                    return 2;
                    else
                        if(x<0 && y<0)
                            return 3;
                            else
                                if(x>0 && y<0)
                                    return 4;
                                        else return 99;

    }

}
package oop;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
import data.Array;
import oop.enumerazioni.EnumOW;
import oop.enumerazioni.Hero;
import oop.esercizi.Frazione;
import oop.geometria.*;
import oop.interfacce.FunctionalInterfaces;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Function;

/*************************************************
 * Author: Davoleo
 * Date: 16/6/18
 * Hour: 23:00
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class MainOOP {
    public static void main(String[] args){


        //------------------------------------------------------------------------------------------------
        //POINTS

        Punto p1;           //Dichiarazione di un oggetto   come le variabili    SOLO COME RIFERIMENTO
        p1 = new Punto(10, 10);   //metodo costruttore    per crearlo, nella RAM

        //p1.x = 123;      NO! SONO VARIABILI PRIVATE!
        //p1.y = -67;

        p1.setX(900);
        p1.setY(1000);

        System.out.println("x: " + p1.getX() + " | y: " + p1.getY());

        Punto p2;
        p2 = new Punto(23,-10);

        System.out.println(p2);

        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------
        //FRACTIONS

        System.out.println("Il punto si trova nel quadrante n. " + p1.LocalizzaQuadrante());

        Frazione f1, f2, f3, f4;

        f1 = new Frazione(1,7);
        System.out.println("La frazione f1 è: " + f1.ftoString());

        f2 = new Frazione(7);
        System.out.println("La frazione f2 è: " + f2.ftoString());
        System.out.println("Il numeratore di f2 è: " + f2.getN());
        System.out.println("Il denominatore di f2 è: " + f2.getD());

        f3 = new Frazione("23/53");
        System.out.println("La frazione f3 è: " + f3.ftoString());
        System.out.println("Il risultato di f3 è: " + f3.getResult());

        f4 = new Frazione("1/2");
        Frazione fsomma = f4.Somma(new Frazione ("1/3"));
        System.out.println("La somma tra 1/2 e 1/3 è: " + fsomma.ftoString());

        System.out.println("-------------------------------------------------------------------");
        //--------------------------------------------------------------------------------------------------------------------
        //Static members
        //Non sono legati alla creazione di un oggetto
        //Quindi condivisi tra tutti gli oggetti dello stesso tipo

        Random r = new Random();

        //Per diecimila volte genera un numero randomico da uno a 10 e ogni volta che questo numero è = a 5 crea un punto
        for(int i=0; i<10000; i++)
            if (r.nextInt(10)== 5)
                new Punto();

        System.out.println("Sono stati creati " + Punto.getConta() + " punti");
        //getConta è un metodo STATIC, detto anche di classe, poiché non viene effettuato su di un oggetto ma deriva direttamente dalla classe

        //Molte classi di servizio contengono metodi statici come la classe Math
        double areaCerchio = Math.PI * Math.pow(27.2,2);
        System.out.println("Area del cerchio: " + areaCerchio);

        Punto pA = new Punto(0, 2);
        Punto pB = new Punto(3, 7);
        System.out.println("La distanza tra i due punti è di: " + Punto.distance(pA, pB));


        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------------------------------------
        //Segmenti - Composizione di classi

        Segmento s = new Segmento(12,1,2,13);

        System.out.println("La lunghezza del segmento s è di: " + s.lunghezza());

        System.out.println("-------------------------------------------------------------------");
        //-------------------------------------------------------------------------------------------------------------------
        //Rettangoli - Composizione di classi

        Rettangolo rettangolo = new Rettangolo(100, 50, 30, 10);
        System.out.println("La lunghezza del perimetro del rettangolo è: " + rettangolo.perimetro());
        System.out.println("Il valore dell'area del rettangolo è: " + rettangolo.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Quadrati - EREDITARIETA' PARTE 1

        //Va a richiamare automaticamente il metodo vuoto del rettangolo
        Quadrato q = new Quadrato(1,1,3);
        System.out.println("La lunghezza del perimetro del quadrato è: " + q.perimetro());
        System.out.println("Il valore dell'area del quadrato è: " + q.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Cerchi
        Cerchio c = new Cerchio(0,0,5);
        System.out.println("La lunghezza del perimetro del cerchio è: " + c.perimetro());
        System.out.println("Il valore dell'area del quadrato è: " + c.area());

        System.out.println("---------------------------------------------------------------------");
        //-----------------------------------------------------------------------------------------------------------------
        //Conformità di tipo | late binding | polimorfismo
        //Le figure madri possono conservare informazioni che possono contenere anche le classi figlie
        //Questa compatibilità/tolleranza è detta CONFORMITA' DI TIPO
        Figure f = new Quadrato(10,40,100);
        f.perimetro();

        Figure[] disegno = new Figure[1000];

        disegno[0] = new Quadrato(30,30,40);
        disegno[1] = new Quadrato(30,10,50);
        disegno[2] = new Cerchio(100,100,70);
        disegno[3] = new Rettangolo(15,10, 150,80);
        disegno[4] = new Quadrato(30,100,80);

        int numeroFigure = 5;
        double totPerimetri = 0;

        disegno[0].perimetro();

        for (int i=0; i<numeroFigure;i++)
            totPerimetri+=disegno[i].perimetro();

        System.out.println(totPerimetri);

        //late binding / dynamic binding
        //si contrappone a
        //early binding / static binding
        //late binding è il momento in cui un programma in runtime sceglie il metodo da utilizzare

        System.out.println("---------------------------------------------------------------------\n");
        //-----------------------------------------------------------------------------------------------------------------
        //Eccezioni
        int diQuanti = 0;
        int[] vettore = {3,8,-78,19,56,0,41,88,12,13,14,90};
        try{
            System.out.println("Media: " + metodoIntermedio(vettore, diQuanti));
        }
        catch(IllegalArgumentException eccezione)
        {
            System.out.println("Argomento Illegale ;)");
        }

        //----


        try
        {
            @SuppressWarnings("unused")
            PrintWriter backup = new PrintWriter("z:\\nonEsisto.txt");
        }
        catch(FileNotFoundException e)
        {
            //e.printStackTrace();
            System.out.println("Il file per il backup non può essere creato");
        }
        finally
        {
            System.out.println("in un modo o nell'altro questo blocco di codice viene sempre eseguito");
        }

        System.out.println("---------------------------------------------------------------------\n");

        EnumOW.printHeroesWithPredicate(hero -> hero.realName().contains("Genji"));
        System.out.println();

        FunctionalInterfaces.processPersons(
                Arrays.asList(EnumOW.values()),
                hero -> hero.age() <= 25,
                hero -> System.out.println(hero.toString()));

        EnumOW[] enumArray = EnumOW.values();
        List<Hero> heroRoster = new ArrayList<>();
        for (EnumOW enumOW : enumArray) {
            heroRoster.add(enumOW.getHero());
        }
        /*
        * Method Reference:
        * Kind	Example
        * Reference to a static method	ContainingClass::staticMethodName
        * Reference to an instance method of a particular object	containingObject::instanceMethodName
        * Reference to an instance method of an arbitrary object of a particular type	ContainingType::methodName
        * Reference to a constructor	ClassName::new
        */
        heroRoster.sort(Hero::compareByName);

    }

    private static int metodoIntermedio(int[] v, int diQuanti)
    {
        try
        {
            return mediaInteraVett(v, diQuanti);
        }
        catch(ArithmeticException errore)
        {
            return -1111111111;
        }
    }


    /** Le eccezioni si dividono in Checked e Unchecked
     *   Checked: Non si possono ignorare
     *   Unchecked: Si possono ignorare
     *
     *   Le eccezioni Unchecked si dividono in:
     *   Errors: sono generati da qualcosa di esterno all'applicazione (ex: disco/connessione internet)
     *   Runtime Exceptions: generati da qualcosa di interno all'applicazione (ex: logic/DivBy0)
     *
     *  Le eccezioni Checked sono prevedibili e devo essere gestite in modo da non far terminare brutalmente il programma
     *  Le eccezioni Checked possono essere ri-lanciate al chiamante solo in modo esplicito
     **/
    private static int mediaInteraVett(int[] v, int diQuanti)
    {
        int somma = 0;
        for (int i=0; i<diQuanti; i++)
            somma+=v[i];

        if (diQuanti!=0)
        return somma / diQuanti;
        else
            throw new ArithmeticException();
        //Viene lanciata l'eccezione verso l'alto
        //che viene catturata dal costrutto try/catch il prima possibile
        //se l'eccezione non è gestita viene sollevata alla fine da Java come errore
        //Uncaught Exception



    }


}

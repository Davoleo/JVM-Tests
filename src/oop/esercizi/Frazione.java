package oop.esercizi;

/*************************************************
 * Author: Davoleo
 * Date: 23/06/2018
 * Hour: 16.35
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Frazione {

    private int n;
    private int d;

    //Costruttori di input
    public Frazione(int n, int d)
    {
        this.n = n;
        if(d!=0)
        this.d = d;
        else
            {
                this.d=1;
                System.out.println("Il denominatore è stato automaticamente cambiato con 1 per evitare di sollevare un eccezione");
            }
    }

    public Frazione(int n)
    {
        this.n = n;
        this.d = 1;
    }

    public Frazione(String IFraction) {
        //split è un metodo del tipo stringa che divide la stringa in tante stringhe a seconda del simbolo presente
        //split divide tutto in un array di stringhe (vettore)
        //parseInt: metodo di conversione a int della classe Integer [converte altri tipi a int]

        n = Integer.parseInt(IFraction.split("/")[0]);
        d = Integer.parseInt(IFraction.split("/")[1]);
    }


    //Costruttori di output

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

    public String ftoString() {
        return n + "/" + d;
    }

    public int getResult() {
        return n/d;
    }

    public Frazione Somma(Frazione altraFrazione)
    {
        return new Frazione(n*altraFrazione.d + d*altraFrazione.n, d*altraFrazione.d);
        //minimo comune multiplo, utilizzando il prodotto al denominatore
    }
}

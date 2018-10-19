package altro;

public class Sottoprogrammi {

    /*************************************************
     * Author: Davoleo
     * Date: 13/5/18
     * Hour: 20:55
     * Copyright - © - Davoleo - 2018
     **************************************************/

    //messaggi prefabbricati versione 1

    public static void rigaSimboliCn(char simbolo, int lunghezza)
    {rigaSimboli(simbolo, lunghezza, false);}

    public static void rigaSimboliLn(char simbolo, int lunghezza)
    { rigaSimboli(simbolo, lunghezza, true);}

    public static void rigaSimboli(char simbolo, int lunghezza, boolean aCapo)
    {
        for(int j=0; j<lunghezza; j++)
            System.out.print(simbolo);

        if(aCapo)
            System.out.println();
    }

    //riga di simboli versione 2

    static String clona(char simbolo, int quanteVolte)
    {
        String riga = "";
        for(int i=0; i<quanteVolte; i++)
            riga+=simbolo;
        return riga;
    }


    static void messaggio(String ilMessaggio, char simbolo, int lunghezza)
    {
            //String riga = clona(simbolo, lunghezza);
            //System.out.println(riga);

            rigaSimboliCn(simbolo, lunghezza);

            System.out.println("\n" + ilMessaggio);

            rigaSimboliLn(simbolo,lunghezza);
    }

    //Avanzate circa i metodi
    public static void raddoppia (int numero)
    {
        System.out.println("Ho ricevuto il numero: " + numero + "\n");
        numero *= 2;
        System.out.println("Che raddoppiato fa: " + numero + "\n");
    }


    //main section

    public static void main(String[] args) {

        //Sottoprogramma: in C detto funzione aka metodo in OOP
        //unità di elaborazione riutilizzabile
        //blocchi di codice che possono essere richiamati e utilizzati in qualsiasi altro posto
        //meccanismo alla base di ogni processo industriale
        //libreria: una collezione più o meno grande di funzioni
        //prefabbricati che non fanno nulla di superfluo come output o input a meno che non sia la loro direttiva principale
        double radice = Math.sqrt(15.8);

        int n = 333;
        raddoppia(n);
        System.out.println("Dopo il richiamo del metodo: " +n+ "\n");

        // ...altre istruzioni

        //richiamo del metodo
        messaggio("ciao ciao....", '-', 30);

        messaggio("ATTENZIONE: LAVORI IN CORSO", '◬', 40);

        //...altre istruzioni...


    }

}

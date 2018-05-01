
//Packages per importare i comandi
//import java.lang.*;

public class TestClass {

    public static void main(String[] args){

        //class: System, che contiene la sottoclasse out che a sua volta contiene print
        System.out.println(5 + 3);
        System.out.println("ciao");
        System.out.println("valore di pigrego " + 3.14);
        System.out.println(3*5);
        System.out.println(3.0/5); //<-- CAST forzatura di tipo

        //tipi primitivi

        //byte -128 +127  [8 bits, 1 byte]
        byte b1 = 23;

        //short [16 bits, 2 bytes]
        short minValue = -32768;
        short maxValue = 32767;

        //int  [32 bits, 4 bytes]
        int maxValueInt = 2147483647;
        int minValueInt = -2147483648;

        //long  [32 bits, 4 bytes]
        long maxValueLong = 9223372036854775807L;
        long minValueLong = -9223372036854775808L;

        //float [32 bits, 4 bytes]
        float f1 = 3.12345678F;

        System.out.println(Float.MAX_VALUE);
                        //Classe Float

        //Double: 8 bytes, (64 bits) virgola mobile doppia precisione
        double d1 = 3.12345678;

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE); //più vicino allo 0

        System.out.println(d1 + " --- " + f1);

        //char
        char c1 = 'a';
        char c2 = '.';
        char c3 = '#';
        char c4 = 35;      //memorizza il codice asci per quel carattere (in questo caso si tratta di #)
        System.out.println(c4);
        int i = 100 + 'a'; //somma il codice asci della lettera a alla costante 100
        System.out.println(i);

        //boolean
        boolean veroFalso = 5>3;
        System.out.println(veroFalso);

        boolean superatoControllo;

        //String [non primitivo] (occupa più RAM del char)
        String cognome = "Parrotta";
        superatoControllo = cognome.endsWith("tta");
        System.out.println(superatoControllo);





            int                  variabile               =                  0;
        //  tipo                 identificatore         diventa             valore
        double percentualeInteresse = 2.5;  //percentuale interesse annuale
        double sommaDepositata = 1000;      //in euro

        //after one year
        sommaDepositata = sommaDepositata + (sommaDepositata/100) * percentualeInteresse;
        System.out.println("Dopo un anno avrai " + sommaDepositata + " €");

    }
}
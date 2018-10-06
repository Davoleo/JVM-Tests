package operatori;

public class OperatoriRelazionali {

    /*************************************************
     * Author: Davoleo
     * Date: 4/5/18
     * Hour: 21:45
     * Copyright - © - Davoleo - 2018
     **************************************************/

    public static void main(String[] args) {

        //operatore di uguaglianza == (DOPPIO uguale)
         System.out.println(5==5);
         System.out.println(5==3);

         //operatore di maggioranza o di minoranza (>     >=      <=      <)
        int eta = 22;
        boolean maggiorenne = eta>=18;
        System.out.println(maggiorenne);

        //operatore "diverso" !=
        String test = "ciao";
        boolean uguale = (test != "ciao");
        System.out.println(uguale);

        //particolarità per le stringhe e i caratteri
        String cognome1 = "Rossi";
        String cognome2 = "Rossi ";
        boolean confronto = (cognome1 == cognome2);
        System.out.println(confronto);

        //Non si possono comparare 2 stringhe a meno che non si usi il metodo compareTo
        // se la seconda Stringa è maggiore allora troviamo un valore negativo
        // se sono uguali troviamo un valore uguale a 0
        // se la prima Stringa è maggiore della prima allora troviamo un valore positivo
        System.out.println(cognome1.compareTo(cognome2));

        //Tra i caratteri compara il codice ASCII
        System.out.println('a' > '#');
    }
}

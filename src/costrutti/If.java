package costrutti;

public class If {

    /*************************************************
     * Author: Davoleo
     * Date: 4/5/18
     * Hour: 22:14
     * Copyright - © - Davoleo - 2018
     **************************************************/


    public static void main(String[] args) {

        //Struttura selettiva, programma in grado di scegliere
        //Quando la valutazione dell'espressione booleana da vero allora vengono eseguiti delle istruzioni, altrimenti delle altre

        //Quando in uno dei due rami si trova una sola istruzione si può anche evitare di mettere la graffa
        int eta = 22;
        if (eta>18)
        {
            System.out.println("hai più di 18 anni");
            System.out.println("SEI VECCHIO!");
        }
        else
        {
            System.out.println("hai al massimo 18 anni");
            System.out.println("chi pretendi di essere??????????????????");
        }

        //Strutture If annidate
        int eta2 = 66;
        if (eta2>18)
            if (eta2<65)
                System.out.println("Maggiorenne non ancora VECCHIOOOO");
            else
                System.out.println("sei maggiorenne, MA ANCHE VECCHIOOOOOO");
        else
                System.out.println("non sei per niete VECCHIOOOOO");

        //Strutture if con condizioni composte
        int eta3 = 5;

        if (eta3>18 && eta3<65)
        System.out.println("Sei adultttttt ma non VECCCCCCCCCCCCCCCCHIOOOOOOOOOOOOOOOOOOOOOOO");
        else
        System.out.println("potresti essere giovane... come potresti essere VECCHIOOOOOO");
        //Short evaluation: per le condizioni complesse, se la prima è falsa non valutà la seconda
        // può funzionare anche come condizioni di esistenza :)


        //Operatore condizionale ternario (Per le condizioni brevi)
        System.out.println((eta != 98) ? "diverso da 98 :P" : "uguale a 98");


    }
}

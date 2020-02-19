package oop.interfacce;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 21.10
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

public class Atleti implements Ordinabile {
    int pettorale;
    int eta, prestazione; //in secondi
    final static double coefficienteEta=0.4;

    Atleti(int pettorale, int eta, int prestazione)
    { this.pettorale=pettorale; this.eta=eta; this.prestazione=prestazione;}

    @Override
    public boolean minoreDi(Object altroAtleta)
    {
        if(!(altroAtleta instanceof Atleti))
            return false;
        else
        {
            double indicePrestazioneQuestoAtleta = prestazione - coefficienteEta*eta;

            double indicePrestazioneAltro = ((Atleti)altroAtleta).prestazione - coefficienteEta*((Atleti)altroAtleta).eta;

            return indicePrestazioneQuestoAtleta < indicePrestazioneAltro;
        }
    }

    @Override
    public boolean maggioreDi(Object altroAtleta)
    {
        return !minoreDi(altroAtleta);
    }
}

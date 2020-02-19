package oop.interfacce;

/*************************************************
 * Author: Davoleo
 * Date: 25/06/2018
 * Hour: 21.15
 * Project: JavaOOP
 * Copyright - © - Davoleo - 2018
 **************************************************/

class Ordinatore {

    private Ordinabile[] v;

    Ordinatore(Ordinabile[] v)
    {this.v = v.clone(); }

    private int posMin(int partiDa)
    {
        int posizioneMinimo=partiDa,
                posizioneCorrente=partiDa+1;

        while (posizioneCorrente<v.length)
        {
            if(v[posizioneCorrente].minoreDi(v[posizioneMinimo]) )
                posizioneMinimo = posizioneCorrente;
            posizioneCorrente++;
        }
        return posizioneMinimo;
    }


    Ordinabile[] selectionSortA_Z()
    {
        for (int i=0; i<v.length - 1; i++)
        {
            int posizioneMinimoDeiRimanenti =
                    posMin(i);
            Ordinabile tmp = v[i];
            v[i] = v[posizioneMinimoDeiRimanenti];
            v[posizioneMinimoDeiRimanenti] = tmp;
        }

        return v;

    }
}

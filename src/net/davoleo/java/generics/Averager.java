/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 02/08/2020 / 13:00
 * Class: Averager
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package net.davoleo.java.generics;

import java.util.function.IntConsumer;

public class Averager implements IntConsumer {

    private int total = 0;
    private int count = 0;

    public double average() {
        if (count > 0)
            return total / ((double) count);
        else
            return 0;
    }

    @Override
    public void accept(int value) {
        total += value;
        count++;
    }

    public void combine(Averager other) {
        total += other.total;
        count += other.count;
    }
}

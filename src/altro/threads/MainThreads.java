package altro.threads;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 21/02/2019 / 23:14
 * Class: MainThreads
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class MainThreads {

    /**
     * Threads: Simultaneous operations
     */
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new ExThread("one"));
        Thread t2 = new Thread(new ExThread("two"));
        Thread t3 = new Thread(new ExThread("three"));
        Thread t4 = new Thread(new ExThread("four"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

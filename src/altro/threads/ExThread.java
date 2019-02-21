package altro.threads;

import java.util.Random;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 21/02/2019 / 23:07
 * Class: ExThread
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class ExThread implements Runnable {

    String name;
    int time;
    Random r = new Random();

    public ExThread(String s)
    {
        name = s;
        time = r.nextInt(999);
    }

    @Override
    public void run()
    {
        try
        {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.println(name + " is done");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

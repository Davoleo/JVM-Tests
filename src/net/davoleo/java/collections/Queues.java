/*-----------------------------------------
 * Author: Davoleo
 * Date / Hour: 13/02/2019 / 17:46
 * Class: Queues
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **-----------------------------------------*/

package net.davoleo.java.collections;

import java.util.PriorityQueue;

public class Queues {

    /**
     * Data structure
     * A line of things
     * The first element added has the highest priority
     * Methods:
     * offer: adds one element to the queue
     * peek: returns the element that has the highest priority
     * poll: removes the element that has the highest priority
     **/
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.printf("%s ", queue);
        System.out.println();

        System.out.printf("%s ", queue.peek());
        System.out.println();

        queue.poll();
        System.out.printf("%s ", queue);
        System.out.println();

    }
}

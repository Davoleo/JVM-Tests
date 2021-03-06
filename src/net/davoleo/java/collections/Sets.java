/*-------------------------------------------
 * Author: Davoleo
 * Date / Hour: 14/02/2019 / 15:53
 * Class: Sets
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 *-------------------------------------------*/

package net.davoleo.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    /**
     * Similar to a list, but constructing a HashSet removes every duplicate in the list used to create it
     * It's also not indexed, as such you can't get a speicific item out of a set
     */
    public static void main(String[] args) {
        String[] things = {"apple", "BOB", "ham", "BOB", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.println(list);
        System.out.println();

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}

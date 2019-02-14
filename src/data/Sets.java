package data;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 14/02/2019 / 15:53
 * Class: Sets
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class Sets {

    public static void main(String[] args)
    {
        String[] things = {"apple", "BOB", "ham", "BOB", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.println(list);
        System.out.println();

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}

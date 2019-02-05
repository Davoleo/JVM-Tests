package altro;

import java.util.*;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 05/02/2019 / 15:27
 * Class: Collections
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class Collections {

    public static void main(String[] args)
    {
        //Array and list v1 initialization
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list = new ArrayList<>();

        //Adds the string in the first array to the list
        list.addAll(Arrays.asList(things));

        //Array and list v2 initialization
        String[] otherThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        //Adds the Strings in the second array to the list
        for (String s : otherThings)
            list2.add(s);

        //Prints out the Strings in the 1st list before editing the list
        for (String s : list)
            System.out.printf("%s ", s);

        editList(list, list2);
        System.out.println();

        //Prints out the Strings in the 1st list after editing the list
        for (String s : list)
            System.out.printf("%s ", s);

    }

    /**
     * it loops through the list until the hasNext method returns false
     * and it removes from list1 every string that is already in the list2
     * @param list1 First list
     * @param list2 Second list
     */
    private static void editList(Collection<String> list1, Collection<String> list2)
    {
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext())
            if (list2.contains(iterator.next()))
                iterator.remove();

    }


}

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
        //---------------------------------------------------------------------------------------------------
        //ArrayLists
        //Array and list v1 initialization
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //Adds the string in the first array to the list
        list1.addAll(Arrays.asList(things));

        //Array and list v2 initialization
        String[] otherThings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        //Adds the Strings in the second array to the list
        for (String s : otherThings)
            list2.add(s);

        //Prints out the Strings in the 1st list before editing the list
        for (String s : list1)
            System.out.printf("%s ", s);

        editList(list1, list2);
        System.out.println();

        //Prints out the Strings in the 1st list after editing the list
        for (String s : list1)
            System.out.printf("%s ", s);

        //-----------------------------------------------------------------------------------------------------
        //LinkedLists
        String[] stuff = {"apples", "noobs", "pwnge", "bacon", "goat"};
        List<String> list3 = new LinkedList<>();
        for(String s : stuff)
            list3.add(s);

        String[] stuff2 = {"sausage", "bacon", "goat", "harrypotter"};
        List<String> list4 = new LinkedList<>();
        for (String s : stuff2)
            list4.add(s);

        list3.addAll(list4);
        list4 = null;

        printList(list3);
        removeStuff(list3, 2, 5);
        printList(list3);
        printReversedList(list3);

        //-----------------------------------------------------------------------------------------------------------
        //List2Arrays & Arrays2List
        String[] asdf = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> thelist = new LinkedList<>(Arrays.asList(asdf));

        thelist.add("pumpkin");
        thelist.addFirst("firstthing");

        asdf = thelist.toArray(new String[thelist.size()]);

        for (String s : asdf)
            System.out.printf("%s ", s);

    }

    /**
     * It reverses the items list passed as a parameter
     * @param list List that needs to be reversed
     */
    private static void printReversedList(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious())
            System.out.printf("%s", iterator.previous());
    }

    /**
     * Removes the items of index between the lowerBound and the upperBound from the list
     * @param list List the method is going to remove the items from
     * @param from The lowest index (inclusive) of the item in the list that is going to be removed
     * @param to The highest index (exclusive) of the item in the list that is going to be removed
     */
    private static void removeStuff(List<String> list, int from, int to)
    {
        list.subList(from, to).clear();
    }

    /**
     * Prints our the list passed as a parameter
     * @param list List that needs to be printed out
     */
    private static void printList(List<String> list)
    {
        for (String s : list)
            System.out.printf("%s ", s);
        System.out.println();
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

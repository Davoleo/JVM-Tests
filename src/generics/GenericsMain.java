/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 18/03/2020 / 20:55
 * Class: GenericsMain
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package generics;

import oop.geometria.Figure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Generics allow to make general classes that can be later restricted to specific data types
public class GenericsMain {

    public static void main(String[] args) {
        //List is an example of generic interface
        List<Integer> intList = new LinkedList<>();

        intList.add(0);
        int x = intList.iterator().next();

        //List of unknown elements (should be used instead of List<Object>) - the ? is the wildcard that adapts to every object
        //It is certain that an element returned from a List<?> is at least an Object
        List<?> unknownList = new ArrayList<>();

        //We should use "? extends SampleClass" for the parameterized type to accept all the objects of the subclasses of the specified class
        List<? extends Figure> polymorphicList = new ArrayList<>();

        //Generic Methods

    }

}

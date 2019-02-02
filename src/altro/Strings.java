package altro;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 02/02/2019 / 00:39
 * Class: Strings
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class Strings {


    public static void main(String[] args)
    {
        String[] words = {"funk", "chunk", "furry", "baconator"};

        //startsWith
        //returns true if the String starts with the String passed as a parameter
        for (String w: words) {
            if(w.startsWith("fu"))
                System.out.println(w + " starts with fu");
        }

        //endsWith
        //returns true if the String ends with the String passed as a parameter
        for (String w: words) {
            if(w.endsWith("unk"))
                System.out.println(w + " ends with unk");
        }


        //IndexOf
        String s = "this is a really log sentence to be put in a string that will have a use in some method";

        //Looks for the first instance of the char/string passed as a parameter and it returns the number of the position of that char in the string
        //The second optional parameter gives a starting point in the string as an int
        //If the char/string doesn't exist in the string the method returns -1
        System.out.println("Index of letter p is: " +  s.indexOf('p'));

        //concat
        //It concatenates two strings together
        //replace
        //It replace the char passed as first parameters with the char passed as second parameter
        //toUpperCase
        //it turns all the string into an UPPERCASE STRING
        //toLowerCase
        //it turns all the string into a lowercase string
        //trim
        //It removes any spacing before or after the String

        String a = "Bacon ";
        String b = "Weirdo";
        System.out.println(a.concat(b));

        System.out.println(a.replace('B', 'F'));

        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());

        String fullOfSpaces = "                 a                     ";

        System.out.println(fullOfSpaces);
        System.out.println(fullOfSpaces.trim());



    }



}

package collections;

import java.util.Stack;

/*************************************************
 * Author: Davoleo
 * Date / Hour: 13/02/2019 / 17:32
 * Class: Stacks
 * Project: JavaBase
 * Copyright - © - Davoleo - 2019
 **************************************************/

public class Stacks {

    /**
     * Data Structure
     * A pile of something
     * The element on top ALWAYS has the priority
     * Methods:
     * push: Adds an element to the top of the stack
     * pop: Removes the element on top of the stack
     */
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        stack.push("bottom_string");
        printStack(stack);
        stack.push("middle_string");
        printStack(stack);
        stack.push("top_string");
        printStack(stack);

        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
    }

    private static void printStack(Stack<String> s)
    {
        if (s.isEmpty())
            System.out.println("Empty Stack");
        else
            System.out.printf("%s TOP\n", s);
    }
}

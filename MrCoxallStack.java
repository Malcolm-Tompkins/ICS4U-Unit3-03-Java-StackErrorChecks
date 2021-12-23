//
// Mr Coxall Stack class
// Created Dec 8, 2021
//

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
* MrCoxallStack class.
*/
public class MrCoxallStack {

    /**
    * Creates arrayList for the stack.
    */
    private static ArrayList<Integer> aStack = new ArrayList<Integer>();

    /**
    * Getter for aStack arrayList.
    *
    * @return aStack arrayList
    */
    public ArrayList<Integer> getStack() {
        return this.aStack;
    }

    /**
    * Method for push a number into stack.
    *
    * @param pushNumber number to be added to stack
    */
    public void push(final int pushNumber) {
        aStack.add(0, pushNumber);
    }

    /**
    * Method for displaying the stack ot user.
    */
    public void showStack() {
        System.out.println("The stack as an array is " + aStack);
    }

    /**
    * Method for taking a number out of the stack.
    *
    * @return the first element taken out of the stack list
    *
    * @throws EmptyStackException if stack is empty
    */

    public int pop() {
        if (aStack.size() == 0) {
            throw new EmptyStackException();
        } else {
            final int firstElement = aStack.get(0);
            aStack.remove(0);
            return firstElement;
        }
    }
}

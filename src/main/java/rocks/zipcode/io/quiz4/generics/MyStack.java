package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{

    private ArrayList<SomeType> stack = new ArrayList<>();

    public MyStack() {}

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        try {
        stack.add(i);
        } catch (EmptyStackException e) {
            throw new EmptyStackException();
        }
    }

    public SomeType peek() {
        return stack.size() > 0 ? stack.get(stack.size()-1) : null;

    }

    public SomeType pop() {
        if (stack.isEmpty()) {throw new EmptyStackException();
        } else {
            SomeType poppedThing = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return poppedThing;
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

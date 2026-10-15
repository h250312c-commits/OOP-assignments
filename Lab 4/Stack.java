import java.util.ArrayList;
import java.util.List;

/** Generic last-in, first-out collection implemented with composition. */
public class Stack<T> {
    /** Elements are stored from the bottom of the stack to its top. */
    private final ArrayList<T> elements = new ArrayList<>();

    /** Adds an element to the top of the stack. */
    public void push(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Stack element cannot be null.");
        }
        elements.add(element);
    }

    /** Removes and returns the top element, failing if the stack is empty. */
    public T pop() {
        ensureNotEmpty();
        return elements.remove(elements.size() - 1);
    }

    /** Returns the top element without removing it. */
    public T peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }

    /** Returns the number of stored elements. */
    public int size() {
        return elements.size();
    }

    /** Reports whether the stack contains no elements. */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /** Returns an immutable bottom-to-top copy of the stack contents. */
    public List<T> snapshot() {
        return List.copyOf(elements);
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    /** Rejects top-element operations when no elements are present. */
    private void ensureNotEmpty() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
    }

    /** Demonstrates Stack LIFO operations via composition. */
    public static void main(String[] args) {
        System.out.println("Testing Stack:");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Size after pop: " + stack.size());
    }
}

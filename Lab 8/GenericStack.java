import java.util.ArrayList;
import java.util.NoSuchElementException;

/** Generic last-in, first-out collection backed by a resizable array. */
public class GenericStack<T> {
    /** Elements are held from bottom to top; the final element is the stack top. */
    private final ArrayList<T> elements = new ArrayList<>();

    /** Adds a value to the top of the stack. */
    public void push(T value) {
        elements.add(value);
    }

    /** Removes and returns the top value, throwing if the stack is empty. */
    public T pop() {
        ensureNotEmpty();
        return elements.remove(elements.size() - 1);
    }

    /** Returns the top value without removing it. */
    public T peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }

    /** Reports whether the stack contains no values. */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /** Rejects operations that require a top value when none exists. */
    private void ensureNotEmpty() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
    }
}

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericStack<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    public void push(T value) {
        elements.add(value);
    }

    public T pop() {
        ensureNotEmpty();
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    private void ensureNotEmpty() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Stack is empty.");
        }
    }
}

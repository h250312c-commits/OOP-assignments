import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    public void push(T element) {
        elements.add(element);
    }

    public T pop() {
        ensureNotEmpty();
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        ensureNotEmpty();
        return elements.get(elements.size() - 1);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public List<T> snapshot() {
        return List.copyOf(elements);
    }

    private void ensureNotEmpty() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
    }
}

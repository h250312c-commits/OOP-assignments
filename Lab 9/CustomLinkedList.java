import java.util.Iterator;
import java.util.NoSuchElementException;

/** Singly linked list that supports append and forward iteration. */
public class CustomLinkedList<T> implements Iterable<T> {
    /** Link containing one value and a reference to the next link. */
    private static class Node<E> {
        /** Value stored at this position in the list. */
        private final E value;
        /** Successor link, or {@code null} at the end of the list. */
        private Node<E> next;

        /** Creates a link with no successor yet. */
        private Node(E value) {
            this.value = value;
        }
    }

    /** First node, or {@code null} when the list is empty. */
    private Node<T> head;
    /** Last node, used to append in constant time. */
    private Node<T> tail;
    /** Number of values currently in the list. */
    private int size;

    /** Appends a value after the current tail. */
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    /** Returns the number of values stored in the list. */
    public int size() {
        return size;
    }

    @Override
    /** Creates an iterator that visits values from head to tail. */
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    /** Forward iterator whose cursor tracks the next node to return. */
    private class ListIterator implements Iterator<T> {
        private Node<T> next = head;

        @Override
        /** Reports whether another node remains. */
        public boolean hasNext() {
            return next != null;
        }

        @Override
        /** Returns the next value and advances the cursor, or fails at the end. */
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T value = next.value;
            next = next.next;
            return value;
        }
    }
}

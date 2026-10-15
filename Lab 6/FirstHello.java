/** First interface providing a default greeting for the conflict example. */
public interface FirstHello {
    /** Prints the greeting supplied by this interface. */
    default void hello() {
        System.out.println("Hello from FirstHello.");
    }

    public static void main(String[] args) {
        FirstHello obj = new FirstHello() {};
        obj.hello();
    }
}

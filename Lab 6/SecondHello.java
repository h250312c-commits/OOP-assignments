/** Second interface providing a default greeting for the conflict example. */
public interface SecondHello {
    /** Prints the greeting supplied by this interface. */
    default void hello() {
        System.out.println("Hello from SecondHello.");
    }

    public static void main(String[] args) {
        SecondHello obj = new SecondHello() {};
        obj.hello();
    }
}

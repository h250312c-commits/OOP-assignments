public interface SecondHello {
    default void hello() {
        System.out.println("Hello from SecondHello.");
    }
}

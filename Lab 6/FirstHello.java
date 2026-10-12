public interface FirstHello {
    default void hello() {
        System.out.println("Hello from FirstHello.");
    }
}

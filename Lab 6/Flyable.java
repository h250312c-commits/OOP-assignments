/** Capability contract for objects that can fly. */
public interface Flyable {
    /** Performs or describes flight for this implementation. */
    void fly();

    public static void main(String[] args) {
        Flyable flyer = () -> System.out.println("Generic flight demo.");
        flyer.fly();
    }
}

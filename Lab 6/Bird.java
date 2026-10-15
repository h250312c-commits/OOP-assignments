/** Flyable implementation that models a bird. */
public class Bird implements Flyable {
    @Override
    /** Describes how a bird flies. */
    public void fly() {
        System.out.println("Bird flies by flapping its wings.");
    }
}

/** Dog specialization that inherits the shared animal name. */
public class Dog extends Animal {
    /** Creates a dog with the supplied name. */
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Dog[name=%s]", name);
    }

    /** Demonstrates Dog subclassing Animal with super(name). */
    public static void main(String[] args) {
        System.out.println("Testing Dog:");
        Dog dog = new Dog("Buddy");
        System.out.println("Dog name: " + dog.getName());
    }
}

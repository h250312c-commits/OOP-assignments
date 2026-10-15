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
}

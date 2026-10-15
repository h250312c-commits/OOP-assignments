/** Base type for animals with a shared name. */
public class Animal {
    /** Name shared by animal subclasses. */
    private final String name;

    /** Creates an animal with its name. */
    public Animal(String name) {
        this.name = name;
    }

    /** Returns the animal's name. */
    public String getName() {
        return name;
    }
}

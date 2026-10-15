/** Base type for animals with a shared name. */
public class Animal {
    /** Name shared by animal subclasses. */
    protected final String name;

    /** Creates an animal with its name. */
    public Animal(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Animal name cannot be blank.");
        }
        this.name = name;
    }

    /** Returns the animal's name. */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Animal[name=%s]", name);
    }

    /** Demonstrates Animal initialization. */
    public static void main(String[] args) {
        System.out.println("Testing Animal:");
        Animal animal = new Animal("Leo");
        System.out.println("Animal name: " + animal.getName());
    }
}

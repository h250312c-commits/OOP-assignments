/** Base person model with a name, age, and display behavior. */
public class Person {
    /** Person's name, accessible to subclasses. */
    protected final String name;
    /** Person's age in years, accessible to subclasses. */
    protected final int age;

    /** Creates a person with the supplied name and age. */
    public Person(String name, int age) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.name = name;
        this.age = age;
    }

    /** Returns the person's name. */
    public String getName() {
        return name;
    }

    /** Returns the person's age in years. */
    public int getAge() {
        return age;
    }

    /** Prints the person's name and age. */
    public void display() {
        System.out.printf("Name: %s, age: %d%n", name, age);
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s, age=%d]", name, age);
    }

    /** Demonstrates Person display functionality. */
    public static void main(String[] args) {
        System.out.println("Testing Person:");
        Person person = new Person("Alex", 40);
        person.display();
    }
}

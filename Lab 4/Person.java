/** Base person model with a name, age, and display behavior. */
public class Person {
    /** Person's name, shared with subclasses. */
    private final String name;
    /** Person's age in years. */
    private final int age;

    /** Creates a person with the supplied name and age. */
    public Person(String name, int age) {
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
}

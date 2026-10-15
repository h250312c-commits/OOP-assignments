/** Person value that cannot be modified after its validated construction. */
public final class ImmutablePerson {
    /** Name fixed at construction time. */
    private final String name;
    /** Age fixed at construction time, in years. */
    private final int age;

    /** Creates a person with a nonblank name and non-negative age. */
    public ImmutablePerson(String name, int age) {
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
}

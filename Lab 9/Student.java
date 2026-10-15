/** Immutable student record with validated name and age components. */
public record Student(String name, int age) {
    /** Validates the record components before the record instance is created. */
    public Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Ava", 20);
        System.out.println("Student record: " + student);
        System.out.println("Name: " + student.name() + ", Age: " + student.age());
    }
}

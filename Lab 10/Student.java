/** Immutable student value with validated name and marks. */
public final class Student {
    private final String name;
    private final int marks;

    /** Creates a student with a nonblank name and marks between 0 and 100. */
    public Student(String name, int marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be blank.");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Student marks must be between 0 and 100.");
        }
        this.name = name;
        this.marks = marks;
    }

    public String name() {
        return name;
    }

    public int marks() {
        return marks;
    }

    public static void main(String[] args) {
        Student student = new Student("Bob", 92);
        System.out.printf("Student: %s, Marks: %d%n", student.name(), student.marks());
    }
}

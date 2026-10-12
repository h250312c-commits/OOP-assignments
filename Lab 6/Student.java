import java.util.Comparator;

public class Student implements Comparable<Student> {
    public static final Comparator<Student> BY_MARKS =
            Comparator.comparingInt(Student::getMarks).reversed()
                    .thenComparing(Student::getName);

    private final String name;
    private final int marks;

    public Student(String name, int marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

import java.util.Comparator;

/** Student value ordered by name, with an alternate marks-based ordering. */
public class Student implements Comparable<Student> {
    /** Sorts by marks descending and then by name ascending. */
    public static final Comparator<Student> BY_MARKS =
            Comparator.comparingInt(Student::getMarks).reversed()
                    .thenComparing(Student::getName);

    /** Name used for natural ordering and tie-breaking. */
    private final String name;
    /** Validated mark used by the alternate comparator. */
    private final int marks;

    /** Creates a student with a nonblank name and marks from 0 to 100. */
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

    /** Returns the student's name. */
    public String getName() {
        return name;
    }

    /** Returns the student's mark out of 100. */
    public int getMarks() {
        return marks;
    }

    @Override
    /** Compares students alphabetically by name for natural ordering. */
    public int compareTo(Student other) {
        return name.compareTo(other.name);
    }

    @Override
    /** Formats the name and mark as a concise display value. */
    public String toString() {
        return name + " (" + marks + ")";
    }
}

/** Student whose name and marks are validated on construction and update. */
public class Student {
    /** Current validated student name. */
    private String name;
    /** Current validated mark, constrained to the 0–100 scale. */
    private int marks;

    /** Creates a student after validating the initial details. */
    public Student(String name, int marks) {
        this.name = validateName(name);
        this.marks = validateMarks(marks);
    }

    /** Returns the student's name. */
    public String getName() {
        return name;
    }

    /** Replaces the name after checking that it is not blank. */
    public void setName(String name) {
        this.name = validateName(name);
    }

    /** Returns the student's marks out of 100. */
    public int getMarks() {
        return marks;
    }

    /** Replaces the marks after checking that they are within 0–100. */
    public void setMarks(int marks) {
        this.marks = validateMarks(marks);
    }

    /** Converts the current mark into the example's letter-grade scale. */
    public char getGrade() {
        if (marks >= 80) {
            return 'A';
        }
        if (marks >= 70) {
            return 'B';
        }
        if (marks >= 60) {
            return 'C';
        }
        return 'F';
    }

    /** Rejects missing or blank names before they enter the object state. */
    private static String validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        return name;
    }

    /** Rejects marks outside the inclusive 0–100 range. */
    private static int validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        return marks;
    }
}

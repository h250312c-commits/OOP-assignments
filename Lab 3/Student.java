public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = validateName(name);
        this.marks = validateMarks(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = validateName(name);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = validateMarks(marks);
    }

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

    private static String validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        return name;
    }

    private static int validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        return marks;
    }
}

public record Student(String name, int marks) {
    public Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be blank.");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Student marks must be between 0 and 100.");
        }
    }
}

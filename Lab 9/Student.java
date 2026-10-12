public record Student(String name, int age) {
    public Student {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}

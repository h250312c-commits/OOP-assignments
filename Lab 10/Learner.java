public record Learner(String name, int marks) {
    public Learner {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Learner name cannot be blank.");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Learner marks must be between 0 and 100.");
        }
    }

    public String gradeBand() {
        if (marks >= 80) {
            return "A";
        }
        if (marks >= 70) {
            return "B";
        }
        return "C";
    }
}

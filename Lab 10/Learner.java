/** Immutable learner value that derives a letter grade band from marks. */
public final class Learner {
    private final String name;
    private final int marks;

    /** Creates a learner with a nonblank name and marks between 0 and 100. */
    public Learner(String name, int marks) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Learner name cannot be blank.");
        }
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Learner marks must be between 0 and 100.");
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

    /** Returns A for 80+, B for 70–79, and C for lower valid marks. */
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

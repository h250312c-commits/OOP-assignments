/** Person specialization with an associated teaching subject. */
public class Teacher extends Person {
    /** Subject taught by this teacher. */
    private final String subject;

    /** Creates a teacher and initializes the inherited person details. */
    public Teacher(String name, int age, String subject) {
        super(name, age);
        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("Subject cannot be blank.");
        }
        this.subject = subject;
    }

    /** Returns the subject taught by this teacher. */
    public String getSubject() {
        return subject;
    }

    /** Displays the teacher's personal details and teaching subject. */
    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return String.format("Teacher[name=%s, age=%d, subject=%s]", getName(), getAge(), subject);
    }
}

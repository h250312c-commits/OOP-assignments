/** Person specialization with an associated teaching subject. */
public class Teacher extends Person {
    /** Subject taught by this teacher. */
    private final String subject;

    /** Creates a teacher and initializes the inherited person details. */
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    /** Returns the subject taught by this teacher. */
    public String getSubject() {
        return subject;
    }
}

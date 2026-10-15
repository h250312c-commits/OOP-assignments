/** Person specialization with an associated course. */
public class Student extends Person {
    /** Course in which the student is enrolled. */
    private final String course;

    /** Creates a student and initializes the inherited person details. */
    public Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    /** Returns the student's course. */
    public String getCourse() {
        return course;
    }
}

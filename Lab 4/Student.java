/** Person specialization with an associated course. */
public class Student extends Person {
    /** Course in which the student is enrolled. */
    private final String course;

    /** Creates a student and initializes the inherited person details. */
    public Student(String name, int age, String course) {
        super(name, age);
        if (course == null || course.isBlank()) {
            throw new IllegalArgumentException("Course cannot be blank.");
        }
        this.course = course;
    }

    /** Returns the student's course. */
    public String getCourse() {
        return course;
    }

    /** Displays the student's personal details and enrolled course. */
    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
    }

    @Override
    public String toString() {
        return String.format("Student[name=%s, age=%d, course=%s]", getName(), getAge(), course);
    }
}

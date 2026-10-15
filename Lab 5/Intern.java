/** Employee whose pay for the period is a fixed stipend. */
public class Intern extends Employee {
    /** Fixed pay amount for the represented period. */
    private final double stipend;

    /** Creates an intern with a finite, non-negative stipend. */
    public Intern(String name, double stipend) {
        super(name);
        if (!Double.isFinite(stipend) || stipend < 0) {
            throw new IllegalArgumentException("Stipend must be finite and non-negative.");
        }
        this.stipend = stipend;
    }

    /** Returns the intern's stipend. */
    @Override
    public double calculatePay() {
        return stipend;
    }

    public static void main(String[] args) {
        Intern intern = new Intern("Mia", 900.0);
        System.out.printf("%s (Intern) stipend: %.2f%n", intern.getName(), intern.calculatePay());
    }
}

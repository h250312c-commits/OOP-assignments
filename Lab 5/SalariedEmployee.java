/** Employee paid a fixed monthly salary. */
public class SalariedEmployee extends Employee {
    /** Fixed gross pay for one month. */
    private final double monthlySalary;

    /** Creates a salaried employee with a finite, non-negative monthly salary. */
    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        if (!Double.isFinite(monthlySalary) || monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary must be finite and non-negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    /** Returns the employee's monthly salary. */
    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee("Ava", 4000.0);
        System.out.printf("%s (Salaried) pay: %.2f%n", emp.getName(), emp.calculatePay());
    }
}

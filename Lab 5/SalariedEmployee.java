public class SalariedEmployee extends Employee {
    private final double monthlySalary;

    public SalariedEmployee(String name, double monthlySalary) {
        super(name);
        if (!Double.isFinite(monthlySalary) || monthlySalary < 0) {
            throw new IllegalArgumentException("Monthly salary must be finite and non-negative.");
        }
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}

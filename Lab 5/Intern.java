public class Intern extends Employee {
    private final double stipend;

    public Intern(String name, double stipend) {
        super(name);
        if (!Double.isFinite(stipend) || stipend < 0) {
            throw new IllegalArgumentException("Stipend must be finite and non-negative.");
        }
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }
}

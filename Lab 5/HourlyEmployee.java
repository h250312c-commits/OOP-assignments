public class HourlyEmployee extends Employee {
    private final double hourlyRate;
    private final double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        if (!Double.isFinite(hourlyRate) || hourlyRate < 0
                || !Double.isFinite(hoursWorked) || hoursWorked < 0) {
            throw new IllegalArgumentException("Hourly rate and hours must be finite and non-negative.");
        }
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

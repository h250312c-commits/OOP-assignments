/** Employee paid as hourly rate multiplied by hours worked. */
public class HourlyEmployee extends Employee {
    /** Earnings for one hour of work. */
    private final double hourlyRate;
    /** Number of hours included in the pay calculation. */
    private final double hoursWorked;

    /** Creates an hourly employee with a finite non-negative rate and hours. */
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        if (!Double.isFinite(hourlyRate) || hourlyRate < 0
                || !Double.isFinite(hoursWorked) || hoursWorked < 0) {
            throw new IllegalArgumentException("Hourly rate and hours must be finite and non-negative.");
        }
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /** Returns gross pay before any deductions. */
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

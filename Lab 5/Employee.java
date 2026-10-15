/** Base payroll type whose subclasses calculate pay differently. */
public abstract class Employee {
    /** Name displayed for this employee in payroll output. */
    private final String name;

    /** Creates an employee with a nonblank name. */
    protected Employee(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Employee name cannot be blank.");
        }
        this.name = name;
    }

    /** Returns the employee's name. */
    public String getName() {
        return name;
    }

    /** Calculates the employee's pay for the represented pay period. */
    public abstract double calculatePay();

    public static void main(String[] args) {
        Employee employee = new Employee("Demo Employee") {
            @Override
            public double calculatePay() {
                return 3500.0;
            }
        };
        System.out.printf("%s pay: %.2f%n", employee.getName(), employee.calculatePay());
    }
}

public class Employee {
    private static int nextEmployeeId = 1;

    private final int employeeId;
    private final String name;
    private final String department;
    private final double salary;

    public Employee(String name) {
        this(name, "Unassigned", 0.0);
    }

    public Employee(String name, String department) {
        this(name, department, 0.0);
    }

    public Employee(String name, String department, double salary) {
        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(Employee other) {
        this(other.name, other.department, other.salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %d, name: %s, department: %s, salary: %.2f",
                employeeId, name, department, salary);
    }
}

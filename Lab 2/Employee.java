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
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("Department cannot be blank.");
        }
        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException("Salary must be finite and non-negative.");
        }

        this.employeeId = nextEmployeeId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(Employee employee) {
        this(requireEmployee(employee).name, employee.department, employee.salary);
    }

    private static Employee requireEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee to copy cannot be null.");
        }
        return employee;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Employee ID: %d, name: %s, department: %s, salary: %.2f",
                employeeId, name, department, salary);
    }
}

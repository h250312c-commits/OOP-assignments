public abstract class Employee {
    private final String name;

    protected Employee(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Employee name cannot be blank.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();
}

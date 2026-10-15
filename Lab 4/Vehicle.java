/** Base vehicle model used to demonstrate constructor chaining. */
public class Vehicle {
    /** Model identifier shared with vehicle specializations. */
    protected final String model;

    /** Creates a vehicle with its model identifier. */
    public Vehicle(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be blank.");
        }
        System.out.println("Vehicle constructor");
        this.model = model;
    }

    /** Returns the vehicle's model identifier. */
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("Vehicle[model=%s]", model);
    }

    /** Demonstrates Vehicle creation. */
    public static void main(String[] args) {
        System.out.println("Testing Vehicle:");
        Vehicle vehicle = new Vehicle("Sedan-V1");
        System.out.println("Model: " + vehicle.getModel());
    }
}

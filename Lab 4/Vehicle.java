/** Base vehicle model used to demonstrate constructor chaining. */
public class Vehicle {
    /** Model identifier shared with vehicle specializations. */
    private final String model;

    /** Creates a vehicle with its model identifier. */
    public Vehicle(String model) {
        System.out.println("Vehicle constructor");
        this.model = model;
    }

    /** Returns the vehicle's model identifier. */
    public String getModel() {
        return model;
    }
}

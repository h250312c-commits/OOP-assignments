public class Vehicle {
    private final String model;

    public Vehicle(String model) {
        System.out.println("Vehicle constructor");
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

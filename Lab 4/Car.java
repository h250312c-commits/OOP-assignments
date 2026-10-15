/** Vehicle specialization that adds a door count. */
public class Car extends Vehicle {
    /** Number of doors fitted to the car. */
    protected final int doors;

    /** Creates a car and initializes its vehicle details first. */
    public Car(String model, int doors) {
        super(model);
        if (doors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive.");
        }
        System.out.println("Car constructor");
        this.doors = doors;
    }

    /** Returns the number of doors. */
    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return String.format("Car[model=%s, doors=%d]", model, doors);
    }

    /** Demonstrates Car constructor chaining from Vehicle. */
    public static void main(String[] args) {
        System.out.println("Testing Car:");
        Car car = new Car("Sedan", 4);
        System.out.println("Car model: " + car.getModel() + ", doors: " + car.getDoors());
    }
}

/** Vehicle specialization that adds a door count. */
public class Car extends Vehicle {
    /** Number of doors fitted to the car. */
    private final int doors;

    /** Creates a car and initializes its vehicle details first. */
    public Car(String model, int doors) {
        super(model);
        System.out.println("Car constructor");
        this.doors = doors;
    }

    /** Returns the number of doors. */
    public int getDoors() {
        return doors;
    }
}

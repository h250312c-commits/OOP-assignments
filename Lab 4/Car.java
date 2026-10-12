public class Car extends Vehicle {
    private final int doors;

    public Car(String model, int doors) {
        super(model);
        System.out.println("Car constructor");
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }
}

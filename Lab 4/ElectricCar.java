/** Car specialization with an electric battery capacity. */
public class ElectricCar extends Car {
    /** Energy capacity of the battery, in kilowatt-hours. */
    protected final int batteryCapacityKwh;

    /** Creates an electric car with its vehicle, door, and battery details. */
    public ElectricCar(String model, int doors, int batteryCapacityKwh) {
        super(model, doors);
        if (batteryCapacityKwh <= 0) {
            throw new IllegalArgumentException("Battery capacity must be positive.");
        }
        System.out.println("ElectricCar constructor");
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    /** Returns battery capacity in kilowatt-hours. */
    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }

    @Override
    public String toString() {
        return String.format("ElectricCar[model=%s, doors=%d, battery=%d kWh]",
                model, doors, batteryCapacityKwh);
    }

    /** Demonstrates ElectricCar 3-level constructor chaining. */
    public static void main(String[] args) {
        System.out.println("Testing ElectricCar:");
        ElectricCar ev = new ElectricCar("Tesla Model 3", 4, 75);
        System.out.println(ev);
    }
}

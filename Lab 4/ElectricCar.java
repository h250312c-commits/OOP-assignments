/** Car specialization with an electric battery capacity. */
public class ElectricCar extends Car {
    /** Energy capacity of the battery, in kilowatt-hours. */
    private final int batteryCapacityKwh;

    /** Creates an electric car with its vehicle, door, and battery details. */
    public ElectricCar(String model, int doors, int batteryCapacityKwh) {
        super(model, doors);
        System.out.println("ElectricCar constructor");
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    /** Returns battery capacity in kilowatt-hours. */
    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }
}

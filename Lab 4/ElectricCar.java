public class ElectricCar extends Car {
    private final int batteryCapacityKwh;

    public ElectricCar(String model, int doors, int batteryCapacityKwh) {
        super(model, doors);
        System.out.println("ElectricCar constructor");
        this.batteryCapacityKwh = batteryCapacityKwh;
    }

    public int getBatteryCapacityKwh() {
        return batteryCapacityKwh;
    }
}

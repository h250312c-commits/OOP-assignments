/** Represents a car and provides a simple age check. */
public class Car {
    private final String brand;
    private final int year;
    private final double mileage;

    public Car(String brand, int year, double mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    /** Prints this car's details. */
    public void display() {
        System.out.printf("%s (%d), %.1f miles%n", brand, year, mileage);
    }

    /** Returns true if the car is more than 25 years old. */
    public boolean isAntique() {
        return java.time.Year.now().getValue() - year > 25;
    }
}

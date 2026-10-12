package Lab1;

import java.time.Year;

public class Car {
    private final String brand;
    private final int year;
    private final double mileage;

    public Car(String brand, int year, double mileage) {
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public boolean isAntique() {
        return Year.now().getValue() - year > 25;
    }

    public void display() {
        System.out.printf("%s (%d), %.1f miles, antique: %s%n",
                brand, year, mileage, isAntique());
    }
}

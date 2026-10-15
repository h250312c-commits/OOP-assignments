/** Stores a temperature in Kelvin and exposes Celsius and Fahrenheit conversions. */
public class Temperature {
    /** Canonical temperature value, stored in Kelvin. */
    private final double kelvin;

    /** Creates a temperature at or above absolute zero. */
    public Temperature(double kelvin) {
        if (!Double.isFinite(kelvin) || kelvin < 0) {
            throw new IllegalArgumentException("Temperature must be finite and at or above absolute zero.");
        }
        this.kelvin = kelvin;
    }

    /** Returns this temperature converted to Celsius. */
    public double getCelsius() {
        return kelvin - 273.15;
    }

    /** Returns this temperature converted to Fahrenheit. */
    public double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }

    /** Demonstrates Temperature kelvin storage and conversions. */
    public static void main(String[] args) {
        System.out.println("Testing Temperature (Kelvin):");
        Temperature temp = new Temperature(300.0);
        System.out.printf("300.0 K = %.2f C, %.2f F%n", temp.getCelsius(), temp.getFahrenheit());
        try {
            new Temperature(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Expected negative Kelvin rejection: " + e.getMessage());
        }
    }
}

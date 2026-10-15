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
}

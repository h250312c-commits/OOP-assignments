public final class Temperature {
    private final double celsius;

    private Temperature(double celsius) {
        if (!Double.isFinite(celsius) || celsius < -273.15) {
            throw new IllegalArgumentException(
                    "Temperature must be finite and at or above absolute zero.");
        }
        this.celsius = celsius;
    }

    public static Temperature fromCelsius(double celsius) {
        return new Temperature(celsius);
    }

    public static Temperature fromFahrenheit(double fahrenheit) {
        if (!Double.isFinite(fahrenheit)) {
            throw new IllegalArgumentException("Temperature must be finite.");
        }
        return new Temperature((fahrenheit - 32.0) * 5.0 / 9.0);
    }

    public double toCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    /** Demonstrates static factory methods for Temperature. */
    public static void main(String[] args) {
        System.out.println("Testing Temperature (static factories):");
        Temperature c = Temperature.fromCelsius(25.0);
        System.out.printf("25.0 C = %.1f F%n", c.toFahrenheit());
        Temperature f = Temperature.fromFahrenheit(77.0);
        System.out.printf("77.0 F = %.1f C%n", f.toCelsius());
    }
}

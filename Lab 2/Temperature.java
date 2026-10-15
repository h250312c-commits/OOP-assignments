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
}

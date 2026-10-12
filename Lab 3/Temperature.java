public class Temperature {
    private final double kelvin;

    public Temperature(double kelvin) {
        if (!Double.isFinite(kelvin) || kelvin < 0) {
            throw new IllegalArgumentException("Temperature must be finite and at or above absolute zero.");
        }
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return kelvin - 273.15;
    }

    public double getFahrenheit() {
        return getCelsius() * 9 / 5 + 32;
    }
}

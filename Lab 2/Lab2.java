public class Lab2 {
    public static void main(String[] args) {
        System.out.println("1-2. Circles");
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(2.5);
        System.out.printf("Default radius: %.1f, custom radius: %.1f, circles created: %d%n",
                defaultCircle.getRadius(), customCircle.getRadius(), Circle.getCircleCount());

        System.out.println("\n3. Employees");
        Employee employee1 = new Employee("Ava");
        Employee employee2 = new Employee("Noah", "Engineering");
        Employee employee3 = new Employee("Mia", "Finance", 65000);
        Employee employeeCopy = new Employee(employee3);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println("Copy: " + employeeCopy);

        System.out.println("\n4. Initialization block order");
        System.out.println("Prediction: static blocks run once in source order; instance blocks run "
                + "in source order before each constructor.");
        new InitializationOrderDemo();
        new InitializationOrderDemo();

        System.out.println("\n5. Temperature factories");
        Temperature roomTemperature = Temperature.fromCelsius(20);
        Temperature freezingPoint = Temperature.fromFahrenheit(32);
        System.out.printf("20 C = %.1f F; 32 F = %.1f C%n",
                roomTemperature.toFahrenheit(), freezingPoint.toCelsius());
        System.out.println("Named factories make the input unit clear at the call site; "
                + "constructors cannot be overloaded by parameter name when both take a double.");
    }
}

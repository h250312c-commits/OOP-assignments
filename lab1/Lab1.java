package Lab1;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("1-2. Cars");
        Car[] cars = {
                new Car("Toyota", 1998, 125000),
                new Car("Honda", 2012, 84000),
                new Car("Ford", 2020, 32000)
        };
        for (Car car : cars) {
            car.display();
        }

        System.out.println("\n3. Rectangles");
        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(4, 5),
                new Rectangle(7, 2),
                new Rectangle(6, 6),
                new Rectangle(9, 3)
        };
        Rectangle largest = rectangles[0];
        for (Rectangle rectangle : rectangles) {
            System.out.printf("Width: %.1f, height: %.1f, area: %.1f, perimeter: %.1f%n",
                    rectangle.width, rectangle.height, rectangle.area(), rectangle.perimeter());
            if (rectangle.area() > largest.area()) {
                largest = rectangle;
            }
        }
        System.out.printf("Largest rectangle: %.1f x %.1f, area: %.1f%n",
                largest.width, largest.height, largest.area());

        System.out.println("\n4. Rectangle reference assignment");
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = r1;
        r2.width = 10;
        System.out.printf("r1.width after changing r2.width: %.1f%n", r1.width);

        System.out.println("\n5. Person address");
        Person person = new Person("Alex", new Address("Harare"));
        System.out.println("Person's city: " + person.address.city);

        Person personWithoutAddress = new Person("Sam", null);
        try {
            System.out.println("Person's city: " + personWithoutAddress.address.city);
        } catch (NullPointerException exception) {
            System.out.println("Accessing personWithoutAddress.address.city throws NullPointerException "
                    + "because address is null.");
        }
    }
}

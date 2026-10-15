/** Runs the Lab 1 class, array, reference, and composition examples. */
public class Lab1 {
    public static void main(String[] args) {
        System.out.println("1-2. Cars");
        Car[] cars = {
                new Car("Toyota", 2000, 120000),
                new Car("Honda", 2015, 75000),
                new Car("Ford", 1995, 180000)
        };
        for (Car car : cars) {
            car.display();
            System.out.println("Antique: " + car.isAntique());
        }

        System.out.println("\n3. Rectangles");
        Rectangle[] rectangles = {
                new Rectangle(3, 4),
                new Rectangle(5, 2),
                new Rectangle(6, 7),
                new Rectangle(8, 3),
                new Rectangle(4, 4)
        };
        Rectangle largest = rectangles[0];
        for (Rectangle rectangle : rectangles) {
            System.out.printf("Width: %.1f, height: %.1f, area: %.1f, perimeter: %.1f%n",
                    rectangle.width, rectangle.height, rectangle.area(), rectangle.perimeter());
            if (rectangle.area() > largest.area()) {
                largest = rectangle;
            }
        }
        System.out.printf("Largest area: %.1f (%.1f x %.1f)%n",
                largest.area(), largest.width, largest.height);

        System.out.println("\n4. Object reference");
        Rectangle r1 = new Rectangle(2, 5);
        Rectangle r2 = r1;
        r2.width = 10;
        System.out.println("r1.width after changing r2.width: " + r1.width);

        System.out.println("\n5. Person and address");
        Person person = new Person("Angella", new Address("Harare"));
        System.out.println(person.getName() + " lives in " + person.getAddress().getCity());

        Person personWithoutAddress = new Person("Bruce", null);
        try {
            System.out.println(personWithoutAddress.getAddress().getCity());
        } catch (NullPointerException exception) {
            System.out.println("A null address causes a NullPointerException when getCity() is called.");
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Runs the Lab 6 examples for abstraction, interfaces, and comparators. */
public class Lab6 {
    /** Runs each Lab 6 demonstration. */
    public static void main(String[] args) {
        System.out.println("1. Abstract shapes");
        List<Shape> shapes = List.of(new Circle(2), new Rectangle(4, 3), new Square(3));
        for (Shape shape : shapes) {
            System.out.printf("%s: area %.2f, perimeter %.2f%n",
                    shape.getClass().getSimpleName(), shape.area(), shape.perimeter());
        }

        System.out.println("\n2. Flyable interface");
        Flyable[] flyers = {new Bird(), new Aeroplane()};
        for (Flyable flyer : flyers) {
            flyer.fly();
        }

        System.out.println("\n3. Abstract accounts");
        Account savings = new SavingsAccount(500);
        Account current = new CurrentAccount(500);
        savings.deposit(100);
        current.deposit(100);
        System.out.printf("Savings balance: %.2f, monthly fee: %.2f%n",
                savings.getBalance(), savings.monthlyFee());
        System.out.printf("Current balance: %.2f, monthly fee: %.2f%n",
                current.getBalance(), current.monthlyFee());

        System.out.println("\n4. Student sorting");
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Zara", 88),
                new Student("Amir", 95),
                new Student("Bea", 95),
                new Student("Liam", 72)));
        students.sort(null);
        System.out.println("By name (natural order): " + students);
        students.sort(Student.BY_MARKS);
        System.out.println("By marks descending, then name: " + students);

        System.out.println("\n5. Interface default-method conflict");
        new HelloGreeter().hello();
    }
}

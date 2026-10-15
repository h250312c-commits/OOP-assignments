/** Demonstrates runtime polymorphism through a superclass array. */
public class Shapes {
    public static void run() {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8),
                new Square(2)
        };

        System.out.println("\nRuntime polymorphism (overriding and upcasting)");
        double total = 0;
        for (Shape shape : shapes) {
            System.out.printf("%-10s area = %.2f%n", shape.name(), shape.area());
            total += shape.area();
        }
        System.out.printf("Total area = %.2f%n", total);
        System.out.println("Square works with the same loop; adding a shape does not "
                + "require changing the processing code.");
    }

    public static void main(String[] args) {
        run();
    }
}

abstract class Shape {
    String name() {
        return "Generic shape";
    }

    abstract double area();
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    String name() {
        return "Circle";
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String name() {
        return "Rectangle";
    }

    @Override
    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    String name() {
        return "Triangle";
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    String name() {
        return "Square";
    }

    @Override
    double area() {
        return side * side;
    }
}

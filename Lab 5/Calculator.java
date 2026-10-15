/** Demonstrates compile-time polymorphism through method overloading. */
public class Calculator {
    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public String add(String first, String second) {
        return first + second;
    }

    public static void run() {
        Calculator calculator = new Calculator();
        System.out.println("0. Compile-time polymorphism (overloading)");
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2.5, 3.5));
        System.out.println(calculator.add("Java", "OOP"));
        System.out.println(calculator.add(2, 3.5));
    }

    public static void main(String[] args) {
        run();
    }
}

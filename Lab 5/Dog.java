/** Dog implementation used to demonstrate overriding and safe downcasting. */
public class Dog extends Animal {
    public String type = "Dog";

    @Override
    public String sound() {
        return "Woof";
    }

    public void fetch() {
        System.out.println("Fetching...");
    }

    public static void info() {
        System.out.println("Dog info");
    }
}

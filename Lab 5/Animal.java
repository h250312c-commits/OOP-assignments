/** Base animal type whose sound can be specialized by subclasses. */
public class Animal {
    public String type = "Animal";

    /** Returns a generic sound for an unspecified animal. */
    public String sound() {
        return "Some animal sound";
    }

    public void speak() {
        System.out.println(sound());
    }

    public static void info() {
        System.out.println("Animal info");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Type: " + animal.type);
        animal.speak();
        Animal.info();
    }
}

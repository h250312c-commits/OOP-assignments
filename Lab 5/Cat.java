/** Animal specialization that makes a cat sound. */
public class Cat extends Animal {
    /** Returns the sound associated with a cat. */
    @Override
    public String sound() {
        return "Meow";
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat sound: " + cat.sound());
        cat.speak();
    }
}

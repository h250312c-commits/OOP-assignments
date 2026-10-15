/** Animal specialization that makes a cow sound. */
public class Cow extends Animal {
    /** Returns the sound associated with a cow. */
    @Override
    public String sound() {
        return "Moo";
    }

    public static void main(String[] args) {
        Cow cow = new Cow();
        System.out.println("Cow sound: " + cow.sound());
        cow.speak();
    }
}

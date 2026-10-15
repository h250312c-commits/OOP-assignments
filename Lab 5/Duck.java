/** Animal specialization that makes a duck sound. */
public class Duck extends Animal {
    /** Returns the sound associated with a duck. */
    @Override
    public String sound() {
        return "Quack";
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        System.out.println("Duck sound: " + duck.sound());
        duck.speak();
    }
}

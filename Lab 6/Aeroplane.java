/** Flyable implementation that models an aeroplane. */
public class Aeroplane implements Flyable {
    @Override
    /** Describes how an aeroplane stays aloft. */
    public void fly() {
        System.out.println("Aeroplane flies using lift from its wings.");
    }

    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane();
        plane.fly();
    }
}

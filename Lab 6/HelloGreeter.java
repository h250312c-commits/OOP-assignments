/** Resolves two inherited default methods by explicitly invoking both. */
public class HelloGreeter implements FirstHello, SecondHello {
    @Override
    /** Calls both interface greetings and then prints a resolution message. */
    public void hello() {
        FirstHello.super.hello();
        SecondHello.super.hello();
        System.out.println("Conflict resolved in HelloGreeter.");
    }

    public static void main(String[] args) {
        HelloGreeter greeter = new HelloGreeter();
        greeter.hello();
    }
}

public class HelloGreeter implements FirstHello, SecondHello {
    @Override
    public void hello() {
        FirstHello.super.hello();
        SecondHello.super.hello();
        System.out.println("Conflict resolved in HelloGreeter.");
    }
}

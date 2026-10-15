/** Common contract for payment methods that can process a transaction. */
public interface Payment {
    /** Performs this payment using the implementation's specific mechanism. */
    void process();

    public static void main(String[] args) {
        System.out.println("Payment interface contract demo.");
        Payment payment = () -> System.out.println("Processing payment via Payment interface.");
        payment.process();
    }
}

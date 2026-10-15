/** Common contract for payment methods that can process a transaction. */
public interface Payment {
    /** Performs this payment using the implementation's specific mechanism. */
    void process();
}

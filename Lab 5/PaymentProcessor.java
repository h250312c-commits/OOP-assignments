/** Demonstrates explicit type dispatch and interface-based payment dispatch. */
public class PaymentProcessor {
    /** Routes a payment by its concrete supported type. */
    public void pay(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("Payment cannot be null.");
        }

        if (payment instanceof CardPayment cardPayment) {
            cardPayment.charge();
        } else if (payment instanceof MobileMoneyPayment mobileMoneyPayment) {
            mobileMoneyPayment.transfer();
        } else {
            throw new IllegalArgumentException("Unsupported payment type: "
                    + payment.getClass().getName());
        }
    }

    /** Processes any supported payment through its interface contract. */
    public void payPolymorphically(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("Payment cannot be null.");
        }
        payment.process();
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Payment card = new CardPayment("1234");
        Payment mobile = new MobileMoneyPayment("+263771234567");
        System.out.println("Processing via pay():");
        processor.pay(card);
        processor.pay(mobile);
        System.out.println("Processing via payPolymorphically():");
        processor.payPolymorphically(card);
        processor.payPolymorphically(mobile);
    }
}

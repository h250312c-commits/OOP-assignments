public class PaymentProcessor {
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

    public void payPolymorphically(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("Payment cannot be null.");
        }
        payment.process();
    }
}

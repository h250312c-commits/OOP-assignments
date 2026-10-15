/** Payment method that transfers funds using a mobile-money phone number. */
public class MobileMoneyPayment implements Payment {
    /** Recipient or payer number used for the transfer message. */
    private final String phoneNumber;

    /** Creates a mobile-money payment for a nonblank phone number. */
    public MobileMoneyPayment(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        this.phoneNumber = phoneNumber;
    }

    /** Prints a transfer message for this payment. */
    public void transfer() {
        System.out.println("Processing mobile-money payment for " + phoneNumber + ".");
    }

    /** Processes this payment through its mobile-money transfer operation. */
    @Override
    public void process() {
        transfer();
    }

    public static void main(String[] args) {
        MobileMoneyPayment payment = new MobileMoneyPayment("+263771234567");
        payment.process();
    }
}

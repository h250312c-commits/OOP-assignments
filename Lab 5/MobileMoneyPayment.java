public class MobileMoneyPayment implements Payment {
    private final String phoneNumber;

    public MobileMoneyPayment(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }
        this.phoneNumber = phoneNumber;
    }

    public void transfer() {
        System.out.println("Processing mobile-money payment for " + phoneNumber + ".");
    }

    @Override
    public void process() {
        transfer();
    }
}

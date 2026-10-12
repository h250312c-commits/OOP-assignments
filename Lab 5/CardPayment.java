public class CardPayment implements Payment {
    private final String lastFourDigits;

    public CardPayment(String lastFourDigits) {
        if (lastFourDigits == null || !lastFourDigits.matches("\\d{4}")) {
            throw new IllegalArgumentException("Card identifier must contain exactly four digits.");
        }
        this.lastFourDigits = lastFourDigits;
    }

    public void charge() {
        System.out.println("Processing card payment ending in " + lastFourDigits + ".");
    }

    @Override
    public void process() {
        charge();
    }
}

/** Payment method that exposes only the final four card digits. */
public class CardPayment implements Payment {
    /** The safe-to-display suffix identifying the card. */
    private final String lastFourDigits;

    /** Creates a card payment with exactly four identifying digits. */
    public CardPayment(String lastFourDigits) {
        if (lastFourDigits == null || !lastFourDigits.matches("\\d{4}")) {
            throw new IllegalArgumentException("Card identifier must contain exactly four digits.");
        }
        this.lastFourDigits = lastFourDigits;
    }

    /** Prints a charge message without revealing the full card number. */
    public void charge() {
        System.out.println("Processing card payment ending in " + lastFourDigits + ".");
    }

    /** Processes this payment through its card-specific charge operation. */
    @Override
    public void process() {
        charge();
    }

    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment("1234");
        cardPayment.process();
    }
}

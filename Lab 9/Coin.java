import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Coin denominations and a dynamic-programming change-making operation. */
public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    /** Denominations considered largest-first when equal solutions are possible. */
    private static final Coin[] DESCENDING_VALUES = {
            QUARTER, DIME, NICKEL, PENNY
    };

    /** Value of this denomination in cents. */
    private final int value;

    /** Associates the denomination with its value in cents. */
    Coin(int value) {
        this.value = value;
    }

    /** Returns this denomination's value in cents. */
    public int getValue() {
        return value;
    }

    /** Returns an immutable minimum-length coin combination for the amount in cents. */
    public static List<Coin> fewestCoins(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        int[] minimumCounts = new int[amount + 1];
        Coin[] lastCoin = new Coin[amount + 1];

        // Record the fewest coins for each smaller amount, and which coin led to that result.
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            minimumCounts[currentAmount] = Integer.MAX_VALUE;
            for (Coin coin : DESCENDING_VALUES) {
                if (coin.value <= currentAmount
                        && minimumCounts[currentAmount - coin.value] != Integer.MAX_VALUE
                        && minimumCounts[currentAmount - coin.value] + 1 < minimumCounts[currentAmount]) {
                    minimumCounts[currentAmount] = minimumCounts[currentAmount - coin.value] + 1;
                    lastCoin[currentAmount] = coin;
                }
            }
        }

        List<Coin> result = new ArrayList<>(minimumCounts[amount]);
        // Follow the recorded choices backwards to reconstruct the selected coins.
        int remaining = amount;
        while (remaining > 0) {
            Coin coin = lastCoin[remaining];
            result.add(coin);
            remaining -= coin.value;
        }
        return Collections.unmodifiableList(result);
    }

    public static void main(String[] args) {
        int amount = 63;
        List<Coin> coins = fewestCoins(amount);
        System.out.println("Fewest coins for " + amount + " cents: " + coins + " (" + coins.size() + " coins)");
    }
}

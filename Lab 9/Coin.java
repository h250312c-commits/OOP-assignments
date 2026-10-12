import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUARTER(25);

    private static final Coin[] DESCENDING_VALUES = {
            QUARTER, DIME, NICKEL, PENNY
    };

    private final int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<Coin> fewestCoins(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        int[] minimumCounts = new int[amount + 1];
        Coin[] lastCoin = new Coin[amount + 1];

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
        int remaining = amount;
        while (remaining > 0) {
            Coin coin = lastCoin[remaining];
            result.add(coin);
            remaining -= coin.value;
        }
        return Collections.unmodifiableList(result);
    }
}

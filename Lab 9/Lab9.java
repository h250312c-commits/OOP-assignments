import java.util.HashSet;
import java.util.Set;

public class Lab9 {
    public static void main(String[] args) {
        System.out.println("1. Level enum");
        for (Level level : Level.values()) {
            System.out.println(level + ": " + adviceFor(level));
        }

        System.out.println("\n2. Student record");
        Student first = new Student("Ava", 20);
        Student same = new Student("Ava", 20);
        System.out.println(first);
        System.out.println("Equal records: " + first.equals(same));
        System.out.println("Student name: " + first.name());

        System.out.println("\n3. Book equality in a HashSet");
        Set<Book> books = new HashSet<>();
        System.out.println("First insertion: "
                + books.add(new Book("978-0134685991", "Effective Java")));
        System.out.println("Duplicate ISBN insertion: "
                + books.add(new Book("978-0134685991", "Another title")));
        System.out.println("Books in set: " + books);

        System.out.println("\n4. Custom linked list for-each");
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("\n5. Fewest coins");
        int amount = 63;
        System.out.println(amount + " cents: " + Coin.fewestCoins(amount)
                + " (" + Coin.fewestCoins(amount).size() + " coins)");
    }

    private static String adviceFor(Level level) {
        return switch (level) {
            case LOW -> "Proceed at a relaxed pace.";
            case MEDIUM -> "Stay attentive and prepare.";
            case HIGH -> "Take immediate action.";
        };
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Lab8 {
    public static void main(String[] args) {
        System.out.println("1. ArrayList calculations");
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(12, 4, 19, 7, 2, 15, 8, 3, 11, 6));
        int sum = 0;
        int maximum = numbers.get(0);
        for (int number : numbers) {
            sum += number;
            maximum = Math.max(maximum, number);
        }
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + maximum);
        ArrayList<Integer> reversed = new ArrayList<>(numbers);
        java.util.Collections.reverse(reversed);
        System.out.println("Reverse: " + reversed);

        System.out.println("\n2. Unique names");
        List<String> names = Arrays.asList("Ava", "Noah", "Ava", "Mia", "Noah", "Liam");
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("Names without duplicates: " + uniqueNames);

        System.out.println("\n3. Generic stack");
        GenericStack<String> stack = new GenericStack<>();
        stack.push("first");
        stack.push("second");
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Still has items: " + !stack.isEmpty());

        System.out.println("\n4. Word frequencies");
        System.out.print("Enter a paragraph (one line): ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextLine()) {
                System.out.println("No paragraph was provided.");
                return;
            }
            printWordFrequencies(scanner.nextLine());
        }

        System.out.println("\n5. Generic bubble sort");
        Integer[] integerValues = {5, 1, 4, 2, 8};
        String[] stringValues = {"pear", "apple", "orange", "banana"};
        BubbleSorter.bubbleSort(integerValues);
        BubbleSorter.bubbleSort(stringValues);
        System.out.println("Sorted integers: " + Arrays.toString(integerValues));
        System.out.println("Sorted strings: " + Arrays.toString(stringValues));
    }

    private static void printWordFrequencies(String paragraph) {
        Map<String, Integer> frequencies = new TreeMap<>();
        String[] words = paragraph.toLowerCase().split("[^\\p{L}\\p{N}]+");
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencies.merge(word, 1, Integer::sum);
            }
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencies.entrySet());
        sortedEntries.sort(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey()));

        if (sortedEntries.isEmpty()) {
            System.out.println("No words found.");
            return;
        }
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

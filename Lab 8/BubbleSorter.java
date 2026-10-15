/** Utility for sorting arrays in place with the bubble-sort algorithm. */
public final class BubbleSorter {
    /** Prevents instantiation of this static utility class. */
    private BubbleSorter() {
    }

    /** Sorts comparable values ascending and stops early when a pass makes no swaps. */
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        for (int end = arr.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    T temporary = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temporary;
                    swapped = true;
                }
            }
            if (!swapped) {
                // A pass with no exchanges means the remaining prefix is already ordered.
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 1, 4, 2, 8};
        String[] words = {"pear", "apple", "orange", "banana"};
        bubbleSort(nums);
        bubbleSort(words);
        System.out.println("Sorted integers: " + java.util.Arrays.toString(nums));
        System.out.println("Sorted strings: " + java.util.Arrays.toString(words));
    }
}

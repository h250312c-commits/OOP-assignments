public final class BubbleSorter {
    private BubbleSorter() {
    }

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
                break;
            }
        }
    }
}

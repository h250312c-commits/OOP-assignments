# Lab 8 Record

## 1. ArrayList calculations

Stored ten integers in an `ArrayList`, then calculated their sum and maximum.
A copied list was reversed and printed so the original order remains available.

## 2. Removing duplicate names

Constructed a `LinkedHashSet` from the list of names. A set keeps only one copy
of each name, and `LinkedHashSet` preserves the order of first appearance.

## 3. Generic stack

`GenericStack<T>` stores values in a private `ArrayList<T>`. `push` adds to the
top, while `pop` removes and returns the top element. `peek` returns the top
without removing it, and `isEmpty` checks whether the stack contains elements.
Calling `pop` or `peek` on an empty stack throws `NoSuchElementException`.

## 4. Word frequency

The program reads one paragraph line, lowercases it, splits it into words,
and counts words in a `Map`. It prints entries sorted by frequency descending;
words with the same count are sorted alphabetically for consistent output.

## 5. Generic bubble sort

`BubbleSorter.bubbleSort(T[] arr)` accepts arrays whose element type implements
`Comparable<T>`. The `Integer[]` and `String[]` examples are sorted in natural
ascending order.

The method cannot accept `int[]` because Java generic type parameters work with
reference types, not primitive types. `int` does not implement `Comparable`;
the wrapper type `Integer` does. Use `Integer[]` for this generic method, or
write a separate overload specifically for `int[]`.

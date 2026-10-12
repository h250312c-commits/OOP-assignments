# Lab 9 Record

## 1. Level enum and switch

`Level` restricts values to `LOW`, `MEDIUM`, and `HIGH`. The switch expression
provides advice for every enum value.

## 2. Student record

The `Student` record stores `name` and `age` and automatically provides
component accessors, `equals`, `hashCode`, and `toString`. Two records with the
same component values compare equal, and `name()` reads the name component.

## 3. Book equality and HashSet

`Book.equals()` and `hashCode()` use the ISBN. A `HashSet<Book>` therefore
rejects another book with the same ISBN, even if its title is different.

## 4. Linked list and iterator

`CustomLinkedList<T>` uses a private static generic `Node` for its internal
links. Its non-static inner `ListIterator` walks those nodes and implements
`Iterator<T>`. Implementing `Iterable<T>` lets the list be used in a for-each
loop.

## 5. Fewest coins

`Coin.fewestCoins(int)` uses dynamic programming to find a minimum-size
combination and returns the selected coins. Dynamic programming avoids
assuming a greedy strategy is optimal for any possible set of denominations.
For 63 cents, it returns two quarters, one dime, and three pennies (six coins).

# Lab 3 Record

## 1-2. Student validation and grade

`Student` keeps `name` and `marks` private. The marks setter accepts only values
from 0 through 100 and throws `IllegalArgumentException` for invalid marks.
`getGrade()` calculates the grade from the current marks without storing a
separate grade field: A is 80-100, B is 70-79, C is 60-69, and F is below 60.

## 3. Bank account transaction history

`BankAccount` appends a description for each successful or rejected transaction.
`getTransactionHistory()` returns an unmodifiable copy rather than the internal
list. Callers cannot alter the account's history, and a previously returned
snapshot does not change when later transactions occur.

## 4. Immutable person

`ImmutablePerson` is `final` so subclasses cannot add behavior that undermines
its immutability. Its fields are `private final`, so they can only be assigned
during construction and cannot be accessed or changed directly from outside.
It has no setters, and its getters return immutable values (`String` and
primitive `int`). Constructor validation ensures each instance starts in a
valid state.

## 5. Temperature

`Temperature` stores its value in kelvin and computes Celsius and Fahrenheit
when requested. Its constructor rejects non-finite values and values below
0 K (absolute zero). Callers use `getCelsius()` and `getFahrenheit()` instead
of depending on the internal representation. The implementation could later
store Celsius internally and convert to Fahrenheit from there without changing
these public getter methods, so existing callers would continue to work.

# Lab 7 Record

## 1. Scanner input and division

The program reads two integers with `Scanner`. `InputMismatchException` is
caught when either input is not an integer, and `ArithmeticException` is
caught when the divisor is zero.

## 2. Array access

`printArrayElement()` accesses the requested index inside a `try` block and
catches `ArrayIndexOutOfBoundsException` to report an invalid index.

## 3. Checked age exception

`InvalidAgeException` extends `Exception`, making it checked. The
`validateAge(int)` method throws it for ages below 0 or above 120. Callers
must catch it or declare it.

## 4. Bank account withdrawal

For this exercise, `BankAccount` in Lab 3 was changed so `withdraw()` throws
the checked `InsufficientFundsException` rather than returning `false` when
there is not enough balance. The account still records the rejected
transaction, and the Lab 3 demo handles the exception.

A checked exception forces callers to handle or declare insufficient funds,
making the failure difficult to ignore and allowing a specific message.
Returning `false` is simpler for an expected yes/no result and avoids
exception-handling boilerplate, but callers can ignore the result or receive
less information. The choice depends on whether the application treats
insufficient funds as an ordinary outcome or an exceptional failure.

## 5. Return from `try` and `finally`

`returnFromTry()` returns `7` inside its `try` block, but first prints from
`finally`. The output is:

```text
finally executes before the method returns
Returned value: 7
```

Java runs `finally` while leaving the `try` statement, including when a return
is pending. The return value is then delivered to the caller. A `return` from
inside `finally` should be avoided because it can override a pending return or
exception.

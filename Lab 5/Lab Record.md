# Lab 5 Record

## 1. Method overloading

`OverloadedPrinter` defines `print` methods for `int`, `double`, `String`, and
`int[]`. Java selects the overload that matches the argument type at compile
time. The array overload uses `Arrays.toString` to print the array contents.

## 2. Animal polymorphism

`Cat`, `Cow`, and `Duck` override `Animal.sound()`. An `Animal[]` can contain
all three subclasses, and calling `sound()` in the loop runs the matching
subclass implementation.

## 3. Employee payroll and Intern

Lab 4 does not contain an employee payroll hierarchy, so this lab defines a
small independent `Employee` hierarchy: `SalariedEmployee`, `HourlyEmployee`,
and `Intern`. Each supplies its own `calculatePay()` implementation. The
payroll loop depends only on `Employee.calculatePay()`, so another subclass
such as `Intern` can be added without changing the loop.

**Observed total payroll:** `6900.00`.

## 4. Field access versus method overriding

With `Parent reference = new Child();`, the output is:

```text
Field: Parent field
Method: Child method
```

Fields are selected using the reference's declared type, so
`reference.description` accesses `Parent.description`. Overridden instance
methods use runtime dispatch, so `reference.identify()` invokes
`Child.identify()` on the actual object.

## 5. Payment processor: type checks and polymorphism

`PaymentProcessor.pay(Payment)` uses Java pattern matching with `instanceof`
to identify each supported payment class and call its specific operation.
This is explicit, but the processor must be updated whenever a new payment
type is added.

The refactored `payPolymorphically(Payment)` delegates to `payment.process()`.
Each payment class implements that operation itself, so the processor remains
unchanged when adding another `Payment` implementation. This reduces type
checking in the processor and keeps payment-specific behavior with its class.

## 6. Compile-time polymorphism with Calculator

`Calculator` demonstrates method overloading with varying parameter counts and
types (`add(int, int)`, `add(int, int, int)`, `add(double, double)`,
`add(String, String)`). The compiler chooses the appropriate method at
compile-time based on argument types.

## 7. Runtime polymorphism with Shapes hierarchy

An abstract `Shape` class defines `area()` and `name()`. Subclasses `Circle`,
`Rectangle`, `Triangle`, and `Square` implement specific geometric formulas.
An array `Shape[]` is processed uniformly using dynamic method dispatch,
allowing new shape types without modifying the caller.

## 8. Downcasting and field hiding with CastingDemo

`CastingDemo` highlights the distinction between method overriding (dynamic
dispatch based on the runtime object) and field access/static methods (static
resolution based on the declared reference type). It also illustrates safe
downcasting using `instanceof` pattern matching.


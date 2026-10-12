# Lab 6 Record

## 1. Abstract shapes

`Shape` requires each concrete shape to implement `area()` and `perimeter()`.
`Circle` computes both using its radius. `Rectangle` uses width and height,
and `Square` specializes `Rectangle` by passing the same side length for both
dimensions.

## 2. Flyable interface

`Bird` and `Aeroplane` do not need to share a superclass to provide the same
behavior. Both implement `Flyable`, so a `Flyable[]` can hold either type and
invoke `fly()` polymorphically.

## 3. Abstract account

`Account` provides a shared concrete `deposit()` implementation and requires
subclasses to implement `monthlyFee()`. `SavingsAccount` and `CurrentAccount`
provide their respective fee policies.

## 4. Student sorting

`Student` implements `Comparable<Student>` with name as its natural ordering.
`Student.BY_MARKS` is a separate `Comparator<Student>` that sorts by marks
descending and uses name to break ties. The comparator allows an alternate
ordering without changing the natural ordering.

## 5. Conflicting interface defaults

Both `FirstHello` and `SecondHello` provide a default `hello()` method. A class
implementing both must override `hello()` because Java cannot choose between
the two unrelated defaults. The implementation explicitly invokes
`FirstHello.super.hello()` and `SecondHello.super.hello()` to reuse both.
The implementing class's override determines what callers of `hello()` run.

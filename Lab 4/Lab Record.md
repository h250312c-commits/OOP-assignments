# Lab 4 Record

## 1-2. Person, Student, and Teacher

`Student` and `Teacher` extend `Person`, so both reuse its name, age, and
inherited `display()` method. They call `super(name, age)` to initialize the
shared Person state, then store their own course or subject. The demo invokes
the inherited method on both subclasses.

## 3. Vehicle constructor order

**Prediction:** Constructing an `ElectricCar` first invokes the `Vehicle`
constructor, then the `Car` constructor, then the `ElectricCar` constructor.
Each subclass constructor calls its parent's constructor with `super(...)`.

**Observed output:**

```text
Vehicle constructor
Car constructor
ElectricCar constructor
```

Java initializes the superclass portion of an object before the subclass
portion.

## 4. Required superclass constructor

This code does not compile:

```java
class Animal {
    Animal(String name) {
    }
}

class Dog extends Animal {
}
```

Because `Dog` declares no constructor, Java supplies a default no-argument
constructor. That constructor implicitly calls `super()`. But `Animal` only
has `Animal(String name)`, so no matching no-argument superclass constructor
exists. The implicit call cannot compile.

The runnable example fixes this by explicitly passing the name:

```java
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}
```

## 5. Stack composition

`Stack<T>` contains a private `ArrayList<T>` and exposes stack operations such
as `push`, `pop`, and `peek`. If a stack extended `ArrayList`, callers could
also use methods such as `add(index, value)`, `remove(index)`, or `clear()`,
which expose arbitrary list behavior and can violate the expected last-in,
first-out abstraction. Composition keeps those list operations private.

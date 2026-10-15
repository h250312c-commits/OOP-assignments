# Lab 4 Record

## 1-2. Person, Student, and Teacher

`Student` and `Teacher` extend `Person`, reusing its `name` and `age` state.
Their constructors call `super(name, age)` to initialize the superclass portion
before initializing `course` or `subject`.

Both subclasses override the inherited `display()` method to include their
specialized fields. Inside the overridden method, `super.display()` reuses the
superclass printing logic, followed by subclass-specific details:

- `Person.display()` prints `Name: ...` and `age: ...`.
- `Student.display()` calls `super.display()` and prints `Course: ...`.
- `Teacher.display()` calls `super.display()` and prints `Subject: ...`.

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
first-out abstraction. Composition keeps those list operations private and
encapsulates LIFO integrity. Attempting to `pop` or `peek` an empty stack throws
an `IllegalStateException`.

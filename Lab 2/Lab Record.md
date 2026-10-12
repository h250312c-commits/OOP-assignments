# Lab 2 Record

## 1-2. Circle constructors and static counter

`Circle()` delegates to `Circle(double)` with a radius of `1.0`. Each circle
created increments the shared static counter, which is returned by
`Circle.getCircleCount()`.

## 3. Employee constructors

`Employee` has three overloaded constructors for a name, a name and department,
or a name, department, and salary. Its copy constructor copies those employee
details and assigns a new ID. A static counter supplies a unique, increasing
employee ID to each employee.

## 4. Static and instance initialization blocks

**Prediction:** The static blocks print once, in source order, when the class is
first initialized. For each object, the instance blocks print in source order
before the constructor.

**Observed output:**

```text
Static block 1
Static block 2
Instance block 1
Instance block 2
Constructor
Instance block 1
Instance block 2
Constructor
```

The demo confirms that static initialization happens once, while instance
initialization repeats for each object.

## 5. Temperature factories

`Temperature.fromCelsius(double)` and `Temperature.fromFahrenheit(double)`
create values through a private constructor. Named static factories clarify
the input unit at the call site. Overloaded constructors taking the same
primitive type would both have the signature `Temperature(double)`, which Java
cannot distinguish. Named factories also give the class control over object
creation.

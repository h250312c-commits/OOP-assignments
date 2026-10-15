# Lab 1 Record

## 1-2. Car

Created three `Car` objects with a brand, year, and mileage. `display()` prints
their details, and `isAntique()` returns `true` when the current year minus the
car's year is greater than 25.

## 3. Rectangle

Created an array of five rectangles. The program prints each rectangle's area
and perimeter, then reports the rectangle with the largest area.

## 4. Rectangle references

**Prediction:** `r1.width` will print `10.0`. Assigning `r1` to `r2` copies the
reference, not the rectangle object. Therefore, changing `r2.width` also
changes the same object's width seen through `r1`.

**Observed result:** `r1.width after changing r2.width: 10.0`.

## 5. Person and Address

The chained expression `person.address.city` prints `Harare` when the person
has an address. If `address` is `null`, evaluating `personWithoutAddress.address.city`
throws a `NullPointerException`; the demo catches it and prints an explanatory
message.

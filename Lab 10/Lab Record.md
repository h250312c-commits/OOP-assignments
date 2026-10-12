# Lab 10 Record

## 1. Write and read five lines

The program reads five complete lines from the user, writes them as UTF-8 to
`five-lines.txt`, and reads them back for display.

## 2. Predicate and `removeIf`

An `isEven` predicate tests whether an integer is divisible by two.
`removeIf(isEven)` removes every matching number from the list.

## 3. File statistics

The program reads `five-lines.txt` and reports its line count, whitespace-
separated word count, and character count. The character count includes line
separators and is the Java `String.length()` count (UTF-16 code units).

## 4. Students above the class average

The program computes the average marks with a stream, filters students whose
marks are strictly greater than the average, maps them to names, and sorts
those names alphabetically.

## 5. Learner reports

`learners.csv` has a `name,marks` header followed by one learner per row. The
program groups learners with `Collectors.groupingBy` and writes
`learners-A.txt`, `learners-B.txt`, and `learners-C.txt`. Grade bands are A
(80-100), B (70-79), and C (0-69), so every valid mark is included in one
report. Each report is sorted by learner name.

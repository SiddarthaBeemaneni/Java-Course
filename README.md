# Java Basics Practice Projects

A collection of beginner-level Java programs covering variables, user input, strings, conditional statements, random values, mathematical calculations, the ternary operator, and simple practical programs.

## Overview

This repository contains small Java practice programs designed to build foundational programming concepts.

### Programs Included

| File                         | Concept                 | Description                                                                           |
| ---------------------------- | ----------------------- | ------------------------------------------------------------------------------------- |
| `MyFirstProject.class`       | User input & arithmetic | Calculates the total cost of an item based on price and quantity.                     |
| `Main.class`                 | Variables & strings     | Demonstrates storing and printing integer and string variables.                       |
| `ScannerDemo.class`          | `Scanner`               | Reads a name, marks, Boolean input, and SGPA from the user.                           |
| `RandomDemo.class`           | Random numbers          | Generates a random number from 1–5 and randomly prints Heads or Tails.                |
| `StringmethondsDemo.class`   | String methods          | Uses `equalsIgnoreCase()` to validate a name against a password.                      |
| `MathDemo.class`             | `Math` class            | Calculates the square root of `A² + B²`.                                              |
| `MathProject.class`          | Geometry & `Math`       | Calculates the circumference, area, and volume-related value for a given radius.      |
| `ifstatements.class`         | `if/else`               | Demonstrates age-based conditions, name validation, and Boolean conditions.           |
| `NestedStatements.class`     | Nested conditions       | Applies a discount based on whether the user is a student or employee.                |
| `TernaryOperator.class`      | Ternary operator        | Demonstrates a conditional expression using the user's age.                           |
| `CompoundInterestDemo.class` | Compound interest       | Calculates compound interest using principal, rate, compounding frequency, and years. |
| `MadlibDemo.class`           | Strings & input         | Collects words from the user and inserts them into a simple Mad Lib story.            |
| `PlaceHolder.class`          | Multiple input types    | Reads name, age, gender, and student status, then displays eligibility information.   |

## Concepts Practiced

The projects demonstrate the following Java fundamentals:

* Variables and data types
* `String`, `int`, `double`, `float`, `boolean`, and `char`
* `Scanner` for user input
* `if`, `else if`, and `else`
* Nested conditional statements
* Ternary (`?:`) operator
* `String.equalsIgnoreCase()`
* `String.isEmpty()`
* `Math.pow()`
* `Math.sqrt()`
* `Math.PI`
* `Random`
* Arithmetic operations
* Boolean conditions
* Basic formatted output
* Practical calculations

## Example Calculations

### Compound Interest

`CompoundInterestDemo` uses the standard compound-interest formula:

```text
A = P(1 + r/n)^(nt)
```

Where:

* `P` = principal amount
* `r` = annual interest rate as a decimal
* `n` = number of times interest is compounded per year
* `t` = number of years
* `A` = final amount

### Circle Calculations

`MathProject` accepts a radius and calculates:

```text
Circumference = 2πr
Area = πr²
πr³
```

### Mathematical Expression

`MathDemo` calculates:

```text
√(A² + B²)
```

## Running the Programs

These files are compiled Java `.class` files. If the corresponding `.java` source files are available, compile them with:

```bash
javac FileName.java
```

Then run a program with:

```bash
java FileName
```

For example:

```bash
java MathDemo
```

or:

```bash
java ScannerDemo
```

## Important Note

This repository currently contains compiled `.class` files rather than the original `.java` source files. Because of that, the exact original source formatting, comments, and variable names may not be recoverable.

Some classes also contain a `main` method without the `public` modifier. If you recreate the source code, use:

```java
public static void main(String[] args)
```

to make the program directly runnable with the standard Java launcher.

## Learning Path

A recommended order for learning from these examples is:

1. `Main` — variables and output
2. `ScannerDemo` — user input
3. `MyFirstProject` — arithmetic with input
4. `StringmethondsDemo` — string methods
5. `ifstatements` — conditional logic
6. `NestedStatements` — nested conditions
7. `TernaryOperator` — concise conditional expressions
8. `RandomDemo` — random values
9. `MathDemo` — mathematical functions
10. `MathProject` — practical mathematical calculations
11. `CompoundInterestDemo` — financial calculation
12. `MadlibDemo` — combining input and strings
13. `PlaceHolder` — combining multiple Java fundamentals

## Purpose

These projects are intended as beginner Java practice exercises and provide a progression from basic syntax and variables to user interaction, conditional logic, mathematical operations, and small practical programs.

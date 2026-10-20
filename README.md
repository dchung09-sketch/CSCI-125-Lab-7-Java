# Java Array Processing and Manipulation

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This program demonstrates five operations on integer arrays: calculating a sum, finding the maximum value, sorting in ascending order, normalizing values by their sum, and rotating elements one position to the right.

Developed for introductory programming coursework, the project uses reusable static methods, loops, and Java's Arrays utility class. The main method runs all five operations with predefined example arrays.

## Methods

| Method | Description |
|--------|-------------|
| `danielsumArray(int[] integer)` | Adds all elements and returns their integer sum. |
| `danielfindMax(int[] MaximumElement)` | Finds and returns the largest element in a nonempty array. |
| `danielsortArray(int[] myregularintergers)` | Sorts the supplied array in ascending order using `Arrays.sort()`. |
| `danielarrayNormalization(int[] keyfigures)` | Returns a new double array containing each element divided by the original array's sum. |
| `shiftRightByOne(int[] regularintegers)` | Returns a new array with elements rotated one position to the right. |

## Example Results

| Operation | Input | Result |
|-----------|-------|--------|
| Sum | `[1, 2, 3, 4, 5]` | `15` |
| Maximum | `[3, 9, 1, 7, 2]` | `9` |
| Ascending sort | `[5, 1, 4, 2, 8]` | `[1, 2, 4, 5, 8]` |
| Normalization | `[1, 2, 3, 4, 5]` | Approximately `[0.0667, 0.1333, 0.2000, 0.2667, 0.3333]` |
| Circular right rotation | `[1, 2, 3, 4, 5]` | `[5, 1, 2, 3, 4]` |

## How the Operations Work

### Element Summation

An enhanced for loop visits each element and adds its value to a running total.

### Maximum Value

The first element becomes the initial maximum. The method compares each element against that value and updates the maximum whenever it finds a larger number.

### Ascending Sort

The program uses `Arrays.sort()` to arrange values from smallest to largest.

This method modifies the original array and returns the same array reference.

### Sum-Based Normalization

Each element is divided by the sum of all elements:

```text
normalized value = original value / sum of all elements
```

For `[1, 2, 3, 4, 5]`, the sum is 15, so the first normalized value is `1 / 15`, approximately `0.0667`.

For a nonempty array with a nonzero sum and no integer overflow, the normalized values sum to approximately 1. The demonstration prints each value to four decimal places.

### Circular Right Rotation

The last element moves to the first position, and every other element moves one position to the right.

A new array stores the result, leaving the original array unchanged.

## Concepts Practiced

- One-dimensional arrays
- Static methods with array parameters and return values
- Standard and enhanced for loops
- Conditional comparisons
- Running totals
- Integer-to-double casting
- Sorting with `Arrays.sort()`
- Array formatting with `Arrays.toString()`
- Decimal formatting with `System.out.printf()`
- Circular array rotation

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Prepare the File

Rename `Main-3 (2).java` to `Main.java` because the source declares `public class Main`.

Keep it in its own project folder to avoid conflicts with other programs named Main.

### Compile

```sh
javac Main.java
```

### Run

```sh
java Main
```

The program displays results for all five predefined examples. No keyboard input is required.

To try other values, edit the arrays inside the main method and recompile.

## Current Limitations

- Maximum-value detection and right rotation require nonempty arrays.
- Methods do not validate null array inputs.
- Integer sums can overflow for sufficiently large values.
- Normalization does not check for a zero sum, which can produce NaN or Infinity values.
- Sorting changes the original array.
- The rotation output includes a trailing comma after the final element.

## Learning Objective

Practice traversing and manipulating arrays while organizing calculations into reusable methods and distinguishing between operations that modify an existing array and those that create a new one.

# Basic ArrayLists Assignment

## Learning Objectives

By completing this assignment, you will:

* Understand how to create and manipulate ArrayLists.
* Practice using ArrayList methods (`add`, `remove`, `get`, `set`, `size`).
* Learn to iterate through ArrayLists.
* Understand dynamic sizing capabilities.
* Work with wrapper classes for primitives.
* Compare ArrayLists with arrays.

## Prerequisites

* Completion of **Basic Arrays Assignment**.
* Understanding of **objects and classes**.
* Basic knowledge of **generics** (`ArrayList<String>` syntax).

---

## Exercise 1: ArrayList Basics

**File:** `ArrayListBasics.java`

**Tasks:**

### Part A: String ArrayList

* Create an empty `ArrayList<String>` called `fruits`.
* Add: `"Apple"`, `"Banana"`, `"Orange"`, `"Grape"`, `"Mango"`.
* Print the ArrayList and its size.
* Get and print the element at index `2`.
* Change the element at index `1` to `"Blueberry"`.
* Remove `"Grape"`.
* Print the ArrayList after changes.

**Expected Output:**

```
Fruits: [Apple, Banana, Orange, Grape, Mango]
Size: 5
Element at index 2: Orange
Fruits after changes: [Apple, Blueberry, Orange, Mango]
```

### Part B: Integer ArrayList

* Create `ArrayList<Integer>` called `numbers`.
* Add: `10, 20, 30, 40, 50`.
* Insert `25` at index `2`.
* Remove `40`.
* Print sum and average of all numbers.

---

## Exercise 2: ArrayList Operations

**File:** `ArrayListOperations.java`

**Methods to implement:**

1. **Remove Duplicates**

```java
public static ArrayList<String> removeDuplicates(ArrayList<String> list)
```

* Returns a new ArrayList without duplicates.

2. **Merge Lists**

```java
public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2)
```

* Returns a new ArrayList containing all elements from both lists.

3. **Find Common Elements**

```java
public static ArrayList<String> findCommon(ArrayList<String> list1, ArrayList<String> list2)
```

* Returns elements that appear in both lists.

4. **Reverse ArrayList**

```java
public static void reverseArrayList(ArrayList<Integer> list)
```

* Reverses the ArrayList in-place.

**Test in `main()`** with sample lists.

---

## Exercise 3: ArrayList vs Array

**File:** `ArrayListVsArray.java`

**Tasks:**

* Demonstrate fixed size problem with arrays.
* Show dynamic addition in ArrayLists.
* Show removal difference (arrays vs ArrayLists).
* Print arrays (address) vs ArrayLists (contents nicely).
* Add comments explaining why ArrayLists are more flexible.

---

## Exercise 4: ArrayList of Objects

**File:** `BookManager.java`

### Part A: Book Class

* Fields: `title`, `author`, `pages`, `price`.
* Constructor, getters, setters, `toString()`.

### Part B: Book Management System

* Methods:

  * `addBook(Book book)`
  * `removeBook(String title)`
  * `findBook(String title)`
  * `getTotalPages()`
  * `getAveragePrice()`
  * `listAllBooks()`
* Test all methods in `main()`.

---

## Exercise 5: ArrayList Iteration

**File:** `ArrayListIteration.java`

**Tasks:**

* Create ArrayList: `5, 10, 15, 20, 25, 30`.
* Demonstrate 3 iteration methods:

  1. Traditional for loop
  2. Enhanced for loop
  3. Iterator
* For each method:

  * Print elements
  * Calculate sum
  * Count elements > 15

**Expected Output Example:**

```
Method 1: Traditional for loop
Elements: 5 10 15 20 25 30
Sum: 105
Count > 15: 3
```

---

## Exercise 6: ArrayList Sorting and Searching

**File:** `ArrayListSorting.java`

**Tasks:**

* Strings: `"Zebra", "Apple", "Banana", "Orange", "Grape"`

  * Print unsorted, sort, print sorted.
  * Search `"Banana"` and `"Mango"` using `Collections.binarySearch()`.
* Integers: `42, 15, 8, 23, 16, 4`

  * Sort and search `23` and `100`.

**Expected Output:**

```
Unsorted: [Zebra, Apple, Banana, Orange, Grape]
Sorted: [Apple, Banana, Grape, Orange, Zebra]
Found 'Banana' at index: 1
'Mango' not found (would be at index: -4)
```

---

## Challenge Exercise (Optional)

**File:** `ArrayListChallenge.java`

* Create a deck of cards as `ArrayList<String>`.
* Shuffle deck with `Collections.shuffle()`.
* Deal 5 cards to a hand (remove from deck, add to hand).
* Print hand and remaining deck size.
* Bonus: Deal to multiple hands.

---

## Submission Checklist

* ✅ `ArrayListBasics.java`
* ✅ `ArrayListOperations.java`
* ✅ `ArrayListVsArray.java`
* ✅ `BookManager.java`
* ✅ `ArrayListIteration.java`
* ✅ `ArrayListSorting.java`
* ✅ All code compiles and runs correctly
* ✅ Proper comments included

---

## Notes

* Import required classes:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
```

* ArrayList can only hold **objects** (use wrapper classes for primitives).
* ArrayList **automatically resizes**.
* Use `Collections.sort()` for sorting.
* `ArrayList.toString()` prints contents nicely, unlike arrays.


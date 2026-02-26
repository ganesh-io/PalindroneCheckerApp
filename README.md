# 📘 Palindrome Checker App - UC4

### A Console-Based Java Application for Efficient Palindrome Validation

## 📌 Overview
[cite_start]The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome[cite: 282, 283]. [cite_start]This module (**UC4**) focuses on optimizing memory usage by performing character-level comparisons directly on an array[cite: 298, 303].

## 🎯 Project Objective
* [cite_start]**Index-Based Access**: Convert strings to character arrays for direct element manipulation[cite: 285, 287].
* [cite_start]**Memory Optimization**: Reduce extra object creation by avoiding string reversal.
* [cite_start]**Algorithm Efficiency**: Apply time-complexity awareness to create a faster validation process.

---

## ✅ Use Case 4: Character Array Based Palindrome Check

### 🔍 Objective
[cite_start]To design and implement a validation system that utilizes a character array and the two-pointer technique to compare characters from both ends of the input string[cite: 285, 298].

### 🧠 Technical Approach
* [cite_start]**Character Array (char[])**: A primitive array used to store individual characters, allowing for fast, index-based access[cite: 291].
* [cite_start]**Two-Pointer Technique**: One pointer starts at the beginning (index 0) and another at the end (length - 1)[cite: 293, 318, 320]. [cite_start]They move toward each other to compare characters, reducing unnecessary comparisons.
* [cite_start]**Efficiency**: This method demonstrates efficient comparison without the overhead of creating additional string objects[cite: 294, 303].


### 🏗 Data Structure Used
* [cite_start]**char[]**: Used for direct, index-based character access[cite: 295].
* **Key Concepts**:
    * [cite_start]**Array Indexing**: Accessing specific character positions[cite: 292].
    * [cite_start]**Pointer Movement**: Incrementing the start and decrementing the end pointer until they cross[cite: 293, 323].

---

## 🔁 Execution Flow
1. [cite_start]**Input**: Initialize the input string (e.g., "radar")[cite: 314, 315].
2. [cite_start]**Conversion**: Convert the string into a character array using `.toCharArray()`[cite: 287, 316, 317].
3. [cite_start]**Comparison**: Use a `while` loop to compare characters at the `start` and `end` pointers[cite: 301, 323].
4. [cite_start]**Validation**: If pointers meet without a mismatch, the string is confirmed as a palindrome[cite: 322, 326].


---

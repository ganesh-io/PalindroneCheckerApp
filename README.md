# 📘 Palindrome Checker App - UC3

### A Console-Based Java Application for Efficient Palindrome Validation

## 📌 Overview
The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome. This module (**UC3**) focuses on transformation-based validation by implementing string reversal logic.

## 🎯 Project Objective
* **Implement Reversal Logic**: Design a system that checks for palindromes by reversing the input string and comparing it with the original.
* **Understand String Immutability**: Reinforce the concept that in Java, every modification to a String creates a new object.
* **Strengthen Core Fundamentals**: Use standard loops and concatenation to build and validate string data.

---

## ✅ Use Case 3: Palindrome Check Using String Reverse

### 🔍 Objective
To validate a palindrome by iterating through a string in reverse order to build a new reversed version for comparison.

### 🧠 Technical Approach
* **Loop (for loop)**: Used to iterate through the characters of the string starting from the last index down to the first.
* **String Immutability**: Awareness that modifying a String results in new object creation, which is a key consideration for performance.
* **String Concatenation (+)**: Utilized to build the reversed string character-by-character.
* **equals() Method**: Crucial for comparing the actual content of the original and reversed strings rather than their memory references.



### 🏗 Data Structure Used
* **String**: The primary data structure used for storing, reversing, and comparing text.

---

## 🔁 Execution Flow
1. **Input**: Declare and initialize the input string to be validated.
2. **Reverse**: Use a `for` loop to iterate from the last character to the first, building a reversed string.
3. **Compare**: Use the `.equals()` method to compare the original and reversed strings.
4. **Display**: Output the final validation result to the console.



---

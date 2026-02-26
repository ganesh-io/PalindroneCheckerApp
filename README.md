# 📘 Palindrome Checker App - UC7

### A Console-Based Java Application for Efficient Palindrome Validation

## 📌 Overview
[cite_start]The **Palindrome Checker App** is a console-based Java application developed to determine whether a given string is a palindrome[cite: 184]. [cite_start]This project demonstrates the practical application of core Java programming, data structures, and algorithm optimization techniques[cite: 185].

## 🎯 Project Objective
* [cite_start]**Accept User Input**: Take strings via the console for validation[cite: 185].
* [cite_start]**Efficient Validation**: Validate palindrome conditions without unnecessary reversals[cite: 208].
* [cite_start]**Reinforce Fundamentals**: Strengthen knowledge of the Java Collections Framework and data structure concepts[cite: 185].

---

## ✅ Use Case 7: Deque-Based Optimized Palindrome Checker

### 🔍 Objective
[cite_start]The goal is to implement palindrome checking using a **Deque** (Double Ended Queue) to efficiently compare characters from both ends of the string without reversing it[cite: 186, 187, 207].

### 🧠 Technical Approach
* [cite_start]**Why Deque?**: A Deque allows insertion and deletion from both the **Front** and **Rear**[cite: 193]. 
* [cite_start]**Bidirectional Traversal**: This enables direct comparison of the first and last characters, making the algorithm memory-efficient[cite: 194, 209].
* [cite_start]**Optimized Handling**: It eliminates the need for separate reversal data structures[cite: 195].



### 🏗 Data Structure Used
* [cite_start]**Deque (Double Ended Queue)**[cite: 196].
* [cite_start]**Implementation**: `ArrayDeque` from the Java Collections Framework.
* **Key Methods**:
    * [cite_start]`addLast()` – Insert character at the rear[cite: 222, 224].
    * [cite_start]`removeFirst()` – Remove and retrieve from the front[cite: 205].
    * [cite_start]`removeLast()` – Remove and retrieve from the rear[cite: 206].
    * [cite_start]`size()` – Track remaining elements to compare[cite: 228].

---

### 🔁 Execution Flow
1. [cite_start]**Input**: Accept a string input from the user (e.g., "refer")[cite: 218, 219].
2. [cite_start]**Insert**: Insert each character into the Deque[cite: 189].
3. [cite_start]**Compare**: Repeatedly remove the first and last characters and compare them[cite: 190, 204].
4. **Validate**:
    * [cite_start]If a mismatch occurs → The string is **NOT** a palindrome[cite: 226].
    * [cite_start]If all comparisons pass until the deque is empty or has one element → It **IS** a palindrome[cite: 191, 228].



---


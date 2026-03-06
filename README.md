# 🔄 Palindrome Checker App

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Data Structures](https://img.shields.io/badge/Data_Structures-007396?style=for-the-badge)
![Algorithms](https://img.shields.io/badge/Algorithms-4CAF50?style=for-the-badge)

### A Console-Based Java Application for Efficient Palindrome Validation

## 📌 Project Overview
The **Palindrome Checker App** is a structured, console-based Java application designed to validate whether a given string is a palindrome. Rather than just solving the problem once, this project serves as a comprehensive study of **Data Structures and Algorithms (DSA)**. 

Through 7 progressive modules (Use Cases), the application evolves from basic hardcoded string comparisons to highly optimized, memory-efficient algorithms using advanced data structures.

---

## 🎯 Project Objectives
- **Master Core Java:** Strengthen foundational programming concepts, control flows, and object-oriented principles.
- **Explore Data Structures:** Implement and compare `String`, `char[]`, `Stack`, `Queue`, and `Deque`.
- **Optimize Algorithms:** Transition from brute-force string reversal to efficient memory-management techniques like the Two-Pointer approach.
- **Analyze Behavior:** Understand the practical differences between **FIFO** (First-In-First-Out) and **LIFO** (Last-In-First-Out) operations.

---

## 🚀 Branch & Use Case Roadmap

This repository is organized into distinct branches, each representing a specific phase (Use Case) of the project's evolution.

### 🟢 Phase 1: Fundamentals
* **[UC1] Application Entry & Welcome Message**
    * **Goal:** Establish the application startup flow and environment.
    * **Key Concepts:** Java `main` method, `static` keywords, and console output styling.
* **[UC2] Hardcoded Palindrome Result**
    * **Goal:** Introduce basic conditional logic to validate a predefined string.
    * **Key Concepts:** String literals, String constant pool, and `if-else` execution flow.

### 🟡 Phase 2: String Manipulation & Optimization
* **[UC3] Palindrome Check Using String Reverse**
    * **Goal:** Validate symmetry by iterating backwards and building a reversed string.
    * **Key Concepts:** `for` loops, String Immutability, and the `.equals()` method.
* **[UC4] Character Array Based Palindrome Check**
    * **Goal:** Optimize memory by avoiding object creation during string reversal.
    * **Key Concepts:** Primitive `char[]` arrays, Indexing, and the **Two-Pointer Technique** ($O(n/2)$ time complexity).



### 🔴 Phase 3: Advanced Data Structures
* **[UC5] Stack-Based Palindrome Checker**
    * **Goal:** Map the reversal logic to a linear data structure.
    * **Key Concepts:** The **LIFO** (Last In, First Out) principle, utilizing `push()` and `pop()` operations to naturally reverse data.
    


* **[UC6] Queue + Stack Symmetry Check**
    * **Goal:** Compare forward and backward character sequences simultaneously using two distinct structures.
    * **Key Concepts:** Demonstrating **FIFO** (Queue) vs **LIFO** (Stack) behavioral differences and logical symmetry validation.



* **[UC7] Deque-Based Optimized Checker**
    * **Goal:** Achieve ultimate validation efficiency using a single, bidirectional data structure.
    * **Key Concepts:** Using a **Double-Ended Queue (Deque)** for simultaneous front and rear access (`removeFirst()` and `removeLast()`), eliminating the need for full string traversal or reversal.



---

## 🛠️ Technology Stack
- **Language:** Java (JDK 8+)
- **Collections Framework:** `java.util.Stack`, `java.util.Queue`, `java.util.LinkedList`, `java.util.Deque`, `java.util.ArrayDeque`
- **Environment:** Console/Terminal

# 📘 Palindrome Checker App - UC6

### A Console-Based Java Application for Efficient Palindrome Validation

## 📌 Overview
[cite_start]The **Palindrome Checker App** is a console-based Java application designed to validate whether a given string is a palindrome[cite: 134, 135]. [cite_start]This module (**UC6**) demonstrates how different linear data structures can be combined for symmetric comparison[cite: 162].

## 🎯 Project Objective
* [cite_start]**Demonstrate FIFO vs LIFO**: Understand the behavioral differences between Queue and Stack structures[cite: 137, 145].
* [cite_start]**Logical Comparison**: Validate palindrome logic by matching outputs from two distinct data structures[cite: 146].
* [cite_start]**Strengthen Fundamentals**: Reinforce core programming and data structure concepts.

---

## ✅ Use Case 6: Queue + Stack Based Palindrome Check

### 🔍 Objective
[cite_start]To implement palindrome checking by inserting characters into both a **Queue** and a **Stack**, then comparing them to confirm the string is symmetric[cite: 154, 159, 160].

### 🧠 Technical Approach
* [cite_start]**Queue (FIFO)**: Characters are removed from the front in the **original** order they were inserted[cite: 143, 157].
* [cite_start]**Stack (LIFO)**: Characters are removed from the top in the **reverse** order of insertion[cite: 158].
* [cite_start]**Symmetry Check**: By comparing the "First In" (Queue) with the "Last In" (Stack), we can determine if the string reads the same forward and backward[cite: 159, 162].


### 🏗 Data Structures Used
* [cite_start]**Queue**: A linear data structure following the **First In First Out** principle[cite: 143, 147].
* [cite_start]**Stack**: A linear data structure following the **Last In First Out** principle[cite: 147, 158].
* [cite_start]**Implementation**: `LinkedList` (for Queue) and `Stack` classes from the Java Collections Framework.

---

### 🔁 Execution Flow
1. [cite_start]**Input**: Define or accept the input string (e.g., "civic")[cite: 172].
2. [cite_start]**Enqueue/Push**: Insert each character of the string into **both** the Queue and the Stack[cite: 139, 140, 176].
3. [cite_start]**Compare**: Repeatedly remove the front character from the Queue (`poll`) and the top character from the Stack (`pop`)[cite: 141, 159].
4. **Validate**:
    * [cite_start]If any pair of characters does not match → Not a palindrome[cite: 160].
    * [cite_start]If all characters match until the structures are empty → Palindrome[cite: 160, 179].


---

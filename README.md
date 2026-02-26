Palindrome Checker App – UC7 (Deque-Based)
📌 Project Overview

The Palindrome Checker App is a console-based Java application developed to strengthen core programming skills and data structure fundamentals.

This module, Use Case 7 (UC7), implements an optimized palindrome validation technique using a Double-Ended Queue (Deque). The solution efficiently compares characters from both ends of a string without reversing the string or using additional memory-heavy structures.

The project demonstrates structured problem-solving, efficient algorithm design, and practical usage of the Java Collections Framework.

✅ Use Case 7: Deque-Based Optimized Palindrome Checker
🎯 Objective

To implement a memory-efficient palindrome validation algorithm by simultaneously comparing characters from the front and rear of a string using a Deque.

This approach eliminates the need for string reversal and reduces unnecessary data handling.

🧠 Technical Approach

A Deque (Double Ended Queue) allows insertion and deletion from both:

Front

Rear

This behavior makes it ideal for palindrome validation because it enables:

Direct comparison of the first and last characters

Efficient single-pass traversal

Reduced memory usage

Clean and maintainable logic

Instead of reversing the string or using multiple auxiliary structures, the Deque provides optimized bidirectional comparison.

🏗 Data Structure Used

Deque – Implemented using ArrayDeque (Java Collections Framework)

Key Methods Utilized

addLast() – Inserts characters at the rear

removeFirst() – Removes and retrieves the front character

removeLast() – Removes and retrieves the rear character

size() – Determines loop termination condition

🔁 Execution Flow

The user enters a string through the console.

Each character of the string is inserted into the Deque.

The program repeatedly:

Removes the first character

Removes the last character

Compares both characters

If a mismatch occurs, the string is declared NOT a palindrome.

If all comparisons succeed, the string is declared a palindrome.

The process stops when the Deque becomes empty or contains only one middle character.

⚙️ Compilation & Execution

Run the following commands in your terminal:

Step 1: Compile
javac UseCase7PalindromeCheckerApp.java
Step 2: Execute
java UseCase7PalindromeCheckerApp
🖥 Sample Output
Enter a string: racecar
Result: The given string is a Palindrome.
Enter a string: programming
Result: The given string is NOT a Palindrome.
🧩 Key Learning Outcomes

Understanding bidirectional data structures

Practical use of the Deque interface

Efficient algorithm design without redundant memory usage

Mastering loop control and condition-based traversal

Strengthening core Java and Collections Framework concepts

🚀 Potential Enhancements

Case-insensitive palindrome validation

Ignoring spaces and special characters

Performance comparison with Stack-based implementation

Integration with unit testing frameworks

GUI-based or web-based extension

👨‍💻 Developed For

Academic learning and skill enhancement in:

Core Java

Data Structures

Algorithm Optimization

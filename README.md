📘 Palindrome Checker App

A Console-Based Java Application for Efficient Palindrome Validation

📌 Overview

The Palindrome Checker App is a console-based Java application developed to determine whether a given string is a palindrome.

This project demonstrates practical application of core Java programming, data structures, and algorithm optimization techniques using a structured and modular approach.

It is designed for learners and developers who want to understand how data structures can improve problem-solving efficiency.

🎯 Project Objective

To design and implement a robust palindrome validation system that:

Accepts user input via console

Validates palindrome conditions efficiently

Utilizes optimized data structures

Reinforces core Java and data structure concepts

✅ Use Case 7: Deque-Based Optimized Palindrome Checker
🔍 Objective

Implement palindrome checking using a Deque (Double Ended Queue) to efficiently compare characters from both ends of the string without reversing it.

🧠 Technical Approach
Why Deque?

A Deque allows insertion and deletion from both:

Front

Rear

This enables direct comparison of the first and last characters, making the algorithm efficient and clean.

🔁 Execution Flow

Accept string input from user.

Insert each character into a Deque.

Repeatedly:

Remove first character

Remove last character

Compare both

If mismatch occurs → Not a palindrome.

If all comparisons pass → Palindrome.

🏗 Data Structure Used
Deque (Double Ended Queue)

Implementation: ArrayDeque from Java Collections Framework

Key Methods Used:

addLast() – Insert at rear

removeFirst() – Remove from front

removeLast() – Remove from rear

size() – Track remaining elements

⚙️ Compilation & Execution
Step 1: Compile the Program
javac UseCase7PalindromeCheckerApp.java
Step 2: Run the Program
java UseCase7PalindromeCheckerApp
🖥 Sample Output
Enter a string:
racecar

Result: The given string is a Palindrome.
Enter a string:
programming

Result: The given string is NOT a Palindrome.
🧩 Key Learning Outcomes

This implementation helps in understanding:

Efficient string processing

Deque operations and behavior

Java Collections Framework

Algorithm optimization

Clean console application structure

📂 Project Structure
PalindromeCheckerApp/
│
├── UseCase7PalindromeCheckerApp.java
└── README.md
🚀 Possible Enhancements

Case-insensitive comparison

Ignoring spaces and special characters

Performance benchmarking against Stack-based approach

GUI implementation

Unit testing integration

📜 Conclusion

The Deque-Based Optimized Palindrome Checker provides a clean, memory-efficient, and structured approach to solving palindrome validation problems.

It demonstrates how selecting the right data structure significantly improves clarity, performance, and maintainability of code.

👨‍💻 Developed for Academic & Skill Enhancement Purposes

Strengthening Core Java and Data Structure Fundamentals.

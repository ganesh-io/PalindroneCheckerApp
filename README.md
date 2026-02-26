# Palindrome Checker App - UC7 (Deque-Based)

## 📌 Project Overview
The **Palindrome Checker App** is a console-based Java application designed to strengthen core programming and data structure fundamentals. This specific module implements an optimized palindrome validation using a **Double-Ended Queue (Deque)**.

---

## ✅ Use Case 7: Deque-Based Optimized Palindrome Checker

### 🎯 Objective
The goal of UC7 is to implement a memory-efficient palindrome check by comparing characters from both ends of a string simultaneously using a **Deque**, eliminating the need for string reversal.

### 🧠 Technical Approach
A **Deque (Double Ended Queue)** allows insertion and deletion from both the **Front** and the **Rear**. This behavior is ideal for palindrome checking as it enables a direct comparison of the first and last characters in a single pass.



### 🏗 Data Structure: Deque
* **Implementation:** `ArrayDeque` (Java Collections Framework).
* **Behavior:** Optimized bidirectional traversal.
* **Key Methods:**
    * `addLast()` – Inserts characters at the rear.
    * `removeFirst()` – Removes and retrieves from the front.
    * `removeLast()` – Removes and retrieves from the rear.



---

### 🔁 Execution Flow
1.  **Input:** The user provides a string via the console.
2.  **Insertion:** Each character of the string is added to the Deque using `addLast()`.
3.  **Comparison:**
    * The first character (`removeFirst()`) and last character (`removeLast()`) are removed and compared.
    * If they do not match, the string is **not** a palindrome.
4.  **Termination:** The loop continues until the Deque is empty or only one middle character remains.

---

### 💻 Source Code (`UseCase7PalindromeCheckerApp.java`)

```java
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


 * UC7: Deque-Based Optimized Palindrome Checker
 * Developed by: Ganesh
 
public class UseCase7PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("--- Palindrome Checker App (UC7) ---");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Initialize Deque
        Deque<Character> deque = new ArrayDeque<>();
        
        // Load characters into Deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Optimized comparison from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Output Result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
        
        sc.close();
    }
}
⚙️ Compilation & Execution
Follow these commands in your terminal to run the application:

Step 1: Compile

Bash
javac UseCase7PalindromeCheckerApp.java
Step 2: Run

Bash
java UseCase7PalindromeCheckerApp
🖥 Sample Output
Plaintext
Enter a string: racecar
Result: The given string is a Palindrome.

Enter a string: programming
Result: The given string is NOT a Palindrome.
🧩 Key Learning Outcomes
Efficiency: Bidirectional comparison is more resource-efficient than string reversal.

Collections: Practical use of the java.util.Deque interface.

Logic: Mastering loop termination conditions for data structure traversal.

👨‍💻 Developed for Academic & Skill Enhancement Purposes
Strengthening Core Java and Data Structure Fundamentals.

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // UC5 Logic: Stack-Based Palindrome Check
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Step 2: Pop characters and compare with the original string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        sc.close();
    }
}
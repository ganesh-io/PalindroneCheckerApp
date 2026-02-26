import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // UC4 Logic: Character Array and Two-Pointer Technique
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            // Compare characters at both ends
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Stop immediately if a mismatch is found
            }
            start++; // Move front pointer forward
            end--;   // Move back pointer backward
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        sc.close();
    }
}
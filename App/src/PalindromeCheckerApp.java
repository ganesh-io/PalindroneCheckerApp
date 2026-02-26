import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // UC3 Logic: String Reversal using loop
        String reversed = "";

        // Loop starts from the last character and moves to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            // String Immutability: This creates a new string object every time
            reversed = reversed + input.charAt(i);
        }

        // Compare content using .equals() instead of ==
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is not a Palindrome.");
        }

        sc.close();
    }
}
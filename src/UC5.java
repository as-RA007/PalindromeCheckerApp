import java.util.Scanner;
import java.util.Stack;

public class UC5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("Stack-Based Palindrome Checker");
        System.out.print("Enter a word: ");

        String input = scanner.nextLine();

        // Normalize input (case insensitive + ignore spaces)
        String normalized = input.toLowerCase().replace(" ", "");

        // Push characters into stack
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare with stack pop
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is not a Palindrome");
        }

        scanner.close();
    }
}
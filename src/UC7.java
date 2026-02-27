import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class UC7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Character> deque = new ArrayDeque<>();

        System.out.println("Deque-Based Optimized Palindrome Checker");
        System.out.print("Enter a sentence: ");

        String input = scanner.nextLine();

        String normalized = input.toLowerCase().replace(" ", "");

        for (int i = 0; i < normalized.length(); i++) {
            deque.addLast(normalized.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
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
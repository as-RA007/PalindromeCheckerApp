import java.util.Scanner;

public class UC4
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Palindrome Checker App");
        System.out.print("Enter a word: ");

        String word = scanner.nextLine();
        String normalized = word.toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println(word + " is a Palindrome (Case Insensitive)");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class UC4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Character Array Based Palindrome Check");
        System.out.print("Enter a word: ");

        String input = scanner.nextLine();

        char[] characters = input.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        scanner.close();
    }
}
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC7
         *
         * This is a Palindrome Checker App Deque-Based Optimized
         *
         * @author Developer
         * @version 7.0
        */
        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

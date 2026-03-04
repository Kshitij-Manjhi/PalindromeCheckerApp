import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC8
         *
         * This is a Palindrome Checker App Linked List Based
         *
         * @author Developer
         * @version 8.0
        */
        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

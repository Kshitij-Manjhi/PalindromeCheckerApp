
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        /**
         * Application entry point for UC3
         *
         * This is a Palindrome Checker App Welcome Message
         *
         * @author Developer
         * @version 4s.0
        */
        String input = "radar";
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;
        System.out.println("Input : " + input);
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Is it Palindrome? : "+ isPalindrome);
    }
}

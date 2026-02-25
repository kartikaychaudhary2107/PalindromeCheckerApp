import java.util.Stack;

public class UseCase5PalindromeCheckerApp {


        // Origin    public static void main(String[] args) {


        String original = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop from stack and compare
        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();
            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }


        String original = "radar";
        char[] characters = original.toCharArray();

        String original = "level";


        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}
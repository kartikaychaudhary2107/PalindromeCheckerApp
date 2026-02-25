import java.util.Stack;

import java.util.Queue;
import java.util.LinkedList;


public class PalindromeCheckerApp {


        // Origin    public static void main(String[] args) {


        String original = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));

        // Original string
        String original = "racecar";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both data structures
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO

        }

        boolean isPalindrome = true;


        // Pop from stack and compare
        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();
            if (original.charAt(i) != poppedChar) {

        // Compare pop (stack) and dequeue (queue)
        for (int i = 0; i < original.length(); i++) {
            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {

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

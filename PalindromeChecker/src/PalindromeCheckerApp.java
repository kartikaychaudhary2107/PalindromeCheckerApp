import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {
    // Stack-based palindrome check
    public static boolean stackPalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequePalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // Simple two-pointer palindrome check
    public static boolean simplePalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Stack strategy
        long startTime = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long stackTime = System.nanoTime() - startTime;

        // Deque strategy
        startTime = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long dequeTime = System.nanoTime() - startTime;

        // Simple two-pointer strategy
        startTime = System.nanoTime();
        boolean simpleResult = simplePalindrome(input);
        long simpleTime = System.nanoTime() - startTime;

        System.out.println("\nPalindrome Results:");
        System.out.println("Stack: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two-pointer: " + simpleResult + " | Time: " + simpleTime + " ns");

        scanner.close();
    }

}

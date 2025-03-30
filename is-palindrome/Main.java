import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Type in a word to check if it's a palindrome");
    try (Scanner scanner = new Scanner(System.in)) {
      String word = scanner.nextLine();
      if (isPalindrome(word)) {
        System.out.println(word + " is a palindrome");
        return;
      }
      System.out.println(word + " is not a palindrome");
    }
  }

  public static boolean isPalindrome(String str) {
    Stack<Character> stack = new Stack<>();
    Queue<Character> q = new LinkedList<>();

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      stack.push(c);
      q.add(c);
    }

    while (!stack.isEmpty()) {
      if (stack.pop() != q.remove()) {
        return false;
      }
    }

    return true;
  }
}

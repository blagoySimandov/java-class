import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter string:");
    try (Scanner scanner = new Scanner(System.in)) {

      String inputStr = scanner.nextLine();
      HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

      for (int i = 0; i < inputStr.length(); i++) {
        charMap.put(inputStr.charAt(i), charMap.getOrDefault(inputStr.charAt(i), 0) + 1);
      }

      for (var item : charMap.entrySet()) {
        Character key = item.getKey();
        if (charMap.get(key) > 1) {
          System.out.println("Duplicate char: " + key);
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading string input");
      System.out.println(e);
    }

  }
}

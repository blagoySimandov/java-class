import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Type in a word to check if it's an anagram");
      String word1 = scanner.nextLine();
      System.out.println("Type in the second word to check with");
      String word2 = scanner.nextLine();
      String wordSorted1 = sortString(word1);
      String wordSorted2 = sortString(word2);
      if (wordSorted1.equals(wordSorted2)) {
        System.out.println(word1 + " is an anagram of " + word2);
        return;
      }
      System.out.println(word1 + " is not an anagram of " + word2);
    }
  }

  public static String sortString(String inputString) {
    char tempArray[] = inputString.toCharArray();

    Arrays.sort(tempArray);

    return new String(tempArray);
  }

}

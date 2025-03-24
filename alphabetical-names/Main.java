import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      ArrayList<String> names = new ArrayList<String>(10);
      for (int i = 0; i < 10; i++) {
        names.add(scanner.nextLine());
      }
      names.sort((String s1, String s2) -> s1.compareTo(s2));
      names.forEach(s -> System.out.println(s));
    }
  }
}

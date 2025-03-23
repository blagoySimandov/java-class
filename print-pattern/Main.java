import java.util.Arrays;

class Main {
  public static void p(Object... args) {
    Arrays.stream(args).forEach(System.out::println);
  }

  public static void main(String[] args) {
    final char printChar = '*';
    final int rows = 10;
    for (int i = 1; i <= rows; i++) {
      // Print spaces - using two spaces for each position
      for (int j = 1; j <= (rows - i) * 2; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      // Move to the next line
      System.out.println();
    }
  }
}

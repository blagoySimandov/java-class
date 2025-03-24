import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final char printChar = '*';
    Scanner scanner = new Scanner(System.in);
    int rows;
    try (scanner) { // try-with-resources closes the scanner
      rows = scanner.nextInt();
    }

    int actualRows = rows;
    if (rows % 2 == 0) {
      actualRows++;
    }

    System.out.printf("Printing diamond star pattern with: %d rows \n", rows);

    int mid = actualRows / 2;

    for (int i = 0; i < actualRows; i++) {
      StringBuilder sb = new StringBuilder();// more memory efficient than String
      int spaces;
      int stars;

      if (i <= mid) {
        spaces = mid - i;
        stars = 2 * i + 1;
      } else {
        spaces = i - mid;
        stars = 2 * (actualRows - i - 1) + 1;
      }

      for (int j = 0; j < spaces; j++) {
        sb.append(" ");
      }

      for (int j = 0; j < stars; j++) {
        sb.append(printChar);
      }

      System.out.println(sb.toString());
    }
  }
}

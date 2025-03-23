import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Write an year to check: ");
      int year = scanner.nextInt(); // throws so wrap it in try/finnaly to close the scanner properly.
      boolean isLeapYear = (year % 4 == 0);

      if (isLeapYear)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
    } finally {
      scanner.close();
    }
  }
}

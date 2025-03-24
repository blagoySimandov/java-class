import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try (scanner) {
      System.out.println("Input dividend: ");
      int divident = scanner.nextInt();

      System.out.println("Input divisor: ");
      int divisor = scanner.nextInt();

      int quotient = divident / divisor;
      int remainder = divident % divisor;

      System.out.printf("Quotient: %d\n", quotient);
      System.out.printf("Remainder: %d\n", remainder);

    }
  }
}

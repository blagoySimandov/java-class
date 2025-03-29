import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try (scanner) {
      System.out.println("Input number: ");
      double num = scanner.nextDouble();

      System.out.println("Input power: ");
      double power = scanner.nextDouble();

      double result = Math.pow(num, power);
      System.out.println("Result: " + result);
    } catch (Exception e) {
      System.out.println("Unexpected error: " + e);
    }
  }
}

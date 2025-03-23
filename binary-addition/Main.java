import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("Write the first binary number: ");
      String binNum1Str = scanner.nextLine();
      System.out.println("Write the second binary number: ");
      String binNum2Str = scanner.nextLine();

      int binaryNum1 = Integer.parseInt(binNum1Str, 2);
      int binaryNum2 = Integer.parseInt(binNum2Str, 2); // Throws so try/finally...

      int result = binaryNum1 + binaryNum2;

      System.out.println("The result is: " + Integer.toBinaryString(result));

    } finally {
      scanner.close();
    }
  }
}

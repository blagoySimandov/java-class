
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try (scanner) {
      int[][] m1 = new int[3][3];
      int[][] m2 = new int[3][3];
      int[][] sum = new int[3][3];

      System.out.println("Enter elements of first 3x3 matrix:");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          m1[i][j] = scanner.nextInt();
        }
      }

      System.out.println("Enter elements of second 3x3 matrix:");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          m2[i][j] = scanner.nextInt();
        }
      }

      // adding matrices
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          sum[i][j] = m1[i][j] + m2[i][j];
        }
      }

      System.out.println("Sum of the matrices:");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          System.out.print(sum[i][j] + " ");
        }
        System.out.println(); //
      }

    }

  }
}

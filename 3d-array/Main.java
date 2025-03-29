import java.util.Scanner;

public class Main {

  public static int[][][] generate3DArray(int dim1, int dim2, int dim3) {
    int[][][] array = new int[dim1][dim2][dim3];

    for (int i = 0; i < dim1; i++) {
      for (int j = 0; j < dim2; j++) {
        for (int k = 0; k < dim3; k++) {
          array[i][j][k] = (int) (Math.random() * 100);
        }
      }
    }

    return array;
  }

  public static void main(String[] args) {

    int dim1 = 10;
    int dim2 = 10;
    int dim3 = 10;
    int[][][] array3d = generate3DArray(dim1, dim2, dim3);
    int num = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      num = scanner.nextInt();
    }
    boolean numberFound = false;
    outerLoop: for (int i = 0; i < dim1; i++) {
      for (int j = 0; j < dim2; j++) {
        for (int k = 0; k < dim3; k++) {
          if (array3d[i][j][k] == num) {
            System.out.println("Found number: " + num + ". At position: " + i + " " + j + " " + k);
            numberFound = true;
            break outerLoop; // break with label:
                             // https://stackoverflow.com/questions/886955/how-do-i-break-out-of-nested-loops-in-java
          }
        }
      }
    }
    if (!numberFound)
      System.out.println("Number not found");
  }
}

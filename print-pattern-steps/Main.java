class Main {
  public static void main(String[] args) {
    final char printChar = '*';
    final int rows = 5;
    System.out.printf("Printing pattern steps patter with: %d rows \n", rows);
    for (int i = 0; i < rows; i++) {
      int spaces = rows - i;
      String stringToBePrinted = "";
      for (int k = 0; k < spaces; k++) {
        stringToBePrinted += " ";
      }
      for (int j = 0; j <= i; j++) {
        stringToBePrinted += printChar;
      }
      System.out.println(stringToBePrinted);
    }
  }
}

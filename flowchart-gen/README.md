# Java 3D Array Flowchart Generator

This project creates an interactive flowchart visualization for the provided Java code that generates a 3D array, fills it with random values, and searches for a user-specified number within the array.

## Features

- Visual representation of the 3D array generation algorithm
- Detailed flowchart of the search process
- Interactive flowchart with zooming and panning
- Color-coded nodes and edges for better clarity

## Original Java Code

```java
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
      System.out.println("Guess a number");
      num = scanner.nextInt();
    }
    boolean numberFound = false;
    outerLoop: for (int i = 0; i < dim1; i++) {
      for (int j = 0; j < dim2; j++) {
        for (int k = 0; k < dim3; k++) {
          if (array3d[i][j][k] == num) {
            System.out.println("Found number: " + num + ". At position: " + i + " " + j + " " + k);
            numberFound = true;
            break outerLoop; // break with label
          }
        }
      }
    }
    if (!numberFound)
      System.out.println("Number not found");
  }
}
```

## Getting Started

### Prerequisites

- Node.js (v14+)
- npm or yarn

### Installation

1. Clone this repository
2. Install dependencies:

```bash
npm install
```

### Running the Application

```bash
npm start
```

This will start the development server and open the application in your browser at [http://localhost:3000](http://localhost:3000).

## Technologies Used

- React.js
- React Flow (for flowchart visualization)
- CSS for styling

## Features of the Flowchart

- Nodes for different operations (start, process, decision, input/output, end)
- Color-coded decision paths
- Visual representation of the function call
- Step-by-step flow of the algorithm

## Usage

- Zoom in/out using the mouse wheel or the controls in the bottom-right corner
- Pan the flowchart by dragging
- Use the mini-map in the bottom-left corner for navigation
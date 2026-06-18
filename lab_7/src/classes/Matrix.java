package classes;
import java.io.*;
import java.util.Scanner;

public class Matrix {
  private int rows;
  private int cols;
  private int[][] data;

  public Matrix(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
    this.data = new int[rows][cols];
  }

  public static Matrix readFromFile(String filename) throws IOException {
    Scanner sc = new Scanner(new File(filename));
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    Matrix m = new Matrix(rows, cols);
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        m.data[i][j] = sc.nextInt();
    sc.close();
    return m;
  }

  public int getRows() { return rows; }
  public int getCols() { return cols; }
  public int[][] getData() { return data; }
}
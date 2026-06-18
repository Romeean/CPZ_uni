import classes.Matrix;
import classes.analyze.MaxRowSumAnalyzer;
import classes.analyze.MinColumnAnalyzer;
import classes.analyze.MinColumnProdAnalyzer;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Matrix matrix = Matrix.readFromFile("data/input.txt");

    new MinColumnAnalyzer(matrix).writeToFile("data/output_min_column.txt");
    new MaxRowSumAnalyzer(matrix).writeToFile("data/output_max_row.txt");
    new MinColumnProdAnalyzer(matrix).writeToFile("data/min_column_prod_analyzer.txt");
  }
}
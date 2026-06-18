package classes.analyze;
import classes.Matrix;

public class MinColumnAnalyzer extends MatrixAnalyzer {

  public MinColumnAnalyzer(Matrix matrix) {
    super(matrix);
  }

  public int[] findMinInCols() {
    int[][] data = matrix.getData();
    int[] mins = new int[matrix.getCols()];
    for (int j = 0; j < matrix.getCols(); j++) {
      int min = data[0][j];
      for (int i = 1; i < matrix.getRows(); i++)
        if (data[i][j] < min) min = data[i][j];
      mins[j] = min;
    }
    return mins;
  }

  @Override
  public String analyze() {
    int[] mins = findMinInCols();
    StringBuilder sb = new StringBuilder();
    for (int val : mins)
      sb.append(val).append(" ");
    return sb.toString().trim();
  }
}
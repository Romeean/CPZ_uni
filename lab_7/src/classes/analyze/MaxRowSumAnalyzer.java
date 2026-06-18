package classes.analyze;
import classes.Matrix;


public class MaxRowSumAnalyzer extends MatrixAnalyzer {

  public MaxRowSumAnalyzer(Matrix matrix) {
    super(matrix);
  }

  @Override
  public String analyze() {
    int[][] data = matrix.getData();
    int sum = 0;
    for (int i = 0; i < matrix.getRows(); i++) {
      int max = data[i][0];
      for (int j = 1; j < matrix.getCols(); j++)
        if (data[i][j] > max) max = data[i][j];
      sum += max;
    }
    return String.valueOf(sum);
  }
}
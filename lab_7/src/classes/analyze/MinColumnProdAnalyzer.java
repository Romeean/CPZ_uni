package classes.analyze;
import classes.Matrix;


public class MinColumnProdAnalyzer extends MatrixAnalyzer {

  private MinColumnAnalyzer minAnalyzer;

  public MinColumnProdAnalyzer(Matrix matrix) {
    super(matrix);
    this.minAnalyzer = new MinColumnAnalyzer(matrix);
  }

  @Override
  public String analyze() {
    long product = 1;
    for (int val : minAnalyzer.findMinInCols())
      product *= val;
    return String.valueOf(product);
  }
}
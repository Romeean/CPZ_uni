package classes.analyze;
import classes.Matrix;
import java.io.*;

public abstract class MatrixAnalyzer {
  protected Matrix matrix;

  public MatrixAnalyzer(Matrix matrix) {
    this.matrix = matrix;
  }

  public abstract String analyze();

  public void writeToFile(String filename) throws IOException {
    PrintWriter pw = new PrintWriter(new FileWriter(filename));
    pw.println(analyze());
    pw.close();
  }
}
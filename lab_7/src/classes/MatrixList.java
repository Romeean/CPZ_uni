package classes;

import java.util.ArrayList;

public class MatrixList {
  private ArrayList<Matrix> matrices = new ArrayList<>();

  public void add(Matrix m) {
    matrices.add(m);
  }

  public Matrix get(int index) {
    return matrices.get(index);
  }

  public int size() {
    return matrices.size();
  }
}
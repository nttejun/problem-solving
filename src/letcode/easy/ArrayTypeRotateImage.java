package letcode.easy;

import org.junit.Test;

/***
 * 이차원 배열의 변경 패턴을 통해 문제 해결책을 찾아간다
 */
public class ArrayTypeRotateImage {
  public int[][] rotate(int[][] matrix) {
    int result[][] = new int[matrix.length][matrix.length];
    int first = -1;
    for (int i = 0; i < matrix.length; i++) {
      int second = 0;
      first++;
      for (int j = matrix.length-1; j > -1; j--) {
        result[first][second] = matrix[j][first];
        second++;
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        matrix[i][j] = result[i][j];
      }
    }
    return result;
  }

  @Test
  public void roatet_테스트_CASE1() {
    int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] result = rotate(matrix);
    System.out.println(result);
  }
}

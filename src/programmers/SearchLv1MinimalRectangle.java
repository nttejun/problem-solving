package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv1MinimalRectangle {

  public int solution(int[][] sizes) {
    int maxA = 0;
    int maxB = 0;


    int[][] temp = new int[1][2];
    boolean isFirstBig = false;

    for (int i = 0; i < sizes.length; i++) {
      if (maxA < sizes[i][0]) {
        maxA = i;
      }
      if (maxB < sizes[i][1]) {
        maxB = i;
      }
    }

    if (sizes[maxA][0] >= sizes[maxB][0]) {
      isFirstBig = true;
      temp[0][0] = sizes[maxA][0];
      temp[0][1] = sizes[maxA][1];
    } else {
      isFirstBig = false;
      temp[0][0] = sizes[maxB][0];
      temp[0][1] = sizes[maxB][1];
    }

    int minTempBigIndex = -1;
    for (int i = 0; i < sizes.length; i++) {
      if (temp[0][1] < sizes[i][1]) {
        minTempBigIndex = i;
      }
    }

    if (minTempBigIndex == -1) {
      if (isFirstBig) {
        return sizes[maxA][0] * sizes[maxA][1];
      } else {
        return sizes[maxB][0] * sizes[maxB][1];
      }
    } else {
      if (isFirstBig) {
        return sizes[maxA][0] * sizes[minTempBigIndex][1];
      } else {
        return sizes[maxB][0] * sizes[minTempBigIndex][1];
      }
    }
  }

  @Test
  public void TEST() {
    int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    Assert.assertEquals(4000, solution(arr));
  }
}

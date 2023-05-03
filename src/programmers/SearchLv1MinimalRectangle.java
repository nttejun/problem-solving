package programmers;

import org.junit.Assert;
import org.junit.Test;


// Max 값을 찾고, 작은 값들 중에서 최대값을 찾는다
public class SearchLv1MinimalRectangle {

  public int solution(int[][] sizes) {
    int max = 0;
    int minMax = 0;

    for (int i = 0; i < sizes.length; i++) {
      for (int j = 0; j < sizes[i].length; j++) {
        if (max < sizes[i][j]) {
          max = sizes[i][j];
        }
      }
    }

    for (int i = 0; i < sizes.length; i++) {
      minMax = Math.max(minMax, Math.min(sizes[i][0], sizes[i][1]));
    }
    return max*minMax;
  }

  @Test
  public void TEST() {
    int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
    Assert.assertEquals(4000, solution(arr));
  }
}

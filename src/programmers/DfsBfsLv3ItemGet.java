package programmers;

import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv3ItemGet {
  public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
    int answer = 0;
    return answer;
  }

  @Test
  public void solution() {
    int[][] rectangle = new int[][]{{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
    Assert.assertEquals(17, solution(rectangle, 1, 3, 7, 8));
  }
}

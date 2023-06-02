package programmers;

import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv3ItemGet {

  static int[][] map;
  static int answer;

  public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
    int answer = 0;
    map = new int[101][101];

    for (int i = 0; i < rectangle.length; i++) {
      fill(2*rectangle[i][0], 2*rectangle[i][1], 2*rectangle[i][2], 2*rectangle[i][3]);
    }

    return answer;
  }

  private void fill(int x1, int y1, int x2, int y2) {
    for (int i=x1; i<=x2; i++) {
      for (int j=y1; j<=y2; j++) {
        if(map[i][j] == 2) continue;

        map[i][j]=2;
        if(i==x1 || i == x2 || j == y1 || j == y2) {
          map[i][j] = 1;
        }
      }
    }
  }


  @Test
  public void solution() {
    int[][] rectangle = new int[][]{{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
    Assert.assertEquals(17, solution(rectangle, 1, 3, 7, 8));
  }
}

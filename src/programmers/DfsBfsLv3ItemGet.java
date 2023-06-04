package programmers;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv3ItemGet {

  static int[][] map;
  static int answer;

  public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
    answer = 0;
    map = new int[101][101];

    for (int i = 0; i < rectangle.length; i++) {
      fill(2*rectangle[i][0], 2*rectangle[i][1], 2*rectangle[i][2], 2*rectangle[i][3]);
    }

    bfs(2*characterX, 2*characterY, 2*itemX, 2*itemY);

    return answer/2;
  }

  static int[] dx = {-1, 0, 0, 1};
  static int[] dy = {0, -1, 1, 0};
  private void bfs(int startx, int starty, int itemx, int itemy) {
    boolean[][] visited = new boolean[101][101];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(startx);
    queue.add(starty);

    while(!queue.isEmpty()) {
      int x = queue.poll();
      int y = queue.poll();

      for (int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if(!check(nx, ny)) continue;
        if(map[nx][ny] != 1 || visited[nx][ny]) continue;

        map[nx][ny] = map[x][y]+1;
        if(nx==itemx && ny == itemy) {
          answer = (answer == 0) ? map[nx][ny]:Math.min(answer,map[nx][ny]);
          continue;
        }

        visited[nx][ny] = true;
        queue.add(nx);
        queue.add(ny);
      }
    }
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

  public boolean check(int x, int y){
    if(x<0||y<0||x>100||y>100) return false;
    return true;
  }


  @Test
  public void solution() {
    int[][] rectangle = new int[][]{{1,1,7,4},{3,2,5,5},{4,3,6,9},{2,6,8,8}};
    Assert.assertEquals(17, solution(rectangle, 1, 3, 7, 8));
  }
}

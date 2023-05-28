package programmers;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv2ShortestDistance {

  public int solution(int[][] maps) {
    int n = maps.length;
    int m = maps[0].length;
    int[][] visited = new int[n][m];

    bfs(maps, visited, n, m);
    int answer = visited[n - 1][m - 1];

    return (answer > 0) ? answer : -1;
  }

  // 동서남북
  static int[][] d = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

  public static void bfs(int[][] maps, int[][] visited, int n, int m) {
    int x = 0;
    int y = 0;
    visited[y][x] = 1;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{y, x});

    // 길이 연결되어 있는 동안
    while (!queue.isEmpty()) {
      int[] now = queue.poll();
      int r = now[0];
      int c = now[1];

      // 동서남북 1칸씩 다음 칸으로 이동
      for (int i = 0; i < 4; i++) {
        int dr = r + d[i][0];
        int dc = c + d[i][1];

        // 이동 범위 초과하는지 확인
        if (dr < 0 || dr >= n || dc < 0 || dc >= m) {
          continue;
        }

        // 방문한 적이 없고 길이 있어야 한다
        if(visited[dr][dc] == 0 && maps[dr][dc] == 1) {
          queue.add(new int[] {dr, dc});

          // 이동이 가능하면 현재 visited[dr][dc] 값에 +1 더해준다
          visited[dr][dc] = visited[r][c] + 1;
        }
      }
    }
  }

  @Test
  public void solution() {
    int[][] maps = new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
    Assert.assertEquals(11, solution(maps));

  }
}

package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv2Fatigue {

  static boolean[] visited;
  static int count = 0;

  public int solution(int k, int[][] dungeons) {
    visited = new boolean[dungeons.length];
    dfs(0, k, dungeons);
    return count;
  }

  // dfs : 던전을 깊이우선 탐색한다
  // 1. 탐색이 가능한지 조건을 확인한다
  // 2. 탐색을 완료하며 depth를 +1씩 증가시킨다
  // 3. 현재 depth 값과 최대 max 값을 비교한다
  public void dfs(int depth, int k, int[][] dungeons) {
    for (int i = 0; i < dungeons.length; i++) {
      if(visited[i] || dungeons[i][0] > k) {
        continue;
      }
      visited[i] = true;
      dfs(depth + 1, k - dungeons[i][1], dungeons);
      visited[i] = false;
    }
    count = Math.max(count, depth);
  }

  @Test
  public void solution() {
    int[][] dungeon = {{80,20},{50,40},{30,10}};
    Assert.assertEquals(3, dungeon);
  }
}
